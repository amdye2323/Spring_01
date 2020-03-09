package com.person.model;

public interface PersonDAO 
{
	//추가
	public void psersonInsert(PersonDTO person);
	//상세보기
	public PersonDTO personView(String id);
	//수정
	public void personUpdate(PersonDTO person);
	//삭제
	public void personDelete(String id);
	
}
