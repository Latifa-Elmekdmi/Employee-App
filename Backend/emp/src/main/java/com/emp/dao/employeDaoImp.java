package com.emp.dao;


import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.emp.model.Employe;

@Repository
public class employeDaoImp implements employeDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Employe Employe) {
      sessionFactory.getCurrentSession().save(Employe);
      return Employe.getId();
   }

   @Override
   public Employe get(long id) {
      return sessionFactory.getCurrentSession().get(Employe.class, id);
   }

   @Override
   public List<Employe> list() {
      List<Employe> list = sessionFactory.getCurrentSession().createQuery("from Employe",Employe.class).list();
      return list;
   }

   @Override
   public void update(long id, Employe Employe) {
      Session session = sessionFactory.getCurrentSession();
      Employe Employe2 = session.byId(Employe.class).load(id);
      Employe2.setCin(Employe.getCin());
      Employe2.setNom(Employe.getNom());
      Employe2.setPrenom(Employe.getPrenom());
      
      session.flush();
   }

   @Override
   public void delete(long id) {
	   Employe Employe = sessionFactory.getCurrentSession().byId(Employe.class).load(id);
      sessionFactory.getCurrentSession().delete(Employe);
   }

}