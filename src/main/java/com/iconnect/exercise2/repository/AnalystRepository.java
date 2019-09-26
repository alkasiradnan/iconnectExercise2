package com.iconnect.exercise2.repository;

import org.springframework.data.repository.CrudRepository;

import com.iconnect.exercise2.entity.Analyst;

public interface AnalystRepository extends CrudRepository<Analyst,String>{
	
}
