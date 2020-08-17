package com.emp.service;

import java.util.List;

import com.emp.model.Employe;

public interface EmployeService {

	
	 long save(Employe Employe);

	   Employe get(long id);

	   List<Employe> list();

	   void update(long id, Employe Employe);

	   void delete(long id);
}
