/**
 * 
 */
package com.toucan.dao;

import java.util.List;

import com.toucan.model.Student;

/**
 * @author MavJay
 *
 */
public interface StudentDao {
	public void addStudent(Student student);
	public void editStudent(Student student);
	public void deleteStudent(int studentID);
	public Student getStudent(int studentID);
	public List<Student> getAllStudents();
}
