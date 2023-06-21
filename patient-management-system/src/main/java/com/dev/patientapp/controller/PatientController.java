package com.dev.patientapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.dev.patientapp.dto.PatientDTO;
import com.dev.patientapp.service.PatientService;



@Controller
@RequestMapping("/")
@Component
public class PatientController {
	
	@Autowired
	PatientService service;
	
	public PatientController() {
		System.out.println("patient controller method stareted");
	}
	
	@PostMapping("/registerPatient")
	public String registerLaptop(@ModelAttribute PatientDTO dto, HttpServletRequest req) {
		System.out.println("inside register patient details");
		
		System.out.println("registering data");
		
		service.validateAndSave(dto);
		
		req.setAttribute("name",dto.getPatientName());	
		
		return "success";
		
	}
	
	@GetMapping(value="/listofPatients")
	public String getLaptop(HttpServletRequest req) {
		
		System.out.println("inside list of patients method");
		
		List<PatientDTO> str=service.validateAndGet();
		
		req.setAttribute("data",str);
		
		return "success2";
		
	}
	
	@GetMapping(value="/searchByPatientName")
	public String searchCompanyName(@RequestParam("patientName") String patientName,HttpServletRequest req) {
		
		System.out.println("inside the search patient method");
	
		List<PatientDTO> str=service.getByPatientName(patientName);
		
		req.setAttribute("data", str);
		
		return "success2";
		
	}
	
	@GetMapping(value="/Update/{patientId}")
	public String updateById(@PathVariable("patientId") int id,HttpServletRequest req) {
		
		System.out.println("update by id");
		
		PatientDTO str= service.getPatientId(id);
		
		req.setAttribute("patient", str);
	
		
		return "update_patient";
		
	}
	
	@GetMapping(value="updatePatient")
	public String update(@ModelAttribute PatientDTO dto,HttpServletRequest req) {
		
		System.out.println("update done by id");
		
		service.updateById(dto);
		
		req.setAttribute("patient", dto);
	
	
		return "success";
		
	}
	
	@GetMapping(value="/Delete/{patientId}")
	public RedirectView DeleteById(@PathVariable("patientId") int id,HttpServletRequest req) {
		
		System.out.println("delete by id");
		
		PatientDTO str= service.DeletePatientId(id);
	
		req.setAttribute("patient", str);
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(req.getContextPath());
		redirectView.setUrl(req.getContextPath()+"/listofPatients");
		
		return redirectView ;
		
	}
	
	

}
