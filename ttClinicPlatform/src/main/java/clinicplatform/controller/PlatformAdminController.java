package clinicplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("platformAdmin")
public class PlatformAdminController {

    @RequestMapping("index")
    public String index(){
        System.out.println("ssssss");
        return  "platform-admin/index";
    }
    @RequestMapping("user")
    @ResponseBody
    public Integer user(Integer id){
        System.out.println(id);
        return  id;
    }

}
