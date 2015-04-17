package com.toucan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toucan.dao.AppfeedbackDAO;
import com.toucan.dao.ComplaintsViewDAO;
import com.toucan.model.ComplaintsView;
import com.toucan.service.ComplaintsViewServ;

@Service
public class ComplaintsViewServImpl implements ComplaintsViewServ {

	@Autowired
	private ComplaintsViewDAO cvDAO;

	@Override
	@Transactional
	public List<ComplaintsView> getAll() {
		// TODO Auto-generated method stub
		return cvDAO.getAll();
	}

}
