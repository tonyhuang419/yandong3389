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
 * PubRolesAuthorities entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pub_roles_authorities")
public class PubRolesAuthorities implements java.io.Serializable {

	// Fields

	private Long id;
	private PubAuthorities pubAuthorities;
	private PubRoles pubRoles;
	private Integer enabled;

	// Constructors

	/** default constructor */
	public PubRolesAuthorities() {
	}

	/** full constructor */
	public PubRolesAuthorities(PubAuthorities pubAuthorities,
			PubRoles pubRoles, Integer enabled) {
		this.pubAuthorities = pubAuthorities;
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
	@JoinColumn(name = "authority_id", nullable = false)
	public PubAuthorities getPubAuthorities() {
		return this.pubAuthorities;
	}

	public void setPubAuthorities(PubAuthorities pubAuthorities) {
		this.pubAuthorities = pubAuthorities;
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