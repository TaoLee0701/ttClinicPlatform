package clinicplatform.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import clinicplatform.biz.DoctorBiz;
import clinicplatform.biz.HospitalBiz;
import clinicplatform.entity.Hospital;


@Controller
@RequestMapping("/hospital")
public class HospitalController {
	@Autowired
	private HospitalBiz hospitalBiz;
	@Autowired
	private DoctorBiz doctorBiz;
	
	@GetMapping("")
	@ResponseBody
	public List<Hospital> fetchByName(String name  ) {
		return hospitalBiz.findByHospitalName(name);
	}
	
	@GetMapping("/getscore")
	@ResponseBody
	public List<Hospital> findByScore(String address  ) {
		List<Hospital> hospitals = hospitalBiz.findByTopScoreAndAddress(address);
		if(hospitals!=null)
			hospitals.forEach(h -> h.setChangeScore((int) h.getHospitalScore()));
		
		return hospitals;
	}
	@GetMapping("/{id}")
	public String getchById(@PathVariable(name="id")Integer id,Model model) {
		Hospital hospital= hospitalBiz.fetchById(id);
		if(hospital!=null) {
			hospital.setChangeScore((int) hospital.getHospitalScore());
			model.addAttribute("hospital", hospital);
		
			model.addAttribute("dean",doctorBiz.findByHidAndDidOrDoctorPosition(id, null, "院长").get(0).getDoctorName());
		}
		return "patient/patient-hospital-detail";
	}
}
