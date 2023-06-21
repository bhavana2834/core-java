package com.dev.patientapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class PatientWebInIt extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("get root config classes method started");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("get servlet config classes method started");
		return new Class[] {SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("get servlet mapping method started ");
		return new String[] {"/"};
	}

	
	
	
	
	
}
