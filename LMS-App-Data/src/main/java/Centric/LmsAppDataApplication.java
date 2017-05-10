package Centric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"Centric", "EmployeePackage", "LeavesPackage", "AttendancePackage", "Utility"})
public class LmsAppDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsAppDataApplication.class, args);
	}
}
