package clinicplatform.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import clinicplatform.entity.Hospital;

public interface HospitalMapper extends BaseMapper<Hospital>{
	/**
	 * 查询当前医院的平均评分
	 * 
	 * @param hId  当前医院Id
	 * @author CCB
	 */
	double fetchAvgScore(int hId);
	
	/**
	 * 根据当前地址所在城市查询评分最高的10所医院
	 * 
	 * @param address 医院所在城市地址
	 * @author CCB
	 */
	List<Hospital> findByTopScoreAndAddress(String address);
}
