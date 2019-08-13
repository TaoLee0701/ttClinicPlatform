package clinicplatform.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import clinicplatform.entity.Role;

public interface RoleMapper extends BaseMapper<Role>{
	/**
	 * 根据用户id查询角色
	 * 
	 * @param uId
	 * @return
	 * @author ccb
	 */
	List<Role> fetchByUserRoleId(int uId);
}
