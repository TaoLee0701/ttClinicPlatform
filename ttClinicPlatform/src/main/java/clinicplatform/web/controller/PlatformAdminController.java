package clinicplatform.web.controller;

import clinicplatform.biz.UserBiz;
import clinicplatform.entity.Role;
import clinicplatform.entity.User;
import clinicplatform.response.PlatformResponse;
import clinicplatform.response.ResponseFinal.ResponseStatus;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ttPlatform")
public class PlatformAdminController {

    @Autowired
    private UserBiz userBiz;

    @GetMapping("/login")
    public String login(){
        return  "platform-admin/login";
    }
    @GetMapping("/home")
    public String home(){
        return  "platform-admin/home";
    }

    @PostMapping("/check-login")
    @ResponseBody
    public PlatformResponse login(@RequestBody User user) {
        PlatformResponse<User> platformResponse=new PlatformResponse<User>();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getUserPassword());
        try {
            subject.login(token);
            User admin = userBiz.checkUserNameOrUserPhone(user.getUserName());
            if (admin.getRoles().contains(new Role(1, "ttPlatform-admin"))) {
                subject.getSession().setAttribute("ttadmin",admin);
                platformResponse.setStatus(ResponseStatus.STATUS_SUCCRESS);
                platformResponse.setObject(admin);
            }else{
                platformResponse.setStatus(ResponseStatus.STATUS_NOT_RIGHTS);
            }
        } catch (AuthenticationException ex) {
            platformResponse.setStatus(ResponseStatus.STATUS_DEFEATED);
        }finally {
            return platformResponse;
        }
    }
}
