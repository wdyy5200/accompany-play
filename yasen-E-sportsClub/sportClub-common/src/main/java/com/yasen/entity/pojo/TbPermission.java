package com.yasen.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;


/**
 * 权限设计表
 */
public class TbPermission implements Serializable {


	/**
	 * 
	 */
	private Long id;

	/**
	 * 名称
	 */
	private String premName;

	/**
	 * 状态0是正常1是停用
	 */
	private Integer status;

	/**
	 * 创建者
	 */
	private String created;

	/**
	 * 修改者
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updated;

	/**
	 * 删除者
	 */
	private String deleted;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setPremName(String premName){
		this.premName = premName;
	}

	public String getPremName(){
		return this.premName;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return this.status;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return this.created;
	}

	public void setUpdated(Date updated){
		this.updated = updated;
	}

	public Date getUpdated(){
		return this.updated;
	}

	public void setDeleted(String deleted){
		this.deleted = deleted;
	}

	public String getDeleted(){
		return this.deleted;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，名称:"+(premName == null ? "空" : premName)+"，状态0是正常1是停用:"+(status == null ? "空" : status)+"，创建者:"+(created == null ? "空" : created)+"，修改者:"+(updated == null ? "空" : DateUtil.format(updated, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，删除者:"+(deleted == null ? "空" : deleted)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，修改时间:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
