package com.boa.crs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.boa.crs.config.AppConfig;
import com.boa.crs.service.AdminCRSService;
import com.boa.crs.service.AdminCRSServiceImpl;


@SpringBootApplication
@EnableAutoConfiguration
public class CrsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CrsApplication.class, args);
		ApplicationContext context=SpringApplication.run(AppConfig.class);
		//context.getBean(AdminCRSService.class);
		AdminCRSService adminService = 
				context.getBean(AdminCRSServiceImpl.class);
					
		// method call here 
		runAdminOpration(adminService);
		
		
	}

	private static void runAdminOpration(AdminCRSService adminService) {
		// TODO Auto-generated method stub
		adminService.addCourse();
		adminService.addProfessor();
		adminService.removeCourse();
	}

}
