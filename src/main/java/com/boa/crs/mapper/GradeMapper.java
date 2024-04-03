package com.boa.crs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.boa.crs.bean.Grade;


public class GradeMapper implements RowMapper<Grade> {

	@Override
	public Grade mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Grade grade = new Grade();
		grade.setCourseid(rs.getInt("id"));
		grade.setGrade(rs.getString("grade"));
		return grade;
	}

}
