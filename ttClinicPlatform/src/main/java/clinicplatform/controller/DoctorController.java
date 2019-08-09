
package clinicplatform.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import clinicplatform.biz.DoctorBiz;
import clinicplatform.entity.Doctor;

@Controller
@RequestMapping("logins")
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

		if (username != null && !username.isEmpty() && pwd != null && !pwd.isEmpty()) {
			Doctor loginDoctor = doctorBiz.checkLogin(username, pwd);
			if (loginDoctor != null) {
				sess.setAttribute("loginDoctor", loginDoctor);
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
