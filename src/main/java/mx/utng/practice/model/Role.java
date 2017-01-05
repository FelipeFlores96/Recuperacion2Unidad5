package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
	@Id @GeneratedValue
	private Long roleId;
	@Column(length=50)
	private String portalId;
	@Column(length=50)
	private String roleName;
	@Column(length=50)
	private String description;
	@Column(length=50)
	private String serviceFee;
	@Column(length=50)
	private String billingFrequency;
	@Column(length=50)
	private String trialPeriod;
	@Column(length=50)
	private String trialFrequency;
	@Column(length=50)
	private String billingPeriod;
	@Column(length=50)
	private String trialFee;
	@Column(length=50)
	private String isPublic;
	@Column(length=50)
	private String autoAssignament;
	@Column(length=50)
	private String roleGroupId;
	public Role(String portalId, String roleName, String description, String serviceFee,
			String billingFrequency, String trialPeriod, String trialFrequency, String billingPeriod, String trialFee,
			String isPublic, String autoAssignament, String roleGroupId) {
		super();
		this.portalId = portalId;
		this.roleName = roleName;
		this.description = description;
		this.serviceFee = serviceFee;
		this.billingFrequency = billingFrequency;
		this.trialPeriod = trialPeriod;
		this.trialFrequency = trialFrequency;
		this.billingPeriod = billingPeriod;
		this.trialFee = trialFee;
		this.isPublic = isPublic;
		this.autoAssignament = autoAssignament;
		this.roleGroupId = roleGroupId;
	}
	public Role() {
		this("","","","","","","","","","","","");
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getPortalId() {
		return portalId;
	}
	public void setPortalId(String portalId) {
		this.portalId = portalId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}
	public String getBillingFrequency() {
		return billingFrequency;
	}
	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
	}
	public String getTrialPeriod() {
		return trialPeriod;
	}
	public void setTrialPeriod(String trialPeriod) {
		this.trialPeriod = trialPeriod;
	}
	public String getTrialFrequency() {
		return trialFrequency;
	}
	public void setTrialFrequency(String trialFrequency) {
		this.trialFrequency = trialFrequency;
	}
	public String getBillingPeriod() {
		return billingPeriod;
	}
	public void setBillingPeriod(String billingPeriod) {
		this.billingPeriod = billingPeriod;
	}
	public String getTrialFee() {
		return trialFee;
	}
	public void setTrialFee(String trialFee) {
		this.trialFee = trialFee;
	}
	public String getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}
	public String getAutoAssignament() {
		return autoAssignament;
	}
	public void setAutoAssignament(String autoAssignament) {
		this.autoAssignament = autoAssignament;
	}
	public String getRoleGroupId() {
		return roleGroupId;
	}
	public void setRoleGroupId(String roleGroupId) {
		this.roleGroupId = roleGroupId;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", portalId=" + portalId + ", roleName=" + roleName + ", description="
				+ description + ", serviceFee=" + serviceFee + ", billingFrequency=" + billingFrequency
				+ ", trialPeriod=" + trialPeriod + ", trialFrequency=" + trialFrequency + ", billingPeriod="
				+ billingPeriod + ", trialFee=" + trialFee + ", isPublic=" + isPublic + ", autoAssignament="
				+ autoAssignament + ", roleGroupId=" + roleGroupId + "]";
	}
	
	
	
}
