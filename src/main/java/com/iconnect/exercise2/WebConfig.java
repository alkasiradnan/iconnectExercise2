package com.iconnect.exercise2;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	@SuppressWarnings("deprecation")
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

	    //set path extension to true
	    configurer.favorPathExtension(true).
	    //set favor parameter to false
	    favorParameter(false).
	    //ignore the accept headers
	    ignoreAcceptHeader(true).
	    //dont use Java Activation Framework since we are manually specifying the mediatypes required below
	    useJaf(false).
	    defaultContentType(MediaType.APPLICATION_XML).
	    mediaType("xml", MediaType.APPLICATION_XML).
	    mediaType("json", MediaType.APPLICATION_JSON);
	  }
	
	
	  @Autowired
	  private ObjectMapper mapper;

	   @Override
	  public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
	   converters.replaceAll(c -> {
	    if (c instanceof MappingJackson2HttpMessageConverter) {

	     MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(mapper) {
	      protected void writePrefix(JsonGenerator generator, Object object) throws IOException {
	       RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
	       if (attributes != null && attributes instanceof ServletRequestAttributes) {
	        String attribute = ((ServletRequestAttributes) attributes).getRequest().getParameter("pretty");
	        if (attribute != null) {
	         generator.setPrettyPrinter(new DefaultPrettyPrinter());
	        }
	       }
	       super.writePrefix(generator, object);
	      }
	     };
	     return converter;
	    } else {
	     return c;
	    }
	   });
	  }
	
}
