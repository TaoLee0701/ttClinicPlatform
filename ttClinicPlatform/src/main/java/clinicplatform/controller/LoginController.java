package clinicplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import clinicplatform.biz.UserBiz;
import clinicplatform.entity.User;

@Controller
@RequestMapping("clinicback")
public class LoginController {

	@Autowired
	private UserBiz userBiz;

	@RequestMapping("/login")
	@ResponseBody
	public String login(Model model,String loginName) {
		
		return "/login";
	}
}
