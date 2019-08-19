package clinicplatform.web.controller;

import clinicplatform.biz.UserBiz;
import clinicplatform.entity.Role;
import clinicplatform.entity.User;
import clinicplatform.response.ResultResponse;
import clinicplatform.util.ResultVOUtil;
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
    public ResultResponse login(@RequestBody User user) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getUserPassword());
        try {
            subject.login(token);
            User admin = userBiz.checkUserNameOrUserPhone(user.getUserName());
            if (admin.getRoles().contains(new Role(1, "ttPlatform-admin"))) {
                subject.getSession().setAttribute("ttadmin", admin);
                return ResultVOUtil.success(admin);
            } else {
                return ResultVOUtil.error("此账号没有权限登录!", 302);
            }
        } catch (AuthenticationException ex) {
            return ResultVOUtil.error("账号或密码错误!", 500);
        }
    }
}
