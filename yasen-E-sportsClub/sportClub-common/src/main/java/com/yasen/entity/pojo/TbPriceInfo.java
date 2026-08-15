package com.yasen.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;


/**
 * 金额提现表
 */
public class TbPriceInfo implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 打手id
	 */
	private Integer empId;

	/**
	 * 金额
	 */
	private BigDecimal price;

	/**
	 * 状态0提现成功，1提现失败，2提现中，3提现成功
	 */
	private String status;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setEmpId(Integer empId){
		this.empId = empId;
	}

	public Integer getEmpId(){
		return this.empId;
	}

	public void setPrice(BigDecimal price){
		this.price = price;
	}

	public BigDecimal getPrice(){
		return this.price;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return this.status;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，打手id:"+(empId == null ? "空" : empId)+"，金额:"+(price == null ? "空" : price)+"，状态0提现成功，1提现失败，2提现中，3提现成功:"+(status == null ? "空" : status)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
