package com.yasen.entity.query;

import com.yasen.entity.vo.BaseParam;

import java.util.Date;


/**
 * 用户信息表参数
 */
public class TbUserQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 账号
	 */
	private String userName;

	private String userNameFuzzy;

	/**
	 * 密码
	 */
	private String password;

	private String passwordFuzzy;

	/**
	 * 昵称
	 */
	private String roleName;

	private String roleNameFuzzy;

	/**
	 * 真实姓名
	 */
	private String realName;

	private String realNameFuzzy;

	/**
	 * 邮箱
	 */
	private String email;

	private String emailFuzzy;

	/**
	 * 手机号
	 */
	private String phone;

	private String phoneFuzzy;

	/**
	 * 身份证号
	 */
	private String idCard;

	private String idCardFuzzy;

	/**
	 * 身份证图片
	 */
	private String idCardImg;

	private String idCardImgFuzzy;

	/**
	 * 状态
	 */
	private String status;

	private String statusFuzzy;

	/**
	 * 最后登录时间
	 */
	private String lastLoginTime;

	private String lastLoginTimeStart;

	private String lastLoginTimeEnd;

	/**
	 * 微信openId
	 */
	private String openId;

	/**
	 * 微信头像
	 */
	private String openImg;

	private String openImgFuzzy;

	/**
	 * 
	 */
	private String createTime;

	private String createTimeFuzzy;

	/**
	 * 
	 */
	private String updateTime;

	private String updateTimeStart;

	private String updateTimeEnd;

	/**
	 * 
	 */
	private String updated;

	private String updatedFuzzy;

	/**
	 * 
	 */
	private String created;

	private String createdFuzzy;

	/**
	 * 
	 */
	private String deleted;

	private String deletedFuzzy;


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

	public void setUserNameFuzzy(String userNameFuzzy){
		this.userNameFuzzy = userNameFuzzy;
	}

	public String getUserNameFuzzy(){
		return this.userNameFuzzy;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setPasswordFuzzy(String passwordFuzzy){
		this.passwordFuzzy = passwordFuzzy;
	}

	public String getPasswordFuzzy(){
		return this.passwordFuzzy;
	}

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}

	public String getRoleName(){
		return this.roleName;
	}

	public void setRoleNameFuzzy(String roleNameFuzzy){
		this.roleNameFuzzy = roleNameFuzzy;
	}

	public String getRoleNameFuzzy(){
		return this.roleNameFuzzy;
	}

	public void setRealName(String realName){
		this.realName = realName;
	}

	public String getRealName(){
		return this.realName;
	}

	public void setRealNameFuzzy(String realNameFuzzy){
		this.realNameFuzzy = realNameFuzzy;
	}

	public String getRealNameFuzzy(){
		return this.realNameFuzzy;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmailFuzzy(String emailFuzzy){
		this.emailFuzzy = emailFuzzy;
	}

	public String getEmailFuzzy(){
		return this.emailFuzzy;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return this.phone;
	}

	public void setPhoneFuzzy(String phoneFuzzy){
		this.phoneFuzzy = phoneFuzzy;
	}

	public String getPhoneFuzzy(){
		return this.phoneFuzzy;
	}

	public void setIdCard(String idCard){
		this.idCard = idCard;
	}

	public String getIdCard(){
		return this.idCard;
	}

	public void setIdCardFuzzy(String idCardFuzzy){
		this.idCardFuzzy = idCardFuzzy;
	}

	public String getIdCardFuzzy(){
		return this.idCardFuzzy;
	}

	public void setIdCardImg(String idCardImg){
		this.idCardImg = idCardImg;
	}

	public String getIdCardImg(){
		return this.idCardImg;
	}

	public void setIdCardImgFuzzy(String idCardImgFuzzy){
		this.idCardImgFuzzy = idCardImgFuzzy;
	}

	public String getIdCardImgFuzzy(){
		return this.idCardImgFuzzy;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return this.status;
	}

	public void setStatusFuzzy(String statusFuzzy){
		this.statusFuzzy = statusFuzzy;
	}

	public String getStatusFuzzy(){
		return this.statusFuzzy;
	}

	public void setLastLoginTime(String lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginTime(){
		return this.lastLoginTime;
	}

	public void setLastLoginTimeStart(String lastLoginTimeStart){
		this.lastLoginTimeStart = lastLoginTimeStart;
	}

	public String getLastLoginTimeStart(){
		return this.lastLoginTimeStart;
	}
	public void setLastLoginTimeEnd(String lastLoginTimeEnd){
		this.lastLoginTimeEnd = lastLoginTimeEnd;
	}

	public String getLastLoginTimeEnd(){
		return this.lastLoginTimeEnd;
	}

	public void setOpenId(String openId){
		this.openId = openId;
	}

	public String getOpenId(){
		return this.openId;
	}

	public void setOpenImg(String openImg){
		this.openImg = openImg;
	}

	public String getOpenImg(){
		return this.openImg;
	}

	public void setOpenImgFuzzy(String openImgFuzzy){
		this.openImgFuzzy = openImgFuzzy;
	}

	public String getOpenImgFuzzy(){
		return this.openImgFuzzy;
	}

	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	public String getCreateTime(){
		return this.createTime;
	}

	public void setCreateTimeFuzzy(String createTimeFuzzy){
		this.createTimeFuzzy = createTimeFuzzy;
	}

	public String getCreateTimeFuzzy(){
		return this.createTimeFuzzy;
	}

	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	public String getUpdateTime(){
		return this.updateTime;
	}

	public void setUpdateTimeStart(String updateTimeStart){
		this.updateTimeStart = updateTimeStart;
	}

	public String getUpdateTimeStart(){
		return this.updateTimeStart;
	}
	public void setUpdateTimeEnd(String updateTimeEnd){
		this.updateTimeEnd = updateTimeEnd;
	}

	public String getUpdateTimeEnd(){
		return this.updateTimeEnd;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return this.updated;
	}

	public void setUpdatedFuzzy(String updatedFuzzy){
		this.updatedFuzzy = updatedFuzzy;
	}

	public String getUpdatedFuzzy(){
		return this.updatedFuzzy;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return this.created;
	}

	public void setCreatedFuzzy(String createdFuzzy){
		this.createdFuzzy = createdFuzzy;
	}

	public String getCreatedFuzzy(){
		return this.createdFuzzy;
	}

	public void setDeleted(String deleted){
		this.deleted = deleted;
	}

	public String getDeleted(){
		return this.deleted;
	}

	public void setDeletedFuzzy(String deletedFuzzy){
		this.deletedFuzzy = deletedFuzzy;
	}

	public String getDeletedFuzzy(){
		return this.deletedFuzzy;
	}

}
