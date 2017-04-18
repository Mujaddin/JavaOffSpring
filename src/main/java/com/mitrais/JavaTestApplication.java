package com.mitrais;

import java.sql.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaTestApplication {

	@Autowired
EmployeeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(JavaTestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner getBean(){
		return args->{
			
			Karyawan karyawan= new Karyawan();
			karyawan.setFirstName("Muhasmmad");
			karyawan.setGender("male");
			karyawan.setLastName("Roni");
			karyawan.setDob(new Date(41241214));
			employeeRepository.save(karyawan);
		};
	}
}
