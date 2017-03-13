package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import entity.Student;

@Repository
public class StudentDao {
	
	private static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>();
		students.put(1, new Student(1, "Amey", "dbms"));
		students.put(2, new Student(2, "Vishwas", "network"));
		students.put(3, new Student(3, "Ajju", "physics"));
	}
	
	public Collection<Student> getAllStudents(){
		return students.values();
	}
	
	
}
