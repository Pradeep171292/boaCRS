package com.boa.crs.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.boa.crs.bean.Course;
import com.boa.crs.bean.Grade;
import com.boa.crs.bean.Student;
import com.boa.crs.mapper.CourseMapper;
import com.boa.crs.mapper.GradeMapper;
import com.boa.crs.mapper.StudentMapper;

public class StudentCRSDAOImpl implements StudentCRSDAO{

	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	@Transactional
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

		
		String SQL = "insert into student (id, name) values (?, ?)";

		jdbcTemplateObject.update(SQL, student.getId(), student.getName());
		System.out.println("Added Student Id = " + student.getId() + " Name = " + student.getName());

		return;

	}

	@Override
	public List<Student> listOfStudent() {
		// TODO Auto-generated method stub
		String SQL = "select * from student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new StudentMapper());
		return student;
	}

	@Override
	public List<Course> listOfCourse(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from course where studentId = ?";
		List<Course> courses = jdbcTemplateObject.query(SQL, new CourseMapper());
		return courses;
	}

	@Override
	public List<Grade> listOfGrade(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from grade where studentId = ?";
		List<Grade> grades = jdbcTemplateObject.query(SQL, new GradeMapper());
		return grades;
	}

	@Override
	public void addCourse(Course course, int studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCourse(int studentId, int courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payFees(int studentId, int courseId, boolean payOnline) {
		// TODO Auto-generated method stub
		
	}

}
