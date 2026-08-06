package com.yasen.service;

import java.util.List;

import com.yasen.entity.query.UserCardInfoQuery;
import com.yasen.entity.pojo.UserCardInfo;
import com.yasen.entity.vo.PaginationResultVO;


/**
 * 用户身份信息表 业务接口
 */
public interface UserCardInfoService {

	/**
	 * 根据条件查询列表
	 */
	List<UserCardInfo> findListByParam(UserCardInfoQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(UserCardInfoQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<UserCardInfo> findListByPage(UserCardInfoQuery param);

	/**
	 * 新增
	 */
	Integer add(UserCardInfo bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<UserCardInfo> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<UserCardInfo> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(UserCardInfo bean,UserCardInfoQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(UserCardInfoQuery param);

	/**
	 * 根据UserCardIdAndUserId查询对象
	 */
	UserCardInfo getUserCardInfoByUserCardIdAndUserId(String userCardId,String userId);


	/**
	 * 根据UserCardIdAndUserId修改
	 */
	Integer updateUserCardInfoByUserCardIdAndUserId(UserCardInfo bean,String userCardId,String userId);


	/**
	 * 根据UserCardIdAndUserId删除
	 */
	Integer deleteUserCardInfoByUserCardIdAndUserId(String userCardId,String userId);

}