package clinicplatform.shiroconfig;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.web.session.mgt.ServletContainerSessionManager;
import org.springframework.beans.factory.annotation.Autowired;

import clinicplatform.biz.UserBiz;
import clinicplatform.entity.Role;
import clinicplatform.entity.User;
import clinicplatform.mapper.UserMapper;

public class WebRealm extends AuthorizingRealm{

	@Autowired
	private UserBiz userBiz;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principa) {
		String userName =principa.getPrimaryPrincipal().toString();
		User user = userBiz.checkUserNameOrUserPhone(userName); //加载用户信息
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		for(Role r : user.getRoles()) {
			info.addRole(r.getRoleName()); 		//加载用户角色
		}
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName =token.getPrincipal().toString();
		User user =userBiz.checkUserNameOrUserPhone(userName);
		if(user==null) 
			return null;
		
		AuthenticationInfo 	info = new SimpleAuthenticationInfo(userName,user.getUserPassword(),this.getName());
		return info;
	}

}
