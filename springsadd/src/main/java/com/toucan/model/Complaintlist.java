package com.toucan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Complaintlist {

	@Id @GeneratedValue
	@Column
	private int ticketid;
	@Column
	private String ticketstatus;
	@Column
	private String source;
	@Column
	private String priority;
	@Column
	private String department;
	@Column
	private String assignedto;
	@Column
	private String reviewedby;
	@Column
	private String keywords;

	

	public Complaintlist() {
	}

	public Complaintlist(int ticketid, String ticketstatus, String source,
			String priority, String department, String assignedto,
			String reviewedby, String keywords, String privatecomment) {
		super();
		this.ticketid = ticketid;
		this.ticketstatus = ticketstatus;
		this.source = source;
		this.priority = priority;
		this.department = department;
		this.assignedto = assignedto;
		this.reviewedby = reviewedby;
		this.keywords = keywords;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public String getTicketstatus() {
		return ticketstatus;
	}

	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}

	public String getReviewedby() {
		return reviewedby;
	}

	public void setReviewedby(String reviewdby) {
		this.reviewedby = reviewdby;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
}
