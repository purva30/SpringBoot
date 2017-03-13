package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentDao;
import entity.Student;

@Service
public class StudentService {
	
	
	StudentDao studentDao = new StudentDao();
	
	public Collection<Student> getAllStudents(){
		//Collection<Student> allStudents = studentDao.getAllStudents();
		//return allStudents;
		return studentDao.getAllStudents();
	}
	
	
}
