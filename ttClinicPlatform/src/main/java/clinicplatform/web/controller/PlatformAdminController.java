package clinicplatform.web.controller;

import clinicplatform.entity.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/platformAdmin")
public class PlatformAdminController {

    
    @RequestMapping("/login")
    public String login(){
        return  "platform-admin/login";
    }
    @RequestMapping("/user")
    @ResponseBody
    public Doctor user(Integer id){
        System.out.println(id);
        return  new Doctor(1,"李gay问","123","12345667848","http://asba","广州","ssssss");
    }
}
