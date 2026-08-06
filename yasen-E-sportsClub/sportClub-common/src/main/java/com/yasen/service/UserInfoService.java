package com.yasen.service;

import java.util.List;

import com.yasen.entity.query.UserInfoQuery;
import com.yasen.entity.pojo.UserInfo;
import com.yasen.entity.vo.PaginationResultVO;


/**
 * 用户信息表 业务接口
 */
public interface UserInfoService {

	/**
	 * 根据条件查询列表
	 */
	List<UserInfo> findListByParam(UserInfoQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(UserInfoQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<UserInfo> findListByPage(UserInfoQuery param);

	/**
	 * 新增
	 */
	Integer add(UserInfo bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<UserInfo> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<UserInfo> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(UserInfo bean,UserInfoQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(UserInfoQuery param);

	/**
	 * 根据UserIdAndPhone查询对象
	 */
	UserInfo getUserInfoByUserIdAndPhone(String userId,String phone);


	/**
	 * 根据UserIdAndPhone修改
	 */
	Integer updateUserInfoByUserIdAndPhone(UserInfo bean,String userId,String phone);


	/**
	 * 根据UserIdAndPhone删除
	 */
	Integer deleteUserInfoByUserIdAndPhone(String userId,String phone);



}