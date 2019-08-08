package clinicplatform.biz;

import java.util.List;

import clinicplatform.entity.User;

public interface UserBiz {
	/**
	 * 根据用户名或者手机号查询用户
	 * @param loginName 
	 * @return
	 * @author ccb
	 */
	User checkUserNameOrUserPhone(String loginName);
	
}
