package com.boa.crs.service;

import java.util.List;

import com.boa.crs.bean.Course;
import com.boa.crs.bean.Grade;
import com.boa.crs.bean.Student;
import com.boa.crs.dao.StudentCRSDAO;
import com.boa.crs.dao.StudentCRSDAOImpl;

public class StudentCRSServiceImpl implements StudentCRSService {

	StudentCRSDAO dao = new StudentCRSDAOImpl();
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.addStudent(student);
		
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return dao.listOfStudent();
	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return dao.getStudent(id);
	}

	@Override
	public List<Grade> getStudentGrades(Integer id) {
		// TODO Auto-generated method stub
		return dao.listOfGrade(id);
	}

	@Override
	public List<Course> getStudentCourses(Integer id) {
		// TODO Auto-generated method stub
		return dao.listOfCourse(id);
	}

}
