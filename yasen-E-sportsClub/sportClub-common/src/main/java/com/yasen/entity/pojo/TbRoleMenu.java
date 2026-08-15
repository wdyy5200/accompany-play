package com.yasen.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;


/**
 * 菜单权限关联表
 */
public class TbRoleMenu implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private Integer roleId;

	/**
	 * 
	 */
	private Integer menuId;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date deleteTime;

	/**
	 * 
	 */
	private String updated;

	/**
	 * 
	 */
	private String deleted;

	/**
	 * 
	 */
	private String created;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}

	public Integer getRoleId(){
		return this.roleId;
	}

	public void setMenuId(Integer menuId){
		this.menuId = menuId;
	}

	public Integer getMenuId(){
		return this.menuId;
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

	public void setDeleteTime(Date deleteTime){
		this.deleteTime = deleteTime;
	}

	public Date getDeleteTime(){
		return this.deleteTime;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return this.updated;
	}

	public void setDeleted(String deleted){
		this.deleted = deleted;
	}

	public String getDeleted(){
		return this.deleted;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return this.created;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，roleId:"+(roleId == null ? "空" : roleId)+"，menuId:"+(menuId == null ? "空" : menuId)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，updateTime:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，deleteTime:"+(deleteTime == null ? "空" : DateUtil.format(deleteTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，updated:"+(updated == null ? "空" : updated)+"，deleted:"+(deleted == null ? "空" : deleted)+"，created:"+(created == null ? "空" : created);
	}
}
