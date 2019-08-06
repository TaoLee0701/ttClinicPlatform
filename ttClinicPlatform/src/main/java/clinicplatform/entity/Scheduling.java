package clinicplatform.entity;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Scheduling {
	//排班表
	private Integer schId;
	private Date day;   //日期
	private int week;	//星期几
	private  Timestamp goDuty; //上班时间
	private  Timestamp offDuty; //下班时间
	private int hddId; 
}
