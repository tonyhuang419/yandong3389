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
import org.hibernate.annotations.GenericGenerator;

/**
 * PubAuthorities entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pub_authorities")
public class PubAuthorities implements java.io.Serializable {

	// Fields
	private String authorityId;
	private String authorityName;
	private String authorityDesc;
	private Integer enabled;
	private Integer issys;
	
	private Set<PubRolesAuthorities> pubRolesAuthoritieses = new HashSet<PubRolesAuthorities>(
			0);
	private Set<PubAuthoritiesResources> pubAuthoritiesResourceses = new HashSet<PubAuthoritiesResources>(
			0);

	// Constructors

	/** default constructor */
	public PubAuthorities() {
	}

	/** minimal constructor */
	public PubAuthorities(String authorityName, String authorityDesc,
			Integer enabled, Integer issys) {
		this.authorityName = authorityName;
		this.authorityDesc = authorityDesc;
		this.enabled = enabled;
		this.issys = issys;
	}

	/** full constructor */
	public PubAuthorities(String authorityName, String authorityDesc,
			Integer enabled, Integer issys,
			Set<PubRolesAuthorities> pubRolesAuthoritieses,
			Set<PubAuthoritiesResources> pubAuthoritiesResourceses) {
		this.authorityName = authorityName;
		this.authorityDesc = authorityDesc;
		this.enabled = enabled;
		this.issys = issys;
		this.pubRolesAuthoritieses = pubRolesAuthoritieses;
		this.pubAuthoritiesResourceses = pubAuthoritiesResourceses;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "authority_id", unique = true, nullable = false, length = 32)
	public String getAuthorityId() {
		return this.authorityId;
	}

	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}

	@Column(name = "authority_name", nullable = false, length = 40)
	public String getAuthorityName() {
		return this.authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	@Column(name = "authority_desc", nullable = false, length = 100)
	public String getAuthorityDesc() {
		return this.authorityDesc;
	}

	public void setAuthorityDesc(String authorityDesc) {
		this.authorityDesc = authorityDesc;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pubAuthorities")
	public Set<PubRolesAuthorities> getPubRolesAuthoritieses() {
		return this.pubRolesAuthoritieses;
	}

	public void setPubRolesAuthoritieses(
			Set<PubRolesAuthorities> pubRolesAuthoritieses) {
		this.pubRolesAuthoritieses = pubRolesAuthoritieses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pubAuthorities")
	public Set<PubAuthoritiesResources> getPubAuthoritiesResourceses() {
		return this.pubAuthoritiesResourceses;
	}

	public void setPubAuthoritiesResourceses(
			Set<PubAuthoritiesResources> pubAuthoritiesResourceses) {
		this.pubAuthoritiesResourceses = pubAuthoritiesResourceses;
	}

}