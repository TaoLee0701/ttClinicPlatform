package clinicplatform.biz.impl;

import clinicplatform.biz.UserBiz;
import clinicplatform.entity.User;
import clinicplatform.mapper.RoleMapper;
import clinicplatform.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		if(user!=null) {
			user.setRoles(roleMapper.fetchByUserRoleId(user.getUserId()));
		}
		return user;
	}

	@Override
	public User fetchThisUser(String principal) {
		Subject subject = SecurityUtils.getSubject();
		return (subject.getSession().getAttribute(principal))==null?null:(User) subject.getSession().getAttribute(principal);
	}

}
