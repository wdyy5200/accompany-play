package com.yasen.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;


/**
 * 积分信息表
 */
public class TbPoints implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 可用积分
	 */
	private BigDecimal availablePoints;

	/**
	 * 总积分
	 */
	private BigDecimal totalNumberPoints;

	/**
	 * 已消费积分
	 */
	private BigDecimal consumedPoints;

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

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return this.userId;
	}

	public void setAvailablePoints(BigDecimal availablePoints){
		this.availablePoints = availablePoints;
	}

	public BigDecimal getAvailablePoints(){
		return this.availablePoints;
	}

	public void setTotalNumberPoints(BigDecimal totalNumberPoints){
		this.totalNumberPoints = totalNumberPoints;
	}

	public BigDecimal getTotalNumberPoints(){
		return this.totalNumberPoints;
	}

	public void setConsumedPoints(BigDecimal consumedPoints){
		this.consumedPoints = consumedPoints;
	}

	public BigDecimal getConsumedPoints(){
		return this.consumedPoints;
	}

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，userId:"+(userId == null ? "空" : userId)+"，可用积分:"+(availablePoints == null ? "空" : availablePoints)+"，总积分:"+(totalNumberPoints == null ? "空" : totalNumberPoints)+"，已消费积分:"+(consumedPoints == null ? "空" : consumedPoints)+"，修改时间:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
