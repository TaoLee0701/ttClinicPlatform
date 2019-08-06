package clinicplatform.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor {
	
	
	//医生详细信息表
	 private  Integer doctorId;  //自增长主键
	 private  String doctorName; //医生姓名
	 private String doctorPassword;  //密码
	 private String doctorPhone;  //手机号
	 private String doctorImg;   //医生头像
	 private String doctorPosition; //医生职位
	 private String doctorDetail;  //医生详细信息
	
}
