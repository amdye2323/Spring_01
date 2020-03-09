package com.person.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PersonDAOImpl implements PersonDAO
{

	private JdbcTemplate template;
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void psersonInsert(PersonDTO person) {
		// TODO Auto-generated method stub
		String sql = "insert into person values(?,?,?,?,?)";
		Object[] param = new Object[] {
				person.getId(),
				person.getName(),
				person.getPass(),
				person.getGender(),
				person.getJob()
		};
		int i = template.update(sql,param);
		
	}

	@Override
	public PersonDTO personView(String id) {
		// TODO Auto-generated method stub
		
		String sql = "select * from person where id = ?";
		PersonDTO per = template.queryForObject(sql, new Object[] {id},new PersonRowMapper());
		return per;
	}

	@Override
	public void personUpdate(PersonDTO person) {
		// TODO Auto-generated method stub
		String sql ="update person set name = ? , pass = ? , job = ? where id = ?";
		Object[] param = new Object[] {
				person.getName(),
				person.getPass(),
				person.getJob(),
				person.getId()
		};
		template.update(sql,param);
	}

	@Override
	public void personDelete(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from person where id = ?";
		Object param = id;
		template.update(sql,param);
		
	}
	
	public List<PersonDTO> personList(){
		String sql = "select * from person";
		List<PersonDTO> personlist = template.query(sql,new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
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
		);
		return personlist;
	}
	
}
