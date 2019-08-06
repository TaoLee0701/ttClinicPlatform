package clinicplatform.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import clinicplatform.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	@Autowired
	UserMapper userMapper;
	@Test
	public void test() {
		QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
		queryWrapper.eq("user_id", 1);
		User user=userMapper.selectOne(queryWrapper);
		System.out.println(user);
	}

}
