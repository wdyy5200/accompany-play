package com.yasen.service;

import java.util.List;

import com.yasen.entity.query.TbUserQuery;
import com.yasen.entity.pojo.TbUser;
import com.yasen.entity.result.ResultVo;
import com.yasen.entity.vo.PaginationResultVO;


/**
 * 用户信息表 业务接口
 */
public interface TbUserService {

	/**
	 * 根据条件查询列表
	 */
	List<TbUser> findListByParam(TbUserQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(TbUserQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<TbUser> findListByPage(TbUserQuery param);

	/**
	 * 新增
	 */
	Integer add(TbUser bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<TbUser> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<TbUser> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(TbUser bean,TbUserQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(TbUserQuery param);

	/**
	 * 根据Id查询对象
	 */
	TbUser getTbUserById(Integer id);


	/**
	 * 根据Id修改
	 */
	Integer updateTbUserById(TbUser bean,Integer id);


	/**
	 * 根据Id删除
	 */
	Integer deleteTbUserById(Integer id);


	ResultVo login(TbUser tbUser);
}