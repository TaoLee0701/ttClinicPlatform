package clinicplatform.biz.impl;

import clinicplatform.biz.DoctorBiz;
import clinicplatform.entity.*;
import clinicplatform.mapper.DoctorMapper;
import org.springframework.stereotype.Service;

@Service
public class DoctorBizimpl implements DoctorBiz {

	private DoctorMapper doctormapper;

	//登录页面
	@Override
	public Doctor checkLogin(String username, String pwd) {
		return doctormapper.checkLogin( username,  pwd);

	}

}
