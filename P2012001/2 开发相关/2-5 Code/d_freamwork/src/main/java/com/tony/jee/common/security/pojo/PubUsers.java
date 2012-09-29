package com.rstco.frame.pub.security.entity;

import java.util.Collection;
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
import org.hibernate.annotations.Proxy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * PubUsers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Proxy(lazy = false)
@Table(name = "pub_users")
public class PubUsers  implements java.io.Serializable {

	// Fields
	private String userId;
	private String userAccount;
	private String userName;
	private String userPassword;
	private String userDesc;
	private Integer enabled;
	private Integer issys;
	private Integer securityLevel;

	private Set<PubUsersRoles> pubUsersRoleses = new HashSet<PubUsersRoles>(0);

	// Constructors

	/** default constructor */
	public PubUsers() {
	}

	/** minimal constructor */
	public PubUsers(String userAccount, String userName, String userPassword,
			String userDesc, Integer enabled, Integer issys) {
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userDesc = userDesc;
		this.enabled = enabled;
		this.issys = issys;
	}

	/** full constructor */
	public PubUsers(String userAccount, String userName, String userPassword,
			String userDesc, Integer enabled, Integer issys,
			Set<PubUsersRoles> pubUsersRoleses) {
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userDesc = userDesc;
		this.enabled = enabled;
		this.issys = issys;
		this.pubUsersRoleses = pubUsersRoleses;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "user_id", unique = true, nullable = false, length = 32)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "user_account", nullable = false, length = 30)
	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	@Column(name = "user_name", nullable = false, length = 40)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_password", nullable = false, length = 100)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "user_desc", nullable = false, length = 100)
	public String getUserDesc() {
		return this.userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
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
	
	@Column(name = "security_level", nullable = false)
	public Integer getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(Integer securityLevel) {
		this.securityLevel = securityLevel;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pubUsers")
	public Set<PubUsersRoles> getPubUsersRoleses() {
		return this.pubUsersRoleses;
	}

	public void setPubUsersRoleses(Set<PubUsersRoles> pubUsersRoleses) {
		this.pubUsersRoleses = pubUsersRoleses;
	}


}