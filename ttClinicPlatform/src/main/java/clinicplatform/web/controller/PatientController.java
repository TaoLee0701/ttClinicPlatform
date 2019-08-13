package clinicplatform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import clinicplatform.biz.HospitalBiz;

@Controller
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private HospitalBiz hospitalBiz;
	
	@RequestMapping("/index")
	public String index() {
		return "patient/patient-index";
	}
	
	@RequestMapping("/getHospital")
	public String getHospital(String name) {
		hospitalBiz.findByHospitalName("");
		return "patient/patient-index";
	}
}
