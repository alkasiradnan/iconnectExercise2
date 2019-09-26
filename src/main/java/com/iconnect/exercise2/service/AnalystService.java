package com.iconnect.exercise2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iconnect.exercise2.entity.Analyst;
import com.iconnect.exercise2.repository.AnalystRepository;

@Service
public class AnalystService {

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
