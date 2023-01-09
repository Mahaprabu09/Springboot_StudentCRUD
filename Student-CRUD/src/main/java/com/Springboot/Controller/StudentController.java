package com.Springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.entity.Student;
import com.Springboot.service.StudentService;
@RestController
@Service
@RequestMapping("/Student_crud")
public class StudentController {
	@Autowired(required = false)
	StudentService studentService;
	
	@PutMapping("/student")
	private int saveStudent(@RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return student.getId();
	}
	@GetMapping("/student/{id}")
	private Student getStudent(@PathVariable("id")int id) {
	return studentService.getStudentByid(id);
	}
	
	@GetMapping("/student_list")
	private List<Student> getAllStudents(){
	return studentService.getAllStudents();
	}
	
	@PutMapping("/stud")
	private Student update(@RequestBody Student s) {
	studentService.saveOrUpdate(s);
	return s;
	}
	
	@DeleteMapping("/student/{id}")
	private void deleteStudent(@PathVariable("id") int id) {
	studentService.delete(id);
	}


}
