package com.cheer.model;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;

import com.cheer.mapper.PrivilegeMapper;

public class PrivilegeMapperTest extends BaseMapperTest {

	@Ignore
	public void testQueryById() {
		SqlSession session = getSqlSession();
		try {
			PrivilegeMapper mapper = session.getMapper(PrivilegeMapper.class);
			Privilege p = mapper.queryById(1);
			System.out.println(p.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	@Ignore
	public void testQueryById2() {
		SqlSession session = getSqlSession();
		try {
			PrivilegeMapper mapper = session.getMapper(PrivilegeMapper.class);
			Privilege p = mapper.queryById2(1);
			System.out.println(p.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	@Ignore
	public void testInsert() {
		SqlSession session = getSqlSession();
		try {
			PrivilegeMapper mapper = session.getMapper(PrivilegeMapper.class);
			Privilege p = new Privilege();
			p.setPrivilegeName("财务管理");
			p.setPrivilegeUrl("/finace");
			mapper.insert(p);
			session.commit();
			System.out.println(p.toString());
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testInsert1() {
		SqlSession session = getSqlSession();
		try {
			PrivilegeMapper mapper = session.getMapper(PrivilegeMapper.class);
			Privilege p = new Privilege();
			p.setPrivilegeName("客户管理");
			p.setPrivilegeUrl("/customers");
			mapper.insert1(p);
			session.commit();
			System.out.println(p.toString());
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
}
