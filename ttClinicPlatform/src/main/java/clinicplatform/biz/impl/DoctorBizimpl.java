package clinicplatform.biz.impl;

import clinicplatform.biz.DoctorBiz;
import clinicplatform.entity.*;
import clinicplatform.mapper.DoctorMapper;

import javax.xml.ws.soap.Addressing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorBizimpl implements DoctorBiz {

	@Autowired
	private DoctorMapper doctormapper;

	//登录页面
	@Override
	public Doctor checkLogin(String username, String pwd) {
		System.out.println(222222);
		return doctormapper.checkLogin( username,  pwd);

	}

}
