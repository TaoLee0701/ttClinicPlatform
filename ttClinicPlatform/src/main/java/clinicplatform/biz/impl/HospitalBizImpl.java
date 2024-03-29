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
		
		if(hospitals.isEmpty())
			hospitals=null;
		return hospitals;
	}

	@Override
	public List<Hospital> findByTopScoreAndAddress(String address) {
		
		return hospitalMapper.findByTopScoreAndAddress(address);
	}

	@Override
	public Hospital fetchById(int hId) {
		QueryWrapper<Hospital> qw = new QueryWrapper<>();
		qw.eq("hospital_id", hId);
		
		return hospitalMapper.selectOne(qw);
	}

}
