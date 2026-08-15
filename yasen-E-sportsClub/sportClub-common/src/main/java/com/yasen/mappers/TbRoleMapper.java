package com.yasen.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色表 数据库操作接口
 */
@Mapper
public interface TbRoleMapper {

	/**
	 * 根据角色标识查询角色
	 */
	com.yasen.entity.pojo.TbRole selectByRoleKey(@Param("roleKey") String roleKey);

	/**
	 * 根据ID查询角色
	 */
	com.yasen.entity.pojo.TbRole selectById(@Param("id") Integer id);

	/**
	 * 查询所有角色
	 */
	List<com.yasen.entity.pojo.TbRole> selectAll();

	/**
	 * 根据用户ID查询角色列表
	 */
	List<com.yasen.entity.pojo.TbRole> selectRolesByUserId(@Param("userId") Integer userId);
}
