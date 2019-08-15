package clinicplatform.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import clinicplatform.biz.HospitalBiz;
import clinicplatform.entity.Hospital;


@Controller
@RequestMapping("/hospital")
public class HospitalController {
	@Autowired
	private HospitalBiz hospitalBiz;
	
	
	@GetMapping("")
	@ResponseBody
	public List<Hospital> fetchByName(String name) {
		return hospitalBiz.findByHospitalName(name);
	}
}
