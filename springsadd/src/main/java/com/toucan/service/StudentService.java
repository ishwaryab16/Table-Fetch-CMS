/**
 * 
 */
package com.toucan.service;

import java.util.List;

import com.toucan.model.Student;

/**
 * @author MavJay
 *
 */
@SuppressWarnings("rawtypes")
public interface StudentService {
	public void addStudent(Student student);
	public void editStudent(Student student);
	public void deleteStudent(int studentID);
	public Student getStudent(int studentID);
	public List getAllStudents();
}
