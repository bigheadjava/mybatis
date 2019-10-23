package com.cheer.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.cheer.mapper.AccountRoleMapper;

public class AccountRoleMapperTest extends BaseMapperTest {

	@Test
	public void queryRolesByAccountIdTest() {
		SqlSession session = getSqlSession();
		try {
			AccountRoleMapper mapper = session.getMapper(AccountRoleMapper.class);
			List<Role> resultList = mapper.queryRolesByAccountId(1);
			for(Role role : resultList) {
				System.out.println(role.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
