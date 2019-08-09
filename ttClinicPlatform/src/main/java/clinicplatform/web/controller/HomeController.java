package clinicplatform.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	@RequestMapping("/doctor-login")
	public String doctorLogin() {
		return "doctor/login";
	}
	
	@RequestMapping("/platform-login")
    public String platformLogin(){
        return  "platform-admin/login";
    }
	
	@RequestMapping("/clinicback-login")
    public String clinicbackLogin(){
        return  "clinicback/login";
    }
}
