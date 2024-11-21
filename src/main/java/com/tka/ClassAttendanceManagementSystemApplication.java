package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ClassAttendanceManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassAttendanceManagementSystemApplication.class, args);
		System.out.println("Hello");
	}

}
