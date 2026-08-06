package com.yasen.service.impl;

import java.util.List;


import com.yasen.entity.enums.ResponseCodeEnum;
import com.yasen.entity.result.ResultVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import com.yasen.entity.enums.PageSize;
import com.yasen.entity.query.TbUserQuery;
import com.yasen.entity.pojo.TbUser;
import com.yasen.entity.vo.PaginationResultVO;
import com.yasen.entity.query.SimplePage;
import com.yasen.mappers.TbUserMapper;
import com.yasen.service.TbUserService;
import com.yasen.utils.StringTools;


/**
 * 用户信息表 业务接口实现
 */
@Service("tbUserService")
public class TbUserServiceImpl implements TbUserService {

	@Resource
	private TbUserMapper<TbUser, TbUserQuery> tbUserMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<TbUser> findListByParam(TbUserQuery param) {
		return this.tbUserMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(TbUserQuery param) {
		return this.tbUserMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<TbUser> findListByPage(TbUserQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<TbUser> list = this.findListByParam(param);
		PaginationResultVO<TbUser> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(TbUser bean) {
		return this.tbUserMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<TbUser> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.tbUserMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<TbUser> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.tbUserMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(TbUser bean, TbUserQuery param) {
		StringTools.checkParam(param);
		return this.tbUserMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(TbUserQuery param) {
		StringTools.checkParam(param);
		return this.tbUserMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public TbUser getTbUserById(Integer id) {
		return this.tbUserMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateTbUserById(TbUser bean, Integer id) {
		return this.tbUserMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteTbUserById(Integer id) {
		return this.tbUserMapper.deleteById(id);
	}

	@Override
	public ResultVo login(TbUser tbUser) {

		if(StringTools.isEmpty(tbUser.getUserName())){

		} else if (StringTools.isEmpty(tbUser.getPhone())){

		}else{
			return ResultVo.error(ResponseCodeEnum.CODE_600);
		}

		return null;
	}
}