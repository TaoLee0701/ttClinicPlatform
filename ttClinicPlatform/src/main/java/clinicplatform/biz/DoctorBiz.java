package clinicplatform.biz;

import clinicplatform.entity.Doctor;

public interface DoctorBiz {

	//登录页面
	Doctor checkLogin(String username, String pwd);

}
