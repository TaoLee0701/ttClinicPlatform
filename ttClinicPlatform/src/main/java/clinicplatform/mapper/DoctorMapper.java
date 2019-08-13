package clinicplatform.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import clinicplatform.entity.Doctor;

public interface DoctorMapper extends BaseMapper<Doctor>{

	//登录页面验证
	 Doctor checkLogin(@Param("username")String username,@Param("pwd")String pwd) ;
}
