package com.yasen.entity.pojo;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 打手金额日志表
 */
public class TbOrderPriceInfo implements Serializable {


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
	 * 订单id
	 */
	private Integer orderId;

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

	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}

	public Integer getOrderId(){
		return this.orderId;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，打手id:"+(empId == null ? "空" : empId)+"，金额:"+(price == null ? "空" : price)+"，订单id:"+(orderId == null ? "空" : orderId);
	}
}
