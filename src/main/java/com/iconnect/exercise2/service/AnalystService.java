package com.iconnect.exercise2.service;

import java.util.List;

import com.iconnect.exercise2.entity.Analyst;


public interface AnalystService {
	public List<Analyst> getAllAnalyst();
	public void saveAnalyst(Analyst analyst);
}
