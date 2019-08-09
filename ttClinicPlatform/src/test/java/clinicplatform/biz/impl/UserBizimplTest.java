package clinicplatform.biz.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import clinicplatform.biz.UserBiz;
import clinicplatform.entity.User;
import clinicplatform.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserBizimplTest {

	@Autowired
	UserBiz userBiz;
	
	@Test
	public void testCheckUserAdmin() {
		User user =userBiz.checkUserNameOrUserPhone("");
		System.out.println(user);
	}

}
