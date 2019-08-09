package clinicplatform.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ttPlatform")
public class PlatformAdminController {

    @RequestMapping("/login")
    public String login(){
        return  "platform-admin/login";
    }

    @RequestMapping("/check-login")
    @ResponseBody
    public String login(String userName, String password) {
        Subject subject = SecurityUtils.getSubject();//拿到当前跟程序互交的用户
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        try {
            subject.login(token);
            subject.getSession().setAttribute("ttadmin","ttadmin");
            return "succees";
        } catch (AuthenticationException ex) {
            return "defeated";
        }
    }
}
