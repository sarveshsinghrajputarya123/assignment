/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.crudopperation.service;

import com.crud.crudopperation.model.Student;
import java.util.List;
import java.util.Optional;

public interface Studentservice {
    
     public Student addStudent(Student student);
    
    public String removeStudent(int id);
   
    public Optional<Student> findbyid(int id);
    
    public List<Student> getallStudent();
    public String updateStudent(int id,Student student);
}


