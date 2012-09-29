package com.rstco.frame.pub.security.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

/**
 * PubRoles entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pub_roles")
public class PubRoles implements java.io.Serializable {

	// Fields

	private String roleId;
	private String roleName;
	private String roleDesc;
	private Integer enabled;
	private Integer issys;
	private Set<PubUsersRoles> pubUsersRoleses = new HashSet<PubUsersRoles>(0);
	private Set<PubRolesAuthorities> pubRolesAuthoritieses = new HashSet<PubRolesAuthorities>(
			0);

	// Constructors

	/** default constructor */
	public PubRoles() {
	}

	/** minimal constructor */
	public PubRoles(String roleName, String roleDesc, Integer enabled,
			Integer issys) {
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.enabled = enabled;
		this.issys = issys;
	}

	/** full constructor */
	public PubRoles(String roleName, String roleDesc, Integer enabled,
			Integer issys, Set<PubUsersRoles> pubUsersRoleses,
			Set<PubRolesAuthorities> pubRolesAuthoritieses) {
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.enabled = enabled;
		this.issys = issys;
		this.pubUsersRoleses = pubUsersRoleses;
		this.pubRolesAuthoritieses = pubRolesAuthoritieses;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "role_id", unique = true, nullable = false, length = 32)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Column(name = "role_name", nullable = false, length = 40)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "role_desc", nullable = false, length = 100)
	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@Column(name = "enabled", nullable = false)
	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	@Column(name = "issys", nullable = false)
	public Integer getIssys() {
		return this.issys;
	}

	public void setIssys(Integer issys) {
		this.issys = issys;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pubRoles")
	public Set<PubUsersRoles> getPubUsersRoleses() {
		return this.pubUsersRoleses;
	}

	public void setPubUsersRoleses(Set<PubUsersRoles> pubUsersRoleses) {
		this.pubUsersRoleses = pubUsersRoleses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pubRoles")
	public Set<PubRolesAuthorities> getPubRolesAuthoritieses() {
		return this.pubRolesAuthoritieses;
	}

	public void setPubRolesAuthoritieses(
			Set<PubRolesAuthorities> pubRolesAuthoritieses) {
		this.pubRolesAuthoritieses = pubRolesAuthoritieses;
	}

}