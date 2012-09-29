package com.rstco.frame.pub.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
// default package

import org.hibernate.annotations.GenericGenerator;

/**
 * PubMenuitem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pub_menuitem")
public class PubMenuitem implements java.io.Serializable {

	// Fields

	private String menuId;
	private String parentName;
	private String name;
	private String title;
	private String description;
	private String location;
	private String target;
	private String onclick;
	private String onmouseover;
	private String image;
	private String altimage;
	private String tooltip;
	private String roles;
	private String page;
	private String width;
	private String height;
	private String forward;
	private String action;
	private String onmouseout;
	private String permissionId;
	private String sortcol;
	private String inUse;

	// Constructors

	/** default constructor */
	public PubMenuitem() {
	}

	/** minimal constructor */
	public PubMenuitem(String parentName, String name, String title,
			String description, String location, String target, String onclick,
			String onmouseover, String image, String altimage, String tooltip,
			String roles, String page, String width, String height,
			String forward, String action, String onmouseout, String sortcol) {
		this.parentName = parentName;
		this.name = name;
		this.title = title;
		this.description = description;
		this.location = location;
		this.target = target;
		this.onclick = onclick;
		this.onmouseover = onmouseover;
		this.image = image;
		this.altimage = altimage;
		this.tooltip = tooltip;
		this.roles = roles;
		this.page = page;
		this.width = width;
		this.height = height;
		this.forward = forward;
		this.action = action;
		this.onmouseout = onmouseout;
		this.sortcol = sortcol;
	}

	/** full constructor */
	public PubMenuitem(String parentName, String name, String title,
			String description, String location, String target, String onclick,
			String onmouseover, String image, String altimage, String tooltip,
			String roles, String page, String width, String height,
			String forward, String action, String onmouseout,
			String permissionId, String sortcol, String inUse) {
		this.parentName = parentName;
		this.name = name;
		this.title = title;
		this.description = description;
		this.location = location;
		this.target = target;
		this.onclick = onclick;
		this.onmouseover = onmouseover;
		this.image = image;
		this.altimage = altimage;
		this.tooltip = tooltip;
		this.roles = roles;
		this.page = page;
		this.width = width;
		this.height = height;
		this.forward = forward;
		this.action = action;
		this.onmouseout = onmouseout;
		this.permissionId = permissionId;
		this.sortcol = sortcol;
		this.inUse = inUse;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "menu_id", unique = true, nullable = false, length = 32)
	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	@Column(name = "parent_name", nullable = false, length = 64)
	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "title", nullable = false, length = 64)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description", nullable = false, length = 64)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "location", nullable = false, length = 255)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "target", nullable = false, length = 255)
	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Column(name = "onclick", nullable = false, length = 100)
	public String getOnclick() {
		return this.onclick;
	}

	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}

	@Column(name = "onmouseover", nullable = false, length = 100)
	public String getOnmouseover() {
		return this.onmouseover;
	}

	public void setOnmouseover(String onmouseover) {
		this.onmouseover = onmouseover;
	}

	@Column(name = "image", nullable = false, length = 64)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "altimage", nullable = false, length = 32)
	public String getAltimage() {
		return this.altimage;
	}

	public void setAltimage(String altimage) {
		this.altimage = altimage;
	}

	@Column(name = "tooltip", nullable = false, length = 100)
	public String getTooltip() {
		return this.tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	@Column(name = "roles", nullable = false, length = 255)
	public String getRoles() {
		return this.roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Column(name = "page", nullable = false, length = 255)
	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	@Column(name = "width", nullable = false, length = 8)
	public String getWidth() {
		return this.width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	@Column(name = "height", nullable = false, length = 8)
	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Column(name = "forward", nullable = false, length = 64)
	public String getForward() {
		return this.forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}

	@Column(name = "action", nullable = false, length = 64)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "onmouseout", nullable = false, length = 100)
	public String getOnmouseout() {
		return this.onmouseout;
	}

	public void setOnmouseout(String onmouseout) {
		this.onmouseout = onmouseout;
	}

	@Column(name = "permissionId", nullable = false, length = 32)
	public String getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	@Column(name = "sortcol", nullable = false, length = 32)
	public String getSortcol() {
		return this.sortcol;
	}

	public void setSortcol(String sortcol) {
		this.sortcol = sortcol;
	}

	@Column(name = "inuse", nullable = false, length = 2)
	public String getInUse() {
		return this.inUse;
	}

	public void setInUse(String inUse) {
		this.inUse = inUse;
	}

}