package com.emp.dao;

import java.util.List;

import com.emp.model.Employe;

public interface employeDao {

   long save(Employe Employe);

   Employe get(long id);

   List<Employe> list();

   void update(long id, Employe Employe);

   void delete(long id);

}
