package clinicplatform.biz;

import clinicplatform.entity.Doctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorBiz {

	/**
	 * 登录页面
	 * @param username
	 * @param pwd
	 * @return
	 */
	Doctor checkLogin(String username, String pwd);


	/**
	  * 查询该医院的所有医生，或者查出该医院某个科室的医生，或者按职位查询医生
	  *
	  * @param hid 医院id，did 科室id，position 职称
	  * @author CCB
	  */
	 List<Doctor> findByHidAndDidOrDoctorPosition(@Param("hid")Integer hid,@Param("did")Integer did,@Param("position")String position);
}
