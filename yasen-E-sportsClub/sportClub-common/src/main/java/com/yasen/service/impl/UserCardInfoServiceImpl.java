package com.yasen.service.impl;

import java.util.List;


import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasen.entity.enums.PageSize;
import com.yasen.entity.query.UserCardInfoQuery;
import com.yasen.entity.pojo.UserCardInfo;
import com.yasen.entity.vo.PaginationResultVO;
import com.yasen.entity.query.SimplePage;
import com.yasen.mappers.UserCardInfoMapper;
import com.yasen.service.UserCardInfoService;
import com.yasen.utils.StringTools;


/**
 * 用户身份信息表 业务接口实现
 */
@Service("userCardInfoService")
public class UserCardInfoServiceImpl implements UserCardInfoService {

	@Resource
	private UserCardInfoMapper<UserCardInfo, UserCardInfoQuery> userCardInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<UserCardInfo> findListByParam(UserCardInfoQuery param) {
		return this.userCardInfoMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(UserCardInfoQuery param) {
		return this.userCardInfoMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<UserCardInfo> findListByPage(UserCardInfoQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<UserCardInfo> list = this.findListByParam(param);
		PaginationResultVO<UserCardInfo> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(UserCardInfo bean) {
		return this.userCardInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<UserCardInfo> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userCardInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<UserCardInfo> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userCardInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(UserCardInfo bean, UserCardInfoQuery param) {
		StringTools.checkParam(param);
		return this.userCardInfoMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(UserCardInfoQuery param) {
		StringTools.checkParam(param);
		return this.userCardInfoMapper.deleteByParam(param);
	}

	/**
	 * 根据UserCardIdAndUserId获取对象
	 */
	@Override
	public UserCardInfo getUserCardInfoByUserCardIdAndUserId(String userCardId, String userId) {
		return this.userCardInfoMapper.selectByUserCardIdAndUserId(userCardId, userId);
	}

	/**
	 * 根据UserCardIdAndUserId修改
	 */
	@Override
	public Integer updateUserCardInfoByUserCardIdAndUserId(UserCardInfo bean, String userCardId, String userId) {
		return this.userCardInfoMapper.updateByUserCardIdAndUserId(bean, userCardId, userId);
	}

	/**
	 * 根据UserCardIdAndUserId删除
	 */
	@Override
	public Integer deleteUserCardInfoByUserCardIdAndUserId(String userCardId, String userId) {
		return this.userCardInfoMapper.deleteByUserCardIdAndUserId(userCardId, userId);
	}
}