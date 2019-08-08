package clinicplatform.mapper;

import java.util.List;

import clinicplatform.entity.Role;

public interface RoleMapper {
	/**
	 * 根据用户id查询角色
	 * 
	 * @param uId
	 * @return
	 * @author ccb
	 */
	List<Role> fetchByUserRoleId(int uId);
}
