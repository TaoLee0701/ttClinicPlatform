package clinicplatform.biz;

import java.util.List;

import clinicplatform.entity.Hospital;

public interface HospitalBiz {
	List<Hospital> findByHospitalName(String name);
}
