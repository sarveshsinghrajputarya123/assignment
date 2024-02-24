/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.crudopperation.repository;

import com.crud.crudopperation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author acer
 */
public interface Studentrepo extends JpaRepository<Student, Integer>{

    
}
