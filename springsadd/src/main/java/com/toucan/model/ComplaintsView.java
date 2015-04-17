package com.toucan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complaints")
public class ComplaintsView {

//	@Id
//	@Column
//	private int id;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getFeedbacktime() {
		return feedbacktime;
	}

	public void setFeedbacktime(String feedbacktime) {
		this.feedbacktime = feedbacktime;
	}

	public String getTicketid() {
		return ticketid;
	}

	public void setTicketid(String ticketid) {
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

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
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
	public ComplaintsView(){}
	public ComplaintsView(int id, String emailid, String rating,
			String comments, String feedbacktime, String ticketid,
			String ticketstatus, String source, String sentiment,
			String priority, String department) {
		super();
//		this.id = id;
		this.emailid = emailid;
		this.rating = rating;
		this.feedbacktime = feedbacktime;
		this.ticketid = ticketid;
		this.ticketstatus = ticketstatus;
		this.source = source;
		this.sentiment = sentiment;
		this.priority = priority;
		this.department = department;
	}

	@Column
	private String emailid;
	@Column
	private String rating;
	
	@Column
	private String feedbacktime;
	@Id
	@Column
	private String ticketid;
	@Column
	private String ticketstatus;
	@Column
	private String source;
	@Column
	private String sentiment;
	@Column
	private String priority;
	@Column
	private String department;

}
