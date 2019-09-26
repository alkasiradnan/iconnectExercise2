package com.iconnect.exercise2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iconnect.exercise2.entity.Analyst;
import com.iconnect.exercise2.repository.AnalystRepository;

@Repository
public class AnalystDAOImpl implements AnalystDAO {
	
	@Autowired
	private AnalystRepository analystRepository;

	public List<Analyst> getAllAnalyst() {
		List<Analyst> analystList = new ArrayList<>();
		analystRepository.findAll().forEach(analystList::add);
		return analystList;
	}
	
	public void saveAnalyst(Analyst analyst) {
		analystRepository.save(analyst);
	}


}
