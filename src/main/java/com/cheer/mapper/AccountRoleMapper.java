package com.cheer.mapper;

import java.util.List;

import com.cheer.model.Role;

public interface AccountRoleMapper {
	
	public List<Role> queryRolesByAccountId(Integer id);
}
