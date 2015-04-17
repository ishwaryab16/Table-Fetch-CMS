package com.toucan.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toucan.dao.AppfeedbackDAO;
import com.toucan.model.Appfeedback;
import com.toucan.model.ComplaintsView;

@Repository
public class AppfeedbackDAOImpl implements AppfeedbackDAO {

	@Autowired
	private SessionFactory session;
	@SuppressWarnings("unchecked")
	@Override
	public List<ComplaintsView> getAll() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from ComplaintsView").list();
	}

}
