package com.toucan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toucan.dao.AppfeedbackDAO;
import com.toucan.dao.ComplaintlistDAO;
import com.toucan.service.AppfeedbackServ;

@Service
public class AppfeedbackServImpl implements AppfeedbackServ {

	@Autowired
	private AppfeedbackDAO appDAO;

	@SuppressWarnings("rawtypes")
	@Override
	@Transactional
	public List getAll() {
		// TODO Auto-generated method stub
		return appDAO.getAll();
	}
}
