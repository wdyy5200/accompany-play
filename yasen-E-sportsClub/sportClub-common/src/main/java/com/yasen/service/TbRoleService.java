package com.yasen.service;

import com.yasen.entity.pojo.TbRole;

import java.util.List;

/**
 * 角色表 业务接口
 */
public interface TbRoleService {

	/**
	 * 根据角色标识查询角色
	 */
	TbRole findByRoleKey(String roleKey);

	/**
	 * 根据ID查询角色
	 */
	TbRole findById(Integer id);

	/**
	 * 查询所有角色
	 */
	List<TbRole> findAll();

	/**
	 * 根据用户ID查询角色列表
	 */
	List<TbRole> findRolesByUserId(Integer userId);
}
