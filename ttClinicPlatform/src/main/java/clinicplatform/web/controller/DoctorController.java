package clinicplatform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import clinicplatform.biz.DoctorBiz;
import clinicplatform.entity.Doctor;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorBiz doctorBiz;


	@RequestMapping("login")
	public String login(Model model,String username,String pwd) {

		Doctor loginDoctor=doctorBiz.checkLogin(username, pwd);


		return "login";
	}

}
