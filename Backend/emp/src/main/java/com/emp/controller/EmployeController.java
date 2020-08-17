package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employe;
import com.emp.service.EmployeService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EmployeController {

   @Autowired
   private EmployeService EmployeService;

 
   /*---get all employees---*/
   @GetMapping("/employe")
   public ResponseEntity<List<Employe>> list() {
      List<Employe> list = EmployeService.list();
      return ResponseEntity.ok().body(list);
   }

   /*---Get a an employee by  id---*/
   @GetMapping("/employe/{id}")
   public ResponseEntity<Employe> get(@PathVariable("id") long id) {
	   Employe Employe = EmployeService.get(id);
      return ResponseEntity.ok().body(Employe);
   }
   
   /*---Add new employee---*/
   @PostMapping("/employe")
   public ResponseEntity<?> save(@RequestBody Employe Employe) {
      long id = EmployeService.save(Employe);
      return ResponseEntity.ok().body("New employee has been saved with ID:" + id);
   }
   
   /*---Update an employee by id---*/
   @PutMapping("/employe/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Employe Employe) {
	   EmployeService.update(id, Employe);
      return ResponseEntity.ok().body("employee has been updated successfully.");
   }

   /*---Delete an employee by id---*/
   @DeleteMapping("/employe/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
	   EmployeService.delete(id);
      return ResponseEntity.ok().body("employee has been deleted successfully.");
   }
   
  
}
