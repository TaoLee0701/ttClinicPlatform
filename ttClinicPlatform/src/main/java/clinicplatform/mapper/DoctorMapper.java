package clinicplatform.mapper;

import org.apache.ibatis.annotations.Param;

import clinicplatform.entity.Doctor;

public interface DoctorMapper {

	//登录页面验证
	 Doctor checkLogin(@Param("username")String username,@Param("pwd")String pwd) ;
}
