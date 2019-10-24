package com.cheer.model;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.cheer.mapper.RoleMapper;
import com.cheer.util.DateUtil;

public class RoleMapperTest extends BaseMapperTest {

	@Test
	public void testInsert() {
		SqlSession session = getSqlSession();
		try {
			RoleMapper mapper = session.getMapper(RoleMapper.class);
			Role role = new Role();
			role.setRoleName("Team Leader");
			role.setEnable(0);
			role.setCreatedDate(DateUtil.getCurrrentDate());
			role.setCreatedBy(1);
			mapper.insert(role);
			session.commit();
			System.out.println(role.toString());
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
}
