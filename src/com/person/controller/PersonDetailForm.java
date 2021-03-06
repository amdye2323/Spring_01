package com.person.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.person.model.PersonDAOImpl;
import com.person.model.PersonDTO;

public class PersonDetailForm extends AbstractController
{
	private PersonDAOImpl dao;
	

	public void setDao(PersonDAOImpl dao) {
		this.dao = dao;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		PersonDTO per = dao.personView(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("person",per);
		mv.setViewName("WEB-INF/jsp/detail.jsp");
		return mv;
	}
	
}
