/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crudopperation.serviceImp;

import com.crud.crudopperation.model.Student;
import com.crud.crudopperation.repository.Studentrepo;
import com.crud.crudopperation.service.Studentservice;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class Studentserviceimp implements Studentservice{
 @Autowired
    private Studentrepo studentrepo;
    
    
    
    @Override
    public Student addStudent(Student student) {
         Student stu=   studentrepo.save(student);
        return stu;
    }

    @Override
    public String removeStudent(int id) {
            studentrepo.deleteById(id);
       return "delete data successsfully";
    }

    @Override
    public Optional<Student> findbyid(int id) {
         Optional<Student> student=  studentrepo.findById(id);
        if(student.isPresent()){
            return student;
        }else{
         return null;   
        }
    }

    @Override
    public List<Student> getallStudent() {
          List<Student> studentlist =studentrepo.findAll();
        return studentlist;
    }

    @Override
    public String updateStudent(int id, Student student) {
        Optional<Student> stu=studentrepo.findById(id);
        if(stu.isPresent()){
            Student exitStu=stu.get();
          exitStu.setName(student.getName());
          exitStu.setAge(student.getAge());
          exitStu.setAddress(student.getAddress());
          exitStu.setSalary(student.getSalary());
          
            studentrepo.save(exitStu);
            
            
            
            return "update  sucessfully";
        }
        else{
            
            return "student not found";
        }
    }
    
}
