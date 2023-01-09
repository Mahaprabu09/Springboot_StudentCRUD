package com.Springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Springboot.entity.Student;
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
