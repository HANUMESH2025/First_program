package com.hanu.Hanumesh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hanu.spring_first_step.Employee;

@RestController
public class StudentController {
	@GetMapping("/Student")
	public Student getStudent() {
		return new Student("hanu", "jaya");
	}	
		
		@GetMapping("/Students")
		public List<Student> getSudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student("ramu", "somu"));
		students.add(new Student("ramu1", "somu1"));
		students.add(new Student("ramu2", "somu2"));
		students.add(new Student("ramu3", "somu3"));
		students.add(new Student("ramu4", "somu4"));
		return students;
		}
		
		@GetMapping("Student/{firstName}/{lastName}")
		public Student getPathVari(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
			return new Student(firstName, lastName);
		}
		
		@GetMapping("/Employee")
		public Employee getEmployee() {
			return new Employee(1, "jaya");
		}
		
		@GetMapping("/Employee/{id}/{name}")
		public Employee pra(@PathVariable("id") int id, @PathVariable("name") String name) {
			System.out.println("id..."+id+"name..."+name);
			return new Employee(id, name);
		}
		
		@GetMapping("/Employes")
		public List<Employee> getEmployee1(){
			List<Employee> employes=new ArrayList<>();
			employes.add(new Employee(0, "hanu"));
			employes.add(new Employee(1, "hanu1"));
			employes.add(new Employee(2, "hanu2"));
			employes.add(new Employee(3, "hanu3"));
			return employes;
		}
		
		
		
		
	}


