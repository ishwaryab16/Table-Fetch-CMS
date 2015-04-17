package com.toucan.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toucan.dao.ComplaintlistDAO;
import com.toucan.model.Complaintlist;

@Repository
public class ComplaintlistDAOImpl implements ComplaintlistDAO {

	@Autowired
	private SessionFactory session;
	@SuppressWarnings("unchecked")
	@Override
	public List<Complaintlist> getAll() {
		// TODO Auto-generated method stub
		return  session.getCurrentSession().createQuery("from Complaintlist").list();
	}

}
