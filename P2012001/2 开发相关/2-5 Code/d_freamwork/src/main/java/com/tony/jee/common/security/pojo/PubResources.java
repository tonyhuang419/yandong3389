package com.tony.jee.common.security.pojo;

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
 * PubResources entity. @author MyEclipse Persistence Tools
 */
public class PubResources implements java.io.Serializable {

	// Fields

	private String resourceId;
	private String resourceName;
	private String resourceDesc;
	private String resourceType;
	private String resourceString;
	private Integer priority;
	private Integer enabled;
	private Integer issys;
	private Set<PubAuthoritiesResources> pubAuthoritiesResourceses = new HashSet<PubAuthoritiesResources>(
			0);

	// Constructors

	/** default constructor */
	public PubResources() {
	}

	/** minimal constructor */
	public PubResources(String resourceName, String resourceDesc,
			String resourceType, String resourceString, Integer priority,
			Integer enabled, Integer issys) {
		this.resourceName = resourceName;
		this.resourceDesc = resourceDesc;
		this.resourceType = resourceType;
		this.resourceString = resourceString;
		this.priority = priority;
		this.enabled = enabled;
		this.issys = issys;
	}

	/** full constructor */
	public PubResources(String resourceName, String resourceDesc,
			String resourceType, String resourceString, Integer priority,
			Integer enabled, Integer issys,
			Set<PubAuthoritiesResources> pubAuthoritiesResourceses) {
		this.resourceName = resourceName;
		this.resourceDesc = resourceDesc;
		this.resourceType = resourceType;
		this.resourceString = resourceString;
		this.priority = priority;
		this.enabled = enabled;
		this.issys = issys;
		this.pubAuthoritiesResourceses = pubAuthoritiesResourceses;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "resource_id", unique = true, nullable = false, length = 32)
	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	@Column(name = "resource_name", nullable = false, length = 100)
	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	@Column(name = "resource_desc", nullable = false, length = 100)
	public String getResourceDesc() {
		return this.resourceDesc;
	}

	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}

	@Column(name = "resource_type", nullable = false, length = 40)
	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	@Column(name = "resource_string", nullable = false, length = 200)
	public String getResourceString() {
		return this.resourceString;
	}

	public void setResourceString(String resourceString) {
		this.resourceString = resourceString;
	}

	@Column(name = "priority", nullable = false)
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pubResources")
	public Set<PubAuthoritiesResources> getPubAuthoritiesResourceses() {
		return this.pubAuthoritiesResourceses;
	}

	public void setPubAuthoritiesResourceses(
			Set<PubAuthoritiesResources> pubAuthoritiesResourceses) {
		this.pubAuthoritiesResourceses = pubAuthoritiesResourceses;
	}

}