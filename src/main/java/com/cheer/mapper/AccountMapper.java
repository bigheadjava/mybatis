package com.cheer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cheer.model.Account;
import com.cheer.model.Role;

public interface AccountMapper {
	
	public Account queryById(Integer idValue);
	
	public int insert(Account account);
	
	public int insert2(Account account);
	
	public int updateById(Account account);
	
	public int deleteById(Integer id);
	
	public List<Account> queryAccountByRole(@Param(value = "accountId") Integer accountId, @Param("enable") Integer enable);
	
	public List<Account> queryAccountByRole2(@Param(value = "account") Account account, @Param("role") Role role);
}
