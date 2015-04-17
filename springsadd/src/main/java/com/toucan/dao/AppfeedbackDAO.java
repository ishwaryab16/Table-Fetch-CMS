package com.toucan.dao;

import java.util.List;

import com.toucan.model.ComplaintsView;

public interface AppfeedbackDAO {

	public List<ComplaintsView> getAll();
}
