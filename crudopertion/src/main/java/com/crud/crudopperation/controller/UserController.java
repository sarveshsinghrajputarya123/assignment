/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crudopperation.controller;

import com.crud.crudopperation.model.Student;
import com.crud.crudopperation.serviceImp.Studentserviceimp;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
public class UserController {
    
    
    
      @Autowired
     private Studentserviceimp stuudentserviceimp;
    
    
    @PostMapping("/addstu")
    public ResponseEntity<Student> addestudent(@RequestBody Student student){
        Student stu=stuudentserviceimp.addStudent(student);
        return new ResponseEntity<>(stu,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/deletestu/{id}")
    public ResponseEntity<String> removestudent(@PathVariable int id){
        stuudentserviceimp.removeStudent(id);
        return new ResponseEntity<>("remove sucess",HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/findstu/{id}")
     public ResponseEntity<Optional<Student>> findstudentbyid(@PathVariable int id){
         Optional<Student> emps=stuudentserviceimp.findbyid(id);
         return new ResponseEntity<>(emps,HttpStatus.ACCEPTED);
     }
     
     @GetMapping("/all")
     public ResponseEntity<List<Student>> listofstudent(){ 
         List<Student> lstudent=stuudentserviceimp.getallStudent();
         return new ResponseEntity<>(lstudent,HttpStatus.ACCEPTED);
     }
     
     @PutMapping("/update/{id}")
     public ResponseEntity<String> updatestudent(@PathVariable int id,@RequestBody Student student ){
        String a= stuudentserviceimp.updateStudent(id, student);
        return new ResponseEntity<>(a,HttpStatus.ACCEPTED);
     }

}
