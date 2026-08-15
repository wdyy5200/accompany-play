package com.yasen.entity.pojo;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 打手金额表
 */
public class TbPrice implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 总金额
	 */
	private BigDecimal price;

	/**
	 * 今日金额
	 */
	private BigDecimal todayPrice;

	/**
	 * 可提现金额
	 */
	private BigDecimal withdrawalPrice;

	/**
	 * 已提现金额
	 */
	private BigDecimal withdrawnPrice;

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

	public void setPrice(BigDecimal price){
		this.price = price;
	}

	public BigDecimal getPrice(){
		return this.price;
	}

	public void setTodayPrice(BigDecimal todayPrice){
		this.todayPrice = todayPrice;
	}

	public BigDecimal getTodayPrice(){
		return this.todayPrice;
	}

	public void setWithdrawalPrice(BigDecimal withdrawalPrice){
		this.withdrawalPrice = withdrawalPrice;
	}

	public BigDecimal getWithdrawalPrice(){
		return this.withdrawalPrice;
	}

	public void setWithdrawnPrice(BigDecimal withdrawnPrice){
		this.withdrawnPrice = withdrawnPrice;
	}

	public BigDecimal getWithdrawnPrice(){
		return this.withdrawnPrice;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，userId:"+(userId == null ? "空" : userId)+"，总金额:"+(price == null ? "空" : price)+"，今日金额:"+(todayPrice == null ? "空" : todayPrice)+"，可提现金额:"+(withdrawalPrice == null ? "空" : withdrawalPrice)+"，已提现金额:"+(withdrawnPrice == null ? "空" : withdrawnPrice);
	}
}
