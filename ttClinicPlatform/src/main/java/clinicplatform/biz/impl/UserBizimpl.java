package clinicplatform.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import clinicplatform.biz.UserBiz;
import clinicplatform.entity.User;
import clinicplatform.mapper.RoleMapper;
import clinicplatform.mapper.UserMapper;

@Service
public class UserBizimpl implements UserBiz{

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public User checkUserNameOrUserPhone(String loginName) {
		QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
		queryWrapper.eq("user_name", loginName);
		queryWrapper.or().eq("user_phone", loginName);
		User user =userMapper.selectOne(queryWrapper);
		user.setRoles(roleMapper.fetchByUserRoleId(user.getUserId()));
		return user;
	}

	
	
}
