package clinicplatform.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import clinicplatform.entity.Doctor;

public interface DoctorBiz {

	//登录页面
	Doctor checkLogin(String username, String pwd);
	
	
	/**
	  * 查询该医院的所有医生，或者查出该医院某个科室的医生，或者按职位查询医生
	  * 
	  * @param hid 医院id，did 科室id，position 职称
	  * @author CCB
	  */
	 List<Doctor> findByHidAndDidOrDoctorPosition(@Param("hid")Integer hid,@Param("did")Integer did,@Param("position")String position);
}
