package com.person.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.person.model.PersonDAOImpl;
import com.person.model.PersonDTO;

public class PersonInsertForm extends AbstractController
{
	
	private PersonDAOImpl dao;
	

	public void setDao(PersonDAOImpl dao) {
		this.dao = dao;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		PersonDTO per = new PersonDTO();
		System.out.println("ddd");
		per.setId(req.getParameter("id"));
		per.setGender(req.getParameter("gender"));
		per.setJob(req.getParameter("job"));
		per.setName(req.getParameter("name"));
		per.setPass(req.getParameter("pass"));	
		
		dao.psersonInsert(per);
		
		return new ModelAndView("redirect:personList.sp");
	}

}
