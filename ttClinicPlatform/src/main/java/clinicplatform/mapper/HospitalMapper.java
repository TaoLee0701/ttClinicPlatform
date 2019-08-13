package clinicplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import clinicplatform.entity.Hospital;

public interface HospitalMapper extends BaseMapper<Hospital>{
	double fetchAvgScore(int hId);
}
