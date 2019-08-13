package clinicplatform.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import clinicplatform.biz.HospitalBiz;
import clinicplatform.entity.Hospital;
import clinicplatform.mapper.HospitalMapper;

@Service
public class HospitalBizImpl implements HospitalBiz {
	
	@Autowired
	private HospitalMapper hospitalMapper;
	
	@Override
	public List<Hospital> findByHospitalName(String name) {
		QueryWrapper<Hospital> qw = new QueryWrapper<>();
		qw.like("hospital_name", "%"+name+"%");
		List<Hospital> hospitals = hospitalMapper.selectList(qw);
		
		if(!hospitals.isEmpty())
			hospitals.forEach(h -> h.setHospitalScore(hospitalMapper.fetchAvgScore(h.getHospitalId())));
		else
			hospitals=null;
		return hospitals;
	}

}
