package com.cheer.model;

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
	
	@Test
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
}
