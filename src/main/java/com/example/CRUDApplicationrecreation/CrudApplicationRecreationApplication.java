package com.example.CRUDApplicationrecreation;

import jakarta.servlet.annotation.WebServlet;
import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplicationRecreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplicationRecreationApplication.class, args);
	}

//	@Bean
//	ServletRegistrationBean h2servletRegistration(){
//		ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebdavServlet());
//		registrationBean.addUrlMappings("/console/*");
//		return registrationBean;
//	}
}
