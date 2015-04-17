/**
 * 
 */
package com.toucan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toucan.dao.StudentDao;
import com.toucan.model.Student;
import com.toucan.service.StudentService;

/**
 * @author MavJay
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	/* (non-Javadoc)
	 * @see com.toucan.service.StudentService#addStudent(com.toucan.model.Student)
	 */
	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	/* (non-Javadoc)
	 * @see com.toucan.service.StudentService#editStudent(com.toucan.model.Student)
	 */
	@Transactional
	public void editStudent(Student student) {
		studentDao.editStudent(student);
	}

	/* (non-Javadoc)
	 * @see com.toucan.service.StudentService#deleteStudent(int)
	 */
	@Transactional
	public void deleteStudent(int studentID) {
		studentDao.deleteStudent(studentID);
	}

	/* (non-Javadoc)
	 * @see com.toucan.service.StudentService#getStudent(int)
	 */
	@Transactional
	public Student getStudent(int studentID) {
		return studentDao.getStudent(studentID);
	}

	/* (non-Javadoc)
	 * @see com.toucan.service.StudentService#getAllStudents()
	 */
	@Transactional
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
	
}
