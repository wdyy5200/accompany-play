package com.yasen.service.impl;

import java.util.List;


import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import com.yasen.entity.enums.PageSize;
import com.yasen.entity.query.TbUserRoleQuery;
import com.yasen.entity.pojo.TbUserRole;
import com.yasen.entity.vo.PaginationResultVO;
import com.yasen.entity.query.SimplePage;
import com.yasen.mappers.TbUserRoleMapper;
import com.yasen.service.TbUserRoleService;
import com.yasen.utils.StringTools;


/**
 * 用户权限关联表 业务接口实现
 */
@Service("tbUserRoleService")
public class TbUserRoleServiceImpl implements TbUserRoleService {

	@Resource
	private TbUserRoleMapper<TbUserRole, TbUserRoleQuery> tbUserRoleMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<TbUserRole> findListByParam(TbUserRoleQuery param) {
		return this.tbUserRoleMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(TbUserRoleQuery param) {
		return this.tbUserRoleMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<TbUserRole> findListByPage(TbUserRoleQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<TbUserRole> list = this.findListByParam(param);
		PaginationResultVO<TbUserRole> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(TbUserRole bean) {
		return this.tbUserRoleMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<TbUserRole> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.tbUserRoleMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<TbUserRole> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.tbUserRoleMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(TbUserRole bean, TbUserRoleQuery param) {
		StringTools.checkParam(param);
		return this.tbUserRoleMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(TbUserRoleQuery param) {
		StringTools.checkParam(param);
		return this.tbUserRoleMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public TbUserRole getTbUserRoleById(Integer id) {
		return this.tbUserRoleMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateTbUserRoleById(TbUserRole bean, Integer id) {
		return this.tbUserRoleMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteTbUserRoleById(Integer id) {
		return this.tbUserRoleMapper.deleteById(id);
	}
}