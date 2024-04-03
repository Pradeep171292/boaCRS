/**
 * 
 */
package com.boa.crs.service;

import java.util.List;

import com.boa.crs.bean.Course;
import com.boa.crs.bean.Grade;
import com.boa.crs.bean.Student;

/**
 * @author Admin
 *
 */
public interface StudentCRSService {
	
	public void addStudent(Student student);
	public List<Student> listStudents ();
	public Student getStudent (Integer id);
	public List<Grade> getStudentGrades (Integer id);
	public List<Course> getStudentCourses (Integer id);

}
