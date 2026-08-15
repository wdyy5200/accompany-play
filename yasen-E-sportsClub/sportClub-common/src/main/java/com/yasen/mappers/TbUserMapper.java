package com.yasen.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户信息表 数据库操作接口
 */
@Mapper
public interface TbUserMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据Id更新
	 */
	 Integer updateById(@Param("bean") T t,@Param("id") Integer id);


	/**
	 * 根据Id删除
	 */
	 Integer deleteById(@Param("id") Integer id);


	/**
	 * 根据Id获取对象
	 */
	 T selectById(@Param("id") Integer id);

	/**
	 * 根据用户名查询
	 */
	 T selectByUserName(@Param("userName") String userName);

	/**
	 * 根据微信openId查询
	 */
	 T selectByOpenId(@Param("openId") String openId);

}
