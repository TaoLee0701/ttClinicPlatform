package clinicplatform.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clinicplatform.biz.UserBiz;
import clinicplatform.entity.User;
import clinicplatform.mapper.UserMapper;

@Service
public class UserBizimpl implements UserBiz{

	@Autowired
	private UserMapper usermapper;

	@Override
	public List<User> findAdministrators(String name, String phone, String password) {
		// TODO Auto-generated method stub
		return usermapper.findAdministrators(name, phone, password);
	}

	@Override
	public User fetchAdministrators(String loginName) {
		// TODO Auto-generated method stub
		return usermapper.fetchAdministrators(loginName);
	}

	
	
}
