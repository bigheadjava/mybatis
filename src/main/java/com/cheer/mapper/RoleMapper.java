package com.cheer.mapper;

import com.cheer.model.Role;

public interface RoleMapper {
	
	public Role queryById(Integer id);
	
	public int insert(Role role);
}
