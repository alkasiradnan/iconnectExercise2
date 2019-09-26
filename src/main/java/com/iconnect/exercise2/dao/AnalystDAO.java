package com.iconnect.exercise2.dao;

import java.util.List;

import com.iconnect.exercise2.entity.Analyst;

public interface AnalystDAO {

	public List<Analyst> getAllAnalyst();
	public void saveAnalyst(Analyst analyst);
}
