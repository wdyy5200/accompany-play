package com.yasen.service.impl;

import java.util.List;


import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import com.yasen.entity.enums.PageSize;
import com.yasen.entity.query.UserInfoQuery;
import com.yasen.entity.pojo.UserInfo;
import com.yasen.entity.vo.PaginationResultVO;
import com.yasen.entity.query.SimplePage;
import com.yasen.mappers.UserInfoMapper;
import com.yasen.service.UserInfoService;
import com.yasen.utils.StringTools;


/**
 * 用户信息表 业务接口实现
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Resource
	private UserInfoMapper<UserInfo, UserInfoQuery> userInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<UserInfo> findListByParam(UserInfoQuery param) {
		return this.userInfoMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(UserInfoQuery param) {
		return this.userInfoMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<UserInfo> findListByPage(UserInfoQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<UserInfo> list = this.findListByParam(param);
		PaginationResultVO<UserInfo> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(UserInfo bean) {
		return this.userInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<UserInfo> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<UserInfo> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(UserInfo bean, UserInfoQuery param) {
		StringTools.checkParam(param);
		return this.userInfoMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(UserInfoQuery param) {
		StringTools.checkParam(param);
		return this.userInfoMapper.deleteByParam(param);
	}

	/**
	 * 根据UserIdAndPhone获取对象
	 */
	@Override
	public UserInfo getUserInfoByUserIdAndPhone(String userId, String phone) {
		return this.userInfoMapper.selectByUserIdAndPhone(userId, phone);
	}

	/**
	 * 根据UserIdAndPhone修改
	 */
	@Override
	public Integer updateUserInfoByUserIdAndPhone(UserInfo bean, String userId, String phone) {
		return this.userInfoMapper.updateByUserIdAndPhone(bean, userId, phone);
	}

	/**
	 * 根据UserIdAndPhone删除
	 */
	@Override
	public Integer deleteUserInfoByUserIdAndPhone(String userId, String phone) {
		return this.userInfoMapper.deleteByUserIdAndPhone(userId, phone);
	}
}