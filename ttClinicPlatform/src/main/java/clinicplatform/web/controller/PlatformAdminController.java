package clinicplatform.web.controller;

import clinicplatform.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ttPlatform")
public class PlatformAdminController {

    @RequestMapping("/login")
    public String login(){
        return  "platform-admin/login";
    }

    @PostMapping("/check-login")
    @ResponseBody
    public String login(@RequestBody User user) {
        System.out.println("user:"+user);
        Subject subject = SecurityUtils.getSubject();//拿到当前跟程序互交的用户
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getUserPassword());

        try {
            subject.login(token);
            subject.getSession().setAttribute("ttadmin","ttadmin");
            return "succees";
        } catch (AuthenticationException ex) {
            return "defeated";
        }
    }
}
