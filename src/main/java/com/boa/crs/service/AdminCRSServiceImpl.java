package com.boa.crs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.crs.bean.Course;
import com.boa.crs.bean.Professor;
import com.boa.crs.dao.AdminCRSDAO;

@Service
public class AdminCRSServiceImpl implements AdminCRSService {

	@Autowired
	private AdminCRSDAO adminCRSDao;
	
	@Override
	public void addProfessor() {
		System.out.println("creating professor");
		Professor professor = new Professor();
		professor.setName("Thomas");
		adminCRSDao.addProfessor(professor);
		Professor professor1 = new Professor();
		professor1.setName("Amit");
		adminCRSDao.addProfessor(professor1);
	}

	@Override
	public void addCourse() {
		// TODO Auto-generated method stub
		System.out.println("creating Course");
		Course course = new Course();
		course.setCourseName("Java");
		course.setFees(5000.00);
		adminCRSDao.addCourse(course);
		Course course1 = new Course();
		course1.setCourseName("Paython");
		course1.setFees(4000.00);
		adminCRSDao.addCourse(course1);
		
	}

	@Override
	public void removeCourse() {
		// TODO Auto-generated method stub
		System.out.println("Remove Course");
		adminCRSDao.removeCourse(2);
	}

	@Override
	public void approveStudentRegistration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateReport() {
		// TODO Auto-generated method stub
		
	}
}
