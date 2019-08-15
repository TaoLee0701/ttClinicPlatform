package clinicplatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import clinicplatform.entity.Doctor;

public interface DoctorMapper extends BaseMapper<Doctor>{

	//登录页面验证
	 Doctor checkLogin(@Param("username")String username,@Param("pwd")String pwd) ;
	 
	 
	 /**
	  * 查询该医院的所有医生，或者查出该医院某个科室的医生，或者按职位查询医生
	  * 
	  * @param hid 医院id，did 科室id，position 职称
	  * @author CCB
	  */
	 List<Doctor> findByHidAndDidOrDoctorPosition(@Param("hid")Integer hid,@Param("did")Integer did,@Param("position")String position);
}
