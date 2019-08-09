package clinicplatform.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import clinicplatform.biz.UserBiz;
import clinicplatform.entity.User;

@Controller
@RequestMapping("/clinicback")
public class LoginController {

	@Autowired
	private UserBiz userBiz;
	
	public String index() {
		return "clinicback/..";
	}
	
	
	@RequestMapping("/login")
	public String login(Model model,String loginName,String password) {
		Subject subject = SecurityUtils.getSubject();//拿到当前跟程序互交的用户
		UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
		try {
			subject.login(token);
			subject.getSession().setAttribute("loginUser", userBiz.checkUserNameOrUserPhone(loginName));
			return "redirect:/index";
		} catch (AuthenticationException ex) {
			model.addAttribute("error", "用户名或密码错误");
			return "/home/clinicback-login";
		}
	}
}
