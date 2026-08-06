package com.yasen.entity.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 用户权限关联表
 */
public class TbUserRole implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 
	 */
	private Integer roleId;


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

	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}

	public Integer getRoleId(){
		return this.roleId;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，userId:"+(userId == null ? "空" : userId)+"，roleId:"+(roleId == null ? "空" : roleId);
	}
}
