package com.yasen.entity.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 用户信息表
 */
public class TbUser implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 账号
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 昵称
	 */
	private String roleName;

	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 手机号
	 */
	@JsonIgnore
	private String phone;

	/**
	 * 身份证号
	 */
	private String idCard;

	/**
	 * 身份证图片
	 */
	private String idCardImg;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 最后登录时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastLoginTime;

	/**
	 * 
	 */
	private Integer openId;

	/**
	 * 微信头像
	 */
	private String openImg;

	/**
	 * 
	 */
	private String createTime;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 
	 */
	private String updated;

	/**
	 * 
	 */
	private String created;

	/**
	 * 
	 */
	private String deleted;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}

	public String getRoleName(){
		return this.roleName;
	}

	public void setRealName(String realName){
		this.realName = realName;
	}

	public String getRealName(){
		return this.realName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return this.phone;
	}

	public void setIdCard(String idCard){
		this.idCard = idCard;
	}

	public String getIdCard(){
		return this.idCard;
	}

	public void setIdCardImg(String idCardImg){
		this.idCardImg = idCardImg;
	}

	public String getIdCardImg(){
		return this.idCardImg;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return this.status;
	}

	public void setLastLoginTime(Date lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLoginTime(){
		return this.lastLoginTime;
	}

	public void setOpenId(Integer openId){
		this.openId = openId;
	}

	public Integer getOpenId(){
		return this.openId;
	}

	public void setOpenImg(String openImg){
		this.openImg = openImg;
	}

	public String getOpenImg(){
		return this.openImg;
	}

	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	public String getCreateTime(){
		return this.createTime;
	}

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return this.updated;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return this.created;
	}

	public void setDeleted(String deleted){
		this.deleted = deleted;
	}

	public String getDeleted(){
		return this.deleted;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，账号:"+(userName == null ? "空" : userName)+"，密码:"+(password == null ? "空" : password)+"，昵称:"+(roleName == null ? "空" : roleName)+"，真实姓名:"+(realName == null ? "空" : realName)+"，邮箱:"+(email == null ? "空" : email)+"，手机号:"+(phone == null ? "空" : phone)+"，身份证号:"+(idCard == null ? "空" : idCard)+"，身份证图片:"+(idCardImg == null ? "空" : idCardImg)+"，状态:"+(status == null ? "空" : status)+"，最后登录时间:"+(lastLoginTime == null ? "空" : DateUtil.format(lastLoginTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，openId:"+(openId == null ? "空" : openId)+"，微信头像:"+(openImg == null ? "空" : openImg)+"，createTime:"+(createTime == null ? "空" : createTime)+"，updateTime:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，updated:"+(updated == null ? "空" : updated)+"，created:"+(created == null ? "空" : created)+"，deleted:"+(deleted == null ? "空" : deleted);
	}
}
