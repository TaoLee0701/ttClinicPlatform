
package clinicplatform.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import clinicplatform.biz.DoctorBiz;
import clinicplatform.entity.Doctor;

@Controller
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	private DoctorBiz doctorBiz;

//	@RequestMapping("/lo")
//	public String lo () {
//		
//		return "doctor/login";
//	}
	//登录页面
	@RequestMapping("login")
	public String nn(Model model, String username, String pwd, HttpSession sess) {
			System.out.println(111111);
			System.out.println(username);
			System.out.println(pwd);
		if (username != null && !username.isEmpty() && pwd != null && !pwd.isEmpty()) {
			Doctor loginDoctor = doctorBiz.checkLogin(username, pwd);
			if (loginDoctor != null) {
				sess.setAttribute("loginDoctor", loginDoctor);
				System.out.println("aaa");
				return "doctor/ScheTable";
			} else {
				model.addAttribute("error", "用户名或密码有误");
				return "doctor/login";
				
			}
		} else {
			return "doctor/login";
		}
	}

}