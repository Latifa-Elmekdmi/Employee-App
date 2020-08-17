package com.emp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.Employe;
import com.emp.dao.employeDao;

@Service
@Transactional
public class EmployeServiceImp implements EmployeService{
	
	

	   @Autowired
	   private employeDao employeDao;

	   @Transactional
	   @Override
	   public long save(Employe Employe) {
	      return employeDao.save(Employe);
	   }

	   @Override
	   public Employe get(long id) {
	      return employeDao.get(id);
	   }

	   @Override
	   public List<Employe> list() {
	      return employeDao.list();
	   }

	   @Transactional
	   @Override
	   public void update(long id, Employe Employe) {
		   employeDao.update(id, Employe);
	   }

	   @Transactional
	   @Override
	   public void delete(long id) {
		   employeDao.delete(id);
	   }

	

}
