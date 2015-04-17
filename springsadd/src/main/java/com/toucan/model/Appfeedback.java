package com.toucan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Appfeedback {

	@Id @GeneratedValue
	@Column
	private int id;

	@Column
	private String emailid;
	@Column
	private String rating;
	@Column
	private String comments;
	@Column
	private String catg1;
	@Column
	private String catg2;
	@Column
	private String catg3;
	@Column
	private String catg4;
	@Column
	private String catg5;
	@Column
	private String subcatg;
	@Column
	private String feedbacktime;
	@Column
	private String uploadtime;
	@Column
	private String clientid;
	@Column
	private String feedbackid;


	public Appfeedback() {
	}

	public Appfeedback(int id, String emailid, String rating, String comments,
			String catg1, String catg2, String catg3, String catg4,
			String catg5, String subcatg, String feedbacktime,
			String uploadtime, String clientid, String feedbackid) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.rating = rating;
		this.comments = comments;
		this.catg1 = catg1;
		this.catg2 = catg2;
		this.catg3 = catg3;
		this.catg4 = catg4;
		this.catg5 = catg5;
		this.subcatg = subcatg;
		this.feedbacktime = feedbacktime;
		this.uploadtime = uploadtime;
		this.clientid = clientid;
		this.feedbackid = feedbackid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmaild() {
		return emailid;
	}

	public void setEmaild(String emailid) {
		this.emailid = emailid;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCatg1() {
		return catg1;
	}

	public void setCatg1(String catg1) {
		this.catg1 = catg1;
	}

	public String getCatg2() {
		return catg2;
	}

	public void setCatg2(String catg2) {
		this.catg2 = catg2;
	}

	public String getCatg3() {
		return catg3;
	}

	public void setCatg3(String catg3) {
		this.catg3 = catg3;
	}

	public String getCatg4() {
		return catg4;
	}

	public void setCatg4(String catg4) {
		this.catg4 = catg4;
	}

	public String getCatg5() {
		return catg5;
	}

	public void setCatg5(String catg5) {
		this.catg5 = catg5;
	}

	public String getSubcatg() {
		return subcatg;
	}

	public void setSubcatg(String subcatg) {
		this.subcatg = subcatg;
	}

	public String getFeedbacktime() {
		return feedbacktime;
	}

	public void setFeedbacktime(String feedbacktime) {
		this.feedbacktime = feedbacktime;
	}

	public String getUploadtime() {
		return uploadtime;
	}

	public void setUploadtime(String uploadtime) {
		this.uploadtime = uploadtime;
	}

	public String getClientid() {
		return clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
	}

	public String getFeedbackid() {
		return feedbackid;
	}

	public void setFeedbackid(String feedbackid) {
		this.feedbackid = feedbackid;
	}
}
