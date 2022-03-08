package com.javainuse.service;

import org.springframework.stereotype.Service;

import com.javainuse.model.SportsStu;
import com.javainuse.model.Student;

@Service
public class StudentService {
	
	Student s;
	SportsStu sm;
	
	public void study(String sub) {
		s=new Student();
		s.study(sub);
	}

	public void study(String sub,double score) {
		sm=new SportsStu();
		sm.study(sub, score);
	}
}
