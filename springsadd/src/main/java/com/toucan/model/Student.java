/**
 * 
 */
package com.toucan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Srivatsan
 *
 */
@Entity
public class Student {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // for auto
	private int studentID;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private int yearLevel;
	public Student(){}
	public Student(int studentID, String firstName, String lastName,
			int yearLevel) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearLevel = yearLevel;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
	
}
