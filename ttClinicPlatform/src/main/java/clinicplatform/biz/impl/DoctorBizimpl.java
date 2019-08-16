package clinicplatform.biz.impl;

import clinicplatform.biz.DoctorBiz;
import clinicplatform.entity.*;
import clinicplatform.mapper.DoctorMapper;

import java.util.List;

import javax.xml.ws.soap.Addressing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorBizimpl implements DoctorBiz {

	@Autowired
	private DoctorMapper doctormapper;

	@Override
	public Doctor checkLogin(String username, String pwd) {
		System.out.println(222222);
		return doctormapper.checkLogin( username,  pwd);

	}

	@Override
	public List<Doctor> findByHidAndDidOrDoctorPosition(Integer hid, Integer did, String position) {

		return doctormapper.findByHidAndDidOrDoctorPosition(hid, did, position);
	}

}
