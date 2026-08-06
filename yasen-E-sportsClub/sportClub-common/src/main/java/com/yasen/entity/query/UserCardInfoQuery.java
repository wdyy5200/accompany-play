package com.yasen.entity.query;


import com.yasen.entity.vo.BaseParam;

/**
 * 用户身份信息表参数
 */
public class UserCardInfoQuery extends BaseParam {


	/**
	 * 身份证号
	 */
	private String userCardId;

	private String userCardIdFuzzy;

	/**
	 * 用户id
	 */
	private String userId;

	private String userIdFuzzy;

	/**
	 * 身份证正面
	 */
	private String userCardFont;

	private String userCardFontFuzzy;

	/**
	 * 身份证反面
	 */
	private String userCardReverse;

	private String userCardReverseFuzzy;

	/**
	 * 银行卡号
	 */
	private String userCardBankCard;

	private String userCardBankCardFuzzy;

	/**
	 * 开户行
	 */
	private String userCardOpeningBank;

	private String userCardOpeningBankFuzzy;

	/**
	 * 银行名称
	 */
	private String userCardBank;

	private String userCardBankFuzzy;


	public void setUserCardId(String userCardId){
		this.userCardId = userCardId;
	}

	public String getUserCardId(){
		return this.userCardId;
	}

	public void setUserCardIdFuzzy(String userCardIdFuzzy){
		this.userCardIdFuzzy = userCardIdFuzzy;
	}

	public String getUserCardIdFuzzy(){
		return this.userCardIdFuzzy;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return this.userId;
	}

	public void setUserIdFuzzy(String userIdFuzzy){
		this.userIdFuzzy = userIdFuzzy;
	}

	public String getUserIdFuzzy(){
		return this.userIdFuzzy;
	}

	public void setUserCardFont(String userCardFont){
		this.userCardFont = userCardFont;
	}

	public String getUserCardFont(){
		return this.userCardFont;
	}

	public void setUserCardFontFuzzy(String userCardFontFuzzy){
		this.userCardFontFuzzy = userCardFontFuzzy;
	}

	public String getUserCardFontFuzzy(){
		return this.userCardFontFuzzy;
	}

	public void setUserCardReverse(String userCardReverse){
		this.userCardReverse = userCardReverse;
	}

	public String getUserCardReverse(){
		return this.userCardReverse;
	}

	public void setUserCardReverseFuzzy(String userCardReverseFuzzy){
		this.userCardReverseFuzzy = userCardReverseFuzzy;
	}

	public String getUserCardReverseFuzzy(){
		return this.userCardReverseFuzzy;
	}

	public void setUserCardBankCard(String userCardBankCard){
		this.userCardBankCard = userCardBankCard;
	}

	public String getUserCardBankCard(){
		return this.userCardBankCard;
	}

	public void setUserCardBankCardFuzzy(String userCardBankCardFuzzy){
		this.userCardBankCardFuzzy = userCardBankCardFuzzy;
	}

	public String getUserCardBankCardFuzzy(){
		return this.userCardBankCardFuzzy;
	}

	public void setUserCardOpeningBank(String userCardOpeningBank){
		this.userCardOpeningBank = userCardOpeningBank;
	}

	public String getUserCardOpeningBank(){
		return this.userCardOpeningBank;
	}

	public void setUserCardOpeningBankFuzzy(String userCardOpeningBankFuzzy){
		this.userCardOpeningBankFuzzy = userCardOpeningBankFuzzy;
	}

	public String getUserCardOpeningBankFuzzy(){
		return this.userCardOpeningBankFuzzy;
	}

	public void setUserCardBank(String userCardBank){
		this.userCardBank = userCardBank;
	}

	public String getUserCardBank(){
		return this.userCardBank;
	}

	public void setUserCardBankFuzzy(String userCardBankFuzzy){
		this.userCardBankFuzzy = userCardBankFuzzy;
	}

	public String getUserCardBankFuzzy(){
		return this.userCardBankFuzzy;
	}

}
