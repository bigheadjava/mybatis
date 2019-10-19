package com.cheer.mapper;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cheer.model.User;

public class UserMapperTest {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	@BeforeClass
	public static void init() {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSelectAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> resultList = sqlSession.selectList("selectAll");
		for(User user : resultList) {
			System.out.println(user.toString());
			System.out.println("------------------------------------------------");
		}
		sqlSession.close();
	}
}
