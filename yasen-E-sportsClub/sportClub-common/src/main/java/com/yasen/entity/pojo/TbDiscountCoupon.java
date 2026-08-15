package com.yasen.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;


/**
 * 优惠卷表
 */
public class TbDiscountCoupon implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 类型
	 */
	private String types;

	/**
	 * 面值
	 */
	private BigDecimal price;

	/**
	 * 最低要求金额
	 */
	private BigDecimal minimumPrice;

	/**
	 * 已用数量
	 */
	private String usedQuantity;

	/**
	 * 总数量
	 */
	private Integer totalNumber;

	/**
	 * 开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date stratTime;

	/**
	 * 结束时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 
	 */
	private String created;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updated;

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
	 * 图片
	 */
	private String picture;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setTypes(String types){
		this.types = types;
	}

	public String getTypes(){
		return this.types;
	}

	public void setPrice(BigDecimal price){
		this.price = price;
	}

	public BigDecimal getPrice(){
		return this.price;
	}

	public void setMinimumPrice(BigDecimal minimumPrice){
		this.minimumPrice = minimumPrice;
	}

	public BigDecimal getMinimumPrice(){
		return this.minimumPrice;
	}

	public void setUsedQuantity(String usedQuantity){
		this.usedQuantity = usedQuantity;
	}

	public String getUsedQuantity(){
		return this.usedQuantity;
	}

	public void setTotalNumber(Integer totalNumber){
		this.totalNumber = totalNumber;
	}

	public Integer getTotalNumber(){
		return this.totalNumber;
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

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
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

	public void setPicture(String picture){
		this.picture = picture;
	}

	public String getPicture(){
		return this.picture;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，名称:"+(name == null ? "空" : name)+"，类型:"+(types == null ? "空" : types)+"，面值:"+(price == null ? "空" : price)+"，最低要求金额:"+(minimumPrice == null ? "空" : minimumPrice)+"，已用数量:"+(usedQuantity == null ? "空" : usedQuantity)+"，总数量:"+(totalNumber == null ? "空" : totalNumber)+"，开始时间:"+(stratTime == null ? "空" : DateUtil.format(stratTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，结束时间:"+(endTime == null ? "空" : DateUtil.format(endTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，状态:"+(status == null ? "空" : status)+"，created:"+(created == null ? "空" : created)+"，updated:"+(updated == null ? "空" : DateUtil.format(updated, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，updateTime:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，图片:"+(picture == null ? "空" : picture);
	}
}
