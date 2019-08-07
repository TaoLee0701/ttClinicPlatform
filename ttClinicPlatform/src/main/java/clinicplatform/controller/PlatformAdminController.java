package clinicplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("platformAdmin")
public class PlatformAdminController {

    @RequestMapping("index")
    public String index(){
        return  "platform-admin/index";
    }
    @RequestMapping("user")
    @ResponseBody
    public Map<String,String> user(Integer id){
        System.out.println(id);
        Map<String,String> map=new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        map.put("5","5");
        return  map;
    }

}
