package clinicplatform.biz.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import clinicplatform.biz.HospitalBiz;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalBizImplTest {
	
	@Autowired
	private HospitalBiz hospitalBiz;
	
	@Test
	public void testFindByHospitalName() {
		
		assertEquals(1, hospitalBiz.findByHospitalName("儿童").size());
	}

	@Test
	public void testFindByTopScoreAndAddress() {
		hospitalBiz.findByTopScoreAndAddress("广州").forEach(h->
			System.out.println(h.getHospitalName()+"---"+h.getHospitalAddress()+"----"+h.getHospitalScore())
				);
	}
	
	@Test
	public void testFetchById() {
		assertEquals("广州儿童医院", hospitalBiz.fetchById(1).getHospitalName());
		
	}

}
