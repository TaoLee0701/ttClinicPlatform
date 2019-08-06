package clinicplatform.biz;

import java.util.List;

import clinicplatform.entity.User;

public interface UserBiz {
	//判断是否为管理员
	User fetchAdministrators(String loginName);
	//查询管理员登录诊所后台
	List<User> findAdministrators(String name,String phone,String password);
}
