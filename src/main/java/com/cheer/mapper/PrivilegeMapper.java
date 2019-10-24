package com.cheer.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.cheer.model.Privilege;

public interface PrivilegeMapper {

	@Select({ "select id, privilege_name, privilege_url", "from i_privilege", "where id = #{id}" })
	public Privilege queryById(Integer id);

	@Results({ @Result(property = "id", column = "id"), @Result(property = "privilegeName", column = "name"),
			@Result(property = "privilegeUrl", column = "url"), })
	@Select({ "select id, privilege_name as name, privilege_url as url", "from i_privilege", "where id = #{id}" })
	public Privilege queryById2(Integer id);

	@Insert({ "insert into i_privilege(privilege_name, privilege_url)", "values(#{privilegeName},#{privilegeUrl})" })
	@Options(useGeneratedKeys = true, keyProperty="id")
	public int insert(Privilege privilege);
	
	
	@Insert({ "insert into i_privilege(privilege_name, privilege_url)", "values(#{privilegeName},#{privilegeUrl})" })
	@SelectKey(
		statement = "select last_insert_id()",
		keyProperty = "id",
		resultType = Integer.class,
		before = false
	)
	public int insert1(Privilege privilege);

}
