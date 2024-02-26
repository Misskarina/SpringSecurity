package com.karina.springsecurity;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
	
	@Autowired
	StudentRepository srepo;
	@RequestMapping("/test")
	public String test()
	{
		return"data saved";
	}
	@RequestMapping("/save")
	public String save()
	{
		Student s=new Student();
		StudentDetails sd=new StudentDetails();
		Studentfamily sf=new Studentfamily();
		s.setName("jaydeep");
		s.setAge(16);
		sd.setAddress("Baddiha");
		sd.setFathername("Mr.Pradeep");
		sd.setPhone_no(789065);
		sf.setBrother("Rajdeep");
		sf.setMother("Rina devi");
		s.setStudentdetails(sd);
		s.setStudentfamily(sf);	
		srepo.save(s);
		return "data is save.....";
	}
	@RequestMapping("/{id:[0-9]}")
	public Student byid(@PathVariable int id)
	
	{
		return srepo.findById(id);
	}
	
	
}
