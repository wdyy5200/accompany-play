package com.yasen.service.impl;

import com.yasen.entity.pojo.TbRole;
import com.yasen.mappers.TbRoleMapper;
import com.yasen.service.TbRoleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色表 业务接口实现
 */
@Service("tbRoleService")
public class TbRoleServiceImpl implements TbRoleService {

	@Resource
	private TbRoleMapper tbRoleMapper;

	@Override
	public TbRole findByRoleKey(String roleKey) {
		return tbRoleMapper.selectByRoleKey(roleKey);
	}

	@Override
	public TbRole findById(Integer id) {
		return tbRoleMapper.selectById(id);
	}

	@Override
	public List<TbRole> findAll() {
		return tbRoleMapper.selectAll();
	}

	@Override
	public List<TbRole> findRolesByUserId(Integer userId) {
		return tbRoleMapper.selectRolesByUserId(userId);
	}
}
