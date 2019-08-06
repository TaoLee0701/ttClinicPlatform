package clinicplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import clinicplatform.entity.Doctor;

@Controller
public class DoctorController {
	
	@Autowired
	private Doctor doctorBiz;
	
	
	
	@RequestMapping("login")
	public String login(Model model,String username,String pwd) {
		
		
		
		return "login";
	}
	
}
