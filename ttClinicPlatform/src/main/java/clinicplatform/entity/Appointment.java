package clinicplatform.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appointment {
	//预约记录表
	private Integer aId; 
	private int  pId;   //就诊人Id
	private int docId;	//预约医生
	private Timestamp aTime;  //预约时间
	private int aState;  //状态：默认0，不可对医院进行评分，1可以
	
}
