package com.boa.crs.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boa.crs.bean.Course;
import com.boa.crs.bean.Professor;
import com.boa.crs.bean.Student;

@Repository
public class AdminCRSDAOImpl implements AdminCRSDAO {

	Logger logger = LoggerFactory.getLogger(AdminCRSDAOImpl.class);
	
	// DI injection of JDBCTemplate
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	

	@Override
	@Transactional
	public void addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		 String SQL = "insert into professor (name) values (?)";
		 jdbcTemplateObject.update( SQL, professor.getName());
		 System.out.println("Created Record Name = " + professor.getName());
		 return;
	}

	@Override
	@Transactional
	public void addCourse(Course course) {
		 String SQL = "insert into course (courseName,fees) values (?,?)";
		 jdbcTemplateObject.update( SQL, course.getCourseName(),course.getFees());
		 System.out.println("Created Record courseName = " + course.getCourseName() + "and Fees of the Course :- "+ course.getFees());
		 return;
	}

	@Override
	@Transactional
	public void removeCourse(int id) {
		String SQL = "delete from course where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	@Override
	public boolean approveStudentRegistration(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void generateReport(int id) {
		// TODO Auto-generated method stub
		
	}
}
