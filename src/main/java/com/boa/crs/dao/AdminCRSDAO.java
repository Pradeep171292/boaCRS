/**
 * 
 */
package com.boa.crs.dao;

import com.boa.crs.bean.Course;
import com.boa.crs.bean.Professor;
import com.boa.crs.bean.Student;

/**
 * @author Admin
 *
 */
public interface AdminCRSDAO {
	
	 public void addProfessor(Professor professor);
	 public void addCourse(Course course);
	 public void removeCourse(int id);
	 public boolean approveStudentRegistration(Student student);
	 public void generateReport(int id);

}
