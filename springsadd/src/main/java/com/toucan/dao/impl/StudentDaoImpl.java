/**
 * 
 */
package com.toucan.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toucan.dao.StudentDao;
import com.toucan.model.Student;

/**
 * @author MavJay
 *
 */
@Repository
public class StudentDaoImpl implements StudentDao {
	
	/* (non-Javadoc)
	 * @see com.toucan.dao.StudentDao#addStudent(com.toucan.model.Student)
	 */
	@Autowired
	private SessionFactory session;
	
	@Override
	public void addStudent(Student student) {
		session.getCurrentSession().save(student);
	}

	/* (non-Javadoc)
	 * @see com.toucan.dao.StudentDao#editStudent(com.toucan.model.Student)
	 */
	@Override
	public void editStudent(Student student) {
		session.getCurrentSession().update(student);
	}

	/* (non-Javadoc)
	 * @see com.toucan.dao.StudentDao#deleteStudent(int)
	 */
	@Override
	public void deleteStudent(int studentID) {
		session.getCurrentSession().delete(getStudent(studentID));
	}

	/* (non-Javadoc)
	 * @see com.toucan.dao.StudentDao#getStudent(int)
	 */
	@Override
	public Student getStudent(int studentID) {
		return (Student)session.getCurrentSession().get(Student.class, studentID);
	}

	/* (non-Javadoc)
	 * @see com.toucan.dao.StudentDao#getAllStudents()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
