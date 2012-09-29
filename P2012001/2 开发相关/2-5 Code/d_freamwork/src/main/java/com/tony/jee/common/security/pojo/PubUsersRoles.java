package com.rstco.frame.pub.security.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * PubUsersRoles entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pub_users_roles")
public class PubUsersRoles implements java.io.Serializable {

	// Fields

	private Long id;
	private PubUsers pubUsers;
	private PubRoles pubRoles;
	private Integer enabled;

	// Constructors

	/** default constructor */
	public PubUsersRoles() {
	}

	/** full constructor */
	public PubUsersRoles(PubUsers pubUsers, PubRoles pubRoles, Integer enabled) {
		this.pubUsers = pubUsers;
		this.pubRoles = pubRoles;
		this.enabled = enabled;
	}

	// Property accessors
 	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false, precision = 12, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public PubUsers getPubUsers() {
		return this.pubUsers;
	}

	public void setPubUsers(PubUsers pubUsers) {
		this.pubUsers = pubUsers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public PubRoles getPubRoles() {
		return this.pubRoles;
	}

	public void setPubRoles(PubRoles pubRoles) {
		this.pubRoles = pubRoles;
	}

	@Column(name = "enabled", nullable = false)
	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

}