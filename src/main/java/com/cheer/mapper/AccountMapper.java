package com.cheer.mapper;

import com.cheer.model.Account;

public interface AccountMapper {
	
	public Account queryById(Integer idValue);
	
	public int insert(Account account);
	
	public int insert2(Account account);
}
