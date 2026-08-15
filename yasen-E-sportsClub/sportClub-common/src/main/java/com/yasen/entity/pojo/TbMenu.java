package com.yasen.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.yasen.entity.enums.DateTimePatternEnum;
import com.yasen.utils.DateUtil;


/**
 * 菜单权限表
 */
public class TbMenu implements Serializable {


	/**
	 * 菜单ID
	 */
	private Long menuId;

	/**
	 * 菜单名称
	 */
	private String menuName;

	/**
	 * 父菜单ID
	 */
	private Long parentId;

	/**
	 * 显示顺序
	 */
	private Integer orderNum;

	/**
	 * 路由地址
	 */
	private String path;

	/**
	 * 组件路径
	 */
	private String component;

	/**
	 * 路由参数
	 */
	private String query;

	/**
	 * 路由名称
	 */
	private String routeName;

	/**
	 * 是否为外链（0是 1否）
	 */
	private Integer isFrame;

	/**
	 * 是否缓存（0缓存 1不缓存）
	 */
	private Integer isCache;

	/**
	 * 菜单类型（M目录 C菜单 F按钮）
	 */
	private String menuType;

	/**
	 * 菜单状态（0显示 1隐藏）
	 */
	private String visible;

	/**
	 * 菜单状态（0正常 1停用）
	 */
	private String status;

	/**
	 * 权限标识
	 */
	private String perms;

	/**
	 * 菜单图标
	 */
	private String icon;

	/**
	 * 创建者
	 */
	private String createBy;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 更新者
	 */
	private String updateBy;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 备注
	 */
	private String remark;

	public void setMenuId(Long menuId){
		this.menuId = menuId;
	}

	public Long getMenuId(){
		return this.menuId;
	}

	public void setMenuName(String menuName){
		this.menuName = menuName;
	}

	public String getMenuName(){
		return this.menuName;
	}

	public void setParentId(Long parentId){
		this.parentId = parentId;
	}

	public Long getParentId(){
		return this.parentId;
	}

	public void setOrderNum(Integer orderNum){
		this.orderNum = orderNum;
	}

	public Integer getOrderNum(){
		return this.orderNum;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return this.path;
	}

	public void setComponent(String component){
		this.component = component;
	}

	public String getComponent(){
		return this.component;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return this.query;
	}

	public void setRouteName(String routeName){
		this.routeName = routeName;
	}

	public String getRouteName(){
		return this.routeName;
	}

	public void setIsFrame(Integer isFrame){
		this.isFrame = isFrame;
	}

	public Integer getIsFrame(){
		return this.isFrame;
	}

	public void setIsCache(Integer isCache){
		this.isCache = isCache;
	}

	public Integer getIsCache(){
		return this.isCache;
	}

	public void setMenuType(String menuType){
		this.menuType = menuType;
	}

	public String getMenuType(){
		return this.menuType;
	}

	public void setVisible(String visible){
		this.visible = visible;
	}

	public String getVisible(){
		return this.visible;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return this.status;
	}

	public void setPerms(String perms){
		this.perms = perms;
	}

	public String getPerms(){
		return this.perms;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return this.icon;
	}

	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}

	public String getCreateBy(){
		return this.createBy;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}

	public String getUpdateBy(){
		return this.updateBy;
	}

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public String getRemark(){
		return this.remark;
	}

	@Override
	public String toString (){
		return "菜单ID:"+(menuId == null ? "空" : menuId)+"，菜单名称:"+(menuName == null ? "空" : menuName)+"，父菜单ID:"+(parentId == null ? "空" : parentId)+"，显示顺序:"+(orderNum == null ? "空" : orderNum)+"，路由地址:"+(path == null ? "空" : path)+"，组件路径:"+(component == null ? "空" : component)+"，路由参数:"+(query == null ? "空" : query)+"，路由名称:"+(routeName == null ? "空" : routeName)+"，是否为外链（0是 1否）:"+(isFrame == null ? "空" : isFrame)+"，是否缓存（0缓存 1不缓存）:"+(isCache == null ? "空" : isCache)+"，菜单类型（M目录 C菜单 F按钮）:"+(menuType == null ? "空" : menuType)+"，菜单状态（0显示 1隐藏）:"+(visible == null ? "空" : visible)+"，菜单状态（0正常 1停用）:"+(status == null ? "空" : status)+"，权限标识:"+(perms == null ? "空" : perms)+"，菜单图标:"+(icon == null ? "空" : icon)+"，创建者:"+(createBy == null ? "空" : createBy)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，更新者:"+(updateBy == null ? "空" : updateBy)+"，更新时间:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，备注:"+(remark == null ? "空" : remark);
	}
}
