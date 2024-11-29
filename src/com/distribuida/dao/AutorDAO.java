package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Autor;

public interface AutorDAO {
	
	List<Autor> findAll();
	
	 public Autor findOne(int id);
	
	 public void add(Autor autor); //Autor DAO

	public void up(Autor autor);
	
	 public void del(int id);

}
