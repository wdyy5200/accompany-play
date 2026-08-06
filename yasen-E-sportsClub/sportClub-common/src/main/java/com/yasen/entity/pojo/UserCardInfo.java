package com.yasen.entity.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 用户身份信息表
 */
public class UserCardInfo implements Serializable {


	/**
	 * 身份证号
	 */
	private String userCardId;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 身份证正面
	 */
	private String userCardFont;

	/**
	 * 身份证反面
	 */
	private String userCardReverse;

	/**
	 * 银行卡号
	 */
	private String userCardBankCard;

	/**
	 * 开户行
	 */
	private String userCardOpeningBank;

	/**
	 * 银行名称
	 */
	private String userCardBank;


	public void setUserCardId(String userCardId){
		this.userCardId = userCardId;
	}

	public String getUserCardId(){
		return this.userCardId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return this.userId;
	}

	public void setUserCardFont(String userCardFont){
		this.userCardFont = userCardFont;
	}

	public String getUserCardFont(){
		return this.userCardFont;
	}

	public void setUserCardReverse(String userCardReverse){
		this.userCardReverse = userCardReverse;
	}

	public String getUserCardReverse(){
		return this.userCardReverse;
	}

	public void setUserCardBankCard(String userCardBankCard){
		this.userCardBankCard = userCardBankCard;
	}

	public String getUserCardBankCard(){
		return this.userCardBankCard;
	}

	public void setUserCardOpeningBank(String userCardOpeningBank){
		this.userCardOpeningBank = userCardOpeningBank;
	}

	public String getUserCardOpeningBank(){
		return this.userCardOpeningBank;
	}

	public void setUserCardBank(String userCardBank){
		this.userCardBank = userCardBank;
	}

	public String getUserCardBank(){
		return this.userCardBank;
	}

	@Override
	public String toString (){
		return "身份证号:"+(userCardId == null ? "空" : userCardId)+"，用户id:"+(userId == null ? "空" : userId)+"，身份证正面:"+(userCardFont == null ? "空" : userCardFont)+"，身份证反面:"+(userCardReverse == null ? "空" : userCardReverse)+"，银行卡号:"+(userCardBankCard == null ? "空" : userCardBankCard)+"，开户行:"+(userCardOpeningBank == null ? "空" : userCardOpeningBank)+"，银行名称:"+(userCardBank == null ? "空" : userCardBank);
	}
}
