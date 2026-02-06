package com.example.demo;
//CONSTUCTOR USING FIELDS
//CONSTRUCTION INJECTION
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;


@SpringBootApplication
public class FirstApppApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FirstApppApplication.class, args);
		Student st = ac.getBean(Student.class);
		st.study();
		st.useLaptop();
	}

}
