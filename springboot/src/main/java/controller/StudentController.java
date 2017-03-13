package controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entity.Student;
import service.StudentService;


@RestController
@RequestMapping(value = "/students")
public class StudentController {
	
	
	StudentService studentService = new StudentService();
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		//Collection<Student> allStudents = studentDao.getAllStudents();
		//return allStudents;
		return studentService.getAllStudents();
	}
	

}
