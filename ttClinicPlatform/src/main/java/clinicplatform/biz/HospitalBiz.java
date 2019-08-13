package clinicplatform.biz;

import java.util.List;

import clinicplatform.entity.Hospital;

public interface HospitalBiz {
	/**
	 * 根据名称查询医院
	 * 
	 * @param name 医院名称
	 * @author CCB
	 */
	List<Hospital> findByHospitalName(String name);
	
	List<Hospital> findByTopScoreAndAddress(String address);
	
	/**
	 * 按id查询医院
	 * 
	 * @param hId  医院Id
	 * @author CCB
	 */
	Hospital fetchById(int hId);
	
}
