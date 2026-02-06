package com.example.demo;
import org.springframework.stereotype.*;
//import org.springframework.beans.factory.annotation.Autowired;


@Component
public class Student {
	
	Laptop ref;
	void study() {
		System.out.println("Student is studying");
	}
	
	void useLaptop() {
		ref.work();
	}

	public Student(Laptop ref) {
		
		this.ref = ref;
	}
	
	
}
