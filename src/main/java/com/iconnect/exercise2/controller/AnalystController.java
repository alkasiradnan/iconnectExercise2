package com.iconnect.exercise2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iconnect.exercise2.entity.Analyst;
import com.iconnect.exercise2.service.AnalystService;

@RestController
public class AnalystController {

	@Autowired
	private AnalystService analystService;

	@RequestMapping(value = "/analystList",method = RequestMethod.GET,produces= {"application/json","application/xml"})
	public List<Analyst> getAllTopics() {
		return analystService.getAllAnalyst();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/analyst")
	public void saveAnalyst(@RequestBody Analyst analyst) {

		analystService.saveAnalyst(analyst);
	}

}
