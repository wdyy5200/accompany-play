package com.yasen.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;


/**
 * 商品信息表
 */
public class TbProdrict implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 名称
	 */
	private Integer prodName;

	/**
	 * 原价
	 */
	private BigDecimal prodPrice;

	/**
	 * 标题
	 */
	private String prodTitle;

	/**
	 * 折扣价
	 */
	private BigDecimal prodDiscPrice;

	/**
	 * 图片
	 */
	private String peodImg;

	/**
	 * 开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date prodStartTime;

	/**
	 * 结束时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date prodEndTime;

	/**
	 * 
	 */
	private String prodContent;

	/**
	 * 内容
	 */
	private String prodText;

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
	private String deleted;

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
	 * 是否发布
	 */
	private Integer prodStatus;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setProdName(Integer prodName){
		this.prodName = prodName;
	}

	public Integer getProdName(){
		return this.prodName;
	}

	public void setProdPrice(BigDecimal prodPrice){
		this.prodPrice = prodPrice;
	}

	public BigDecimal getProdPrice(){
		return this.prodPrice;
	}

	public void setProdTitle(String prodTitle){
		this.prodTitle = prodTitle;
	}

	public String getProdTitle(){
		return this.prodTitle;
	}

	public void setProdDiscPrice(BigDecimal prodDiscPrice){
		this.prodDiscPrice = prodDiscPrice;
	}

	public BigDecimal getProdDiscPrice(){
		return this.prodDiscPrice;
	}

	public void setPeodImg(String peodImg){
		this.peodImg = peodImg;
	}

	public String getPeodImg(){
		return this.peodImg;
	}

	public void setProdStartTime(Date prodStartTime){
		this.prodStartTime = prodStartTime;
	}

	public Date getProdStartTime(){
		return this.prodStartTime;
	}

	public void setProdEndTime(Date prodEndTime){
		this.prodEndTime = prodEndTime;
	}

	public Date getProdEndTime(){
		return this.prodEndTime;
	}

	public void setProdContent(String prodContent){
		this.prodContent = prodContent;
	}

	public String getProdContent(){
		return this.prodContent;
	}

	public void setProdText(String prodText){
		this.prodText = prodText;
	}

	public String getProdText(){
		return this.prodText;
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

	public void setDeleteTime(Date deleteTime){
		this.deleteTime = deleteTime;
	}

	public Date getDeleteTime(){
		return this.deleteTime;
	}

	public void setProdStatus(Integer prodStatus){
		this.prodStatus = prodStatus;
	}

	public Integer getProdStatus(){
		return this.prodStatus;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，名称:"+(prodName == null ? "空" : prodName)+"，原价:"+(prodPrice == null ? "空" : prodPrice)+"，标题:"+(prodTitle == null ? "空" : prodTitle)+"，折扣价:"+(prodDiscPrice == null ? "空" : prodDiscPrice)+"，图片:"+(peodImg == null ? "空" : peodImg)+"，开始时间:"+(prodStartTime == null ? "空" : DateUtil.format(prodStartTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，结束时间:"+(prodEndTime == null ? "空" : DateUtil.format(prodEndTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，prodContent:"+(prodContent == null ? "空" : prodContent)+"，内容:"+(prodText == null ? "空" : prodText)+"，created:"+(created == null ? "空" : created)+"，updated:"+(updated == null ? "空" : DateUtil.format(updated, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，deleted:"+(deleted == null ? "空" : deleted)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，updateTime:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，deleteTime:"+(deleteTime == null ? "空" : DateUtil.format(deleteTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，是否发布:"+(prodStatus == null ? "空" : prodStatus);
	}
}
