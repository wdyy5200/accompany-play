package com.yasen.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 用户身份信息表 数据库操作接口
 */
public interface UserCardInfoMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据UserCardIdAndUserId更新
	 */
	 Integer updateByUserCardIdAndUserId(@Param("bean") T t,@Param("userCardId") String userCardId,@Param("userId") String userId);


	/**
	 * 根据UserCardIdAndUserId删除
	 */
	 Integer deleteByUserCardIdAndUserId(@Param("userCardId") String userCardId,@Param("userId") String userId);


	/**
	 * 根据UserCardIdAndUserId获取对象
	 */
	 T selectByUserCardIdAndUserId(@Param("userCardId") String userCardId,@Param("userId") String userId);


}
