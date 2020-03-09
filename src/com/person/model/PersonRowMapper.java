package com.person.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<PersonDTO>
{

	@Override
	public PersonDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		PersonDTO per = new PersonDTO();
		per.setId(rs.getString("id"));
		per.setGender(rs.getString("gender"));
		per.setJob(rs.getString("job"));
		per.setName(rs.getString("name"));
		per.setPass(rs.getString("pass"));
		
		return per;
	}

}
