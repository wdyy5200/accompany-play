package com.yasen.entity.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.util.Date;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 用户信息表
 */
public class UserInfo implements Serializable {


	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 手机号
	 */
	@JsonIgnore
	private String phone;

	/**
	 * 头像
	 */
	private String avatar;

	/**
	 * 职位
	 */
	private String job;

	/**
	 * 公司
	 */
	private String company;

	/**
	 * 昵称
	 */
	private String userName;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 最后登录时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastLoginTime;

	/**
	 * 金额
	 */
	private BigDecimal userMoney;


	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return this.userId;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return this.status;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return this.phone;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return this.avatar;
	}

	public void setJob(String job){
		this.job = job;
	}

	public String getJob(){
		return this.job;
	}

	public void setCompany(String company){
		this.company = company;
	}

	public String getCompany(){
		return this.company;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	public void setLastLoginTime(Date lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLoginTime(){
		return this.lastLoginTime;
	}

	public void setUserMoney(BigDecimal userMoney){
		this.userMoney = userMoney;
	}

	public BigDecimal getUserMoney(){
		return this.userMoney;
	}

	@Override
	public String toString (){
		return "用户ID:"+(userId == null ? "空" : userId)+"，密码:"+(password == null ? "空" : password)+"，状态:"+(status == null ? "空" : status)+"，手机号:"+(phone == null ? "空" : phone)+"，头像:"+(avatar == null ? "空" : avatar)+"，职位:"+(job == null ? "空" : job)+"，公司:"+(company == null ? "空" : company)+"，昵称:"+(userName == null ? "空" : userName)+"，邮箱:"+(email == null ? "空" : email)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，最后登录时间:"+(lastLoginTime == null ? "空" : DateUtil.format(lastLoginTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，金额:"+(userMoney == null ? "空" : userMoney);
	}
}
