package com.yasen.entity.pojo;

import java.io.Serializable;


/**
 * 配置订单关联表
 */
public class TbConfigProdrict implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 配置表
	 */
	private Integer configId;

	/**
	 * 商品表
	 */
	private Integer prodrictId;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setConfigId(Integer configId){
		this.configId = configId;
	}

	public Integer getConfigId(){
		return this.configId;
	}

	public void setProdrictId(Integer prodrictId){
		this.prodrictId = prodrictId;
	}

	public Integer getProdrictId(){
		return this.prodrictId;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，配置表:"+(configId == null ? "空" : configId)+"，商品表:"+(prodrictId == null ? "空" : prodrictId);
	}
}
