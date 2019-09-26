package com.iconnect.exercise2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iconnect.exercise2.dao.AnalystDAO;
import com.iconnect.exercise2.entity.Analyst;

@Service
public class AnalystServiceImpl implements AnalystService {

	@Autowired
	private AnalystDAO analystDAO;

	public List<Analyst> getAllAnalyst() {

		List<Analyst> analystList = new ArrayList<>();
		analystList = analystDAO.getAllAnalyst();
		
		return analystList;
	}

	public void saveAnalyst(Analyst analyst) {
		analystDAO.saveAnalyst(analyst);
		
	}

}
