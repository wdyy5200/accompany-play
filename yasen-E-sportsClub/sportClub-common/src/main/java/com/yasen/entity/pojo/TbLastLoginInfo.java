package com.yasen.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;


/**
 * 用户在线统计表
 */
public class TbLastLoginInfo implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 当天
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date firstActiveTime;

	/**
	 * 最后
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastActiveTime;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return this.userId;
	}

	public void setFirstActiveTime(Date firstActiveTime){
		this.firstActiveTime = firstActiveTime;
	}

	public Date getFirstActiveTime(){
		return this.firstActiveTime;
	}

	public void setLastActiveTime(Date lastActiveTime){
		this.lastActiveTime = lastActiveTime;
	}

	public Date getLastActiveTime(){
		return this.lastActiveTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，userId:"+(userId == null ? "空" : userId)+"，当天:"+(firstActiveTime == null ? "空" : DateUtil.format(firstActiveTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，最后:"+(lastActiveTime == null ? "空" : DateUtil.format(lastActiveTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
