package com.yasen.service;

import java.util.List;

import com.yasen.entity.query.TbUserRoleQuery;
import com.yasen.entity.pojo.TbUserRole;
import com.yasen.entity.vo.PaginationResultVO;


/**
 * 用户权限关联表 业务接口
 */
public interface TbUserRoleService {

	/**
	 * 根据条件查询列表
	 */
	List<TbUserRole> findListByParam(TbUserRoleQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(TbUserRoleQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<TbUserRole> findListByPage(TbUserRoleQuery param);

	/**
	 * 新增
	 */
	Integer add(TbUserRole bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<TbUserRole> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<TbUserRole> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(TbUserRole bean,TbUserRoleQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(TbUserRoleQuery param);

	/**
	 * 根据Id查询对象
	 */
	TbUserRole getTbUserRoleById(Integer id);


	/**
	 * 根据Id修改
	 */
	Integer updateTbUserRoleById(TbUserRole bean,Integer id);


	/**
	 * 根据Id删除
	 */
	Integer deleteTbUserRoleById(Integer id);

}