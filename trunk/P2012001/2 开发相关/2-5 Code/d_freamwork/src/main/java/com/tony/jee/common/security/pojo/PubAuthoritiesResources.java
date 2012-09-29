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
import org.hibernate.annotations.Proxy;

/**
 * PubAuthoritiesResources entity. @author MyEclipse Persistence Tools
 */
@Entity
@Proxy(lazy = false)
@Table(name = "pub_authorities_resources")
public class PubAuthoritiesResources implements java.io.Serializable {

	// Fields

	private Long id;
	private PubAuthorities pubAuthorities;
	private PubResources pubResources;
	private Integer enabled;

	// Constructors

	/** default constructor */
	public PubAuthoritiesResources() {
	}

	/** full constructor */
	public PubAuthoritiesResources(PubAuthorities pubAuthorities,
			PubResources pubResources, Integer enabled) {
		this.pubAuthorities = pubAuthorities;
		this.pubResources = pubResources;
		this.enabled = enabled;
	}

	// Property accessors
	//@GenericGenerator(name = "generator", strategy = "uuid.hex")
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
	@JoinColumn(name = "resource_id", nullable = false)
	public PubResources getPubResources() {
		return this.pubResources;
	}

	public void setPubResources(PubResources pubResources) {
		this.pubResources = pubResources;
	}

	@Column(name = "enabled", nullable = false)
	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

}