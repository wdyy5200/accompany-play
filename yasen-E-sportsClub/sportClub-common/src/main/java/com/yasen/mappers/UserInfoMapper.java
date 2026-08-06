package com.yasen.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 用户信息表 数据库操作接口
 */
public interface UserInfoMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据UserIdAndPhone更新
	 */
	 Integer updateByUserIdAndPhone(@Param("bean") T t,@Param("userId") String userId,@Param("phone") String phone);


	/**
	 * 根据UserIdAndPhone删除
	 */
	 Integer deleteByUserIdAndPhone(@Param("userId") String userId,@Param("phone") String phone);


	/**
	 * 根据UserIdAndPhone获取对象
	 */
	 T selectByUserIdAndPhone(@Param("userId") String userId,@Param("phone") String phone);


}
