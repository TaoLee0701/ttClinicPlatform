package clinicplatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import clinicplatform.entity.User;

public interface UserMapper extends BaseMapper<User>{
	//判断是否为管理员
	User fetchAdministrators(@Param("loginName")String loginName);
	//查询管理员登录诊所后台
	List<User> findAdministrators(String name,String phone,String password);
}
