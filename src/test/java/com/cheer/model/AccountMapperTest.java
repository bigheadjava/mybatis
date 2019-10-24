package com.cheer.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;

import com.cheer.mapper.AccountMapper;
import com.cheer.util.DateUtil;

public class AccountMapperTest extends BaseMapperTest {

	@Ignore
	public void testInsert() {
		SqlSession session = getSqlSession();
		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			Account account = new Account();
			account.setName("admin998");
			account.setPassword("password");
			account.setEmail("admin999@163.com");
			account.setCreatedDate(DateUtil.getCurrrentDate());
			mapper.insert(account);
			session.commit();
			System.out.println(account.toString());
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
	
	@Ignore
	public void testInsert2() {
		SqlSession session = getSqlSession();
		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			Account account = new Account();
			account.setName("admin999");
			account.setPassword("password");
			account.setEmail("admin999@163.com");
			account.setCreatedDate(DateUtil.getCurrrentDate());
			mapper.insert2(account);
			session.commit();
			System.out.println(account.toString());
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
	
	@Ignore
	public void testUpdateById() {
		SqlSession session = getSqlSession();
		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			Account account = mapper.queryById(1);
			account.setName("new_admin00");
			account.setPassword("new_password");
			account.setEmail("new_admin001@163.com");
			mapper.updateById(account);
			session.commit();
			System.out.println(account.toString());
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
	
	@Ignore
	public void testDeleteById() {
		SqlSession session = getSqlSession();
		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			mapper.deleteById(1005);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		
	}
	
	@Ignore
	public void testQueryAccountByRole() {
		SqlSession session = getSqlSession();
		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			List<Account> resultList = mapper.queryAccountByRole(1, 0);
			for(Account account : resultList) {
				System.out.println(account.toString());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	@Test
	public void testQueryAccountByRole2() {
		SqlSession session = getSqlSession();
		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			Account account = new Account();
			account.setId(1);
			Role role  = new Role();
			role.setEnable(1);
			List<Account> resultList = mapper.queryAccountByRole2(account, role);
			for(Account a : resultList) {
				System.out.println(a.toString());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
}
