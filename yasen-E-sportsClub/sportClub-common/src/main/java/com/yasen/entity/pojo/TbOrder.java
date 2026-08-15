package com.yasen.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;


/**
 * 订单信息表
 */
public class TbOrder implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 商品id
	 */
	private Integer prodrictId;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 员工id
	 */
	private Integer employeeId;

	/**
	 * 状态0未接单，1接单，2.进行中。3结束，4异常，5流单，6未付款
	 */
	private Integer status;

	/**
	 * 下单时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 接单时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date stratTime;

	/**
	 * 结单时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;

	/**
	 * 备注
	 */
	private String note;

	/**
	 * 补单父id
	 */
	private Integer pid;

	/**
	 * 创建者
	 */
	private Integer created;

	/**
	 * 修改者
	 */
	private Integer updated;

	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setProdrictId(Integer prodrictId){
		this.prodrictId = prodrictId;
	}

	public Integer getProdrictId(){
		return this.prodrictId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return this.userId;
	}

	public void setEmployeeId(Integer employeeId){
		this.employeeId = employeeId;
	}

	public Integer getEmployeeId(){
		return this.employeeId;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return this.status;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	public void setStratTime(Date stratTime){
		this.stratTime = stratTime;
	}

	public Date getStratTime(){
		return this.stratTime;
	}

	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}

	public Date getEndTime(){
		return this.endTime;
	}

	public void setNote(String note){
		this.note = note;
	}

	public String getNote(){
		return this.note;
	}

	public void setPid(Integer pid){
		this.pid = pid;
	}

	public Integer getPid(){
		return this.pid;
	}

	public void setCreated(Integer created){
		this.created = created;
	}

	public Integer getCreated(){
		return this.created;
	}

	public void setUpdated(Integer updated){
		this.updated = updated;
	}

	public Integer getUpdated(){
		return this.updated;
	}

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，商品id:"+(prodrictId == null ? "空" : prodrictId)+"，用户id:"+(userId == null ? "空" : userId)+"，员工id:"+(employeeId == null ? "空" : employeeId)+"，状态0未接单，1接单，2.进行中。3结束，4异常，5流单，6未付款:"+(status == null ? "空" : status)+"，下单时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，接单时间:"+(stratTime == null ? "空" : DateUtil.format(stratTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，结单时间:"+(endTime == null ? "空" : DateUtil.format(endTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，备注:"+(note == null ? "空" : note)+"，补单父id:"+(pid == null ? "空" : pid)+"，创建者:"+(created == null ? "空" : created)+"，修改者:"+(updated == null ? "空" : updated)+"，修改时间:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
