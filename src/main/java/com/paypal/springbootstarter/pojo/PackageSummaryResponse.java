
package com.paypal.springbootstarter.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "repo_url",
    "package_name",
    "jira_key",
    "dependent_products",
    "domain_bu",
    "owner_support_dl",
    "git_bu",
    "package_repo",
    "domain_uuid",
    "bu_leader",
    "package_state",
    "domain_name",
    "business_unit",
    "total_cost_of_ownership",
    "is_sandbox",
    "package_description",
    "team_pagerduty_id",
    "owner_name",
    "package_source",
    "owner_dl",
    "owner_uuid",
    "is_paz",
    "team_lead",
    "team_manager",
    "git_repo",
    "package_uuid",
    "is_production",
    "package_type_name",
    "verification",
    "ports"
})
public class PackageSummaryResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("repo_url")
    private String repoUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_name")
    private String packageName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("jira_key")
    private String jiraKey;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dependent_products")
    private Object dependentProducts;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("domain_bu")
    private String domainBu;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl")
    private OwnerSupportDl ownerSupportDl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_bu")
    private String gitBu;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_repo")
    private Object packageRepo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("domain_uuid")
    private String domainUuid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader")
    private BuLeader buLeader;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_state")
    private String packageState;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("domain_name")
    private String domainName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("business_unit")
    private String businessUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_cost_of_ownership")
    private String totalCostOfOwnership;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_sandbox")
    private Boolean isSandbox;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_description")
    private Object packageDescription;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_pagerduty_id")
    private Object teamPagerdutyId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_name")
    private String ownerName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_source")
    private String packageSource;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl")
    private OwnerDl ownerDl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_uuid")
    private String ownerUuid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_paz")
    private Boolean isPaz;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead")
    private TeamLead teamLead;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager")
    private TeamManager teamManager;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_repo")
    private GitRepo gitRepo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_uuid")
    private String packageUuid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_production")
    private Boolean isProduction;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_type_name")
    private String packageTypeName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("verification")
    private Verification verification;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ports")
    private Ports ports;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("repo_url")
    public String getRepoUrl() {
        return repoUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("repo_url")
    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_name")
    public String getPackageName() {
        return packageName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_name")
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("jira_key")
    public String getJiraKey() {
        return jiraKey;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("jira_key")
    public void setJiraKey(String jiraKey) {
        this.jiraKey = jiraKey;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dependent_products")
    public Object getDependentProducts() {
        return dependentProducts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dependent_products")
    public void setDependentProducts(Object dependentProducts) {
        this.dependentProducts = dependentProducts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("domain_bu")
    public String getDomainBu() {
        return domainBu;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("domain_bu")
    public void setDomainBu(String domainBu) {
        this.domainBu = domainBu;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl")
    public OwnerSupportDl getOwnerSupportDl() {
        return ownerSupportDl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl")
    public void setOwnerSupportDl(OwnerSupportDl ownerSupportDl) {
        this.ownerSupportDl = ownerSupportDl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_bu")
    public String getGitBu() {
        return gitBu;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_bu")
    public void setGitBu(String gitBu) {
        this.gitBu = gitBu;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_repo")
    public Object getPackageRepo() {
        return packageRepo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_repo")
    public void setPackageRepo(Object packageRepo) {
        this.packageRepo = packageRepo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("domain_uuid")
    public String getDomainUuid() {
        return domainUuid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("domain_uuid")
    public void setDomainUuid(String domainUuid) {
        this.domainUuid = domainUuid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader")
    public BuLeader getBuLeader() {
        return buLeader;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader")
    public void setBuLeader(BuLeader buLeader) {
        this.buLeader = buLeader;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_state")
    public String getPackageState() {
        return packageState;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_state")
    public void setPackageState(String packageState) {
        this.packageState = packageState;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("domain_name")
    public String getDomainName() {
        return domainName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("domain_name")
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("business_unit")
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("business_unit")
    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_cost_of_ownership")
    public String getTotalCostOfOwnership() {
        return totalCostOfOwnership;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_cost_of_ownership")
    public void setTotalCostOfOwnership(String totalCostOfOwnership) {
        this.totalCostOfOwnership = totalCostOfOwnership;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_sandbox")
    public Boolean getIsSandbox() {
        return isSandbox;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_sandbox")
    public void setIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_description")
    public Object getPackageDescription() {
        return packageDescription;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_description")
    public void setPackageDescription(Object packageDescription) {
        this.packageDescription = packageDescription;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_pagerduty_id")
    public Object getTeamPagerdutyId() {
        return teamPagerdutyId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_pagerduty_id")
    public void setTeamPagerdutyId(Object teamPagerdutyId) {
        this.teamPagerdutyId = teamPagerdutyId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_name")
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_name")
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_source")
    public String getPackageSource() {
        return packageSource;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_source")
    public void setPackageSource(String packageSource) {
        this.packageSource = packageSource;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl")
    public OwnerDl getOwnerDl() {
        return ownerDl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl")
    public void setOwnerDl(OwnerDl ownerDl) {
        this.ownerDl = ownerDl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_uuid")
    public String getOwnerUuid() {
        return ownerUuid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_uuid")
    public void setOwnerUuid(String ownerUuid) {
        this.ownerUuid = ownerUuid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_paz")
    public Boolean getIsPaz() {
        return isPaz;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_paz")
    public void setIsPaz(Boolean isPaz) {
        this.isPaz = isPaz;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead")
    public TeamLead getTeamLead() {
        return teamLead;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead")
    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager")
    public TeamManager getTeamManager() {
        return teamManager;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager")
    public void setTeamManager(TeamManager teamManager) {
        this.teamManager = teamManager;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_repo")
    public GitRepo getGitRepo() {
        return gitRepo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_repo")
    public void setGitRepo(GitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_uuid")
    public String getPackageUuid() {
        return packageUuid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_uuid")
    public void setPackageUuid(String packageUuid) {
        this.packageUuid = packageUuid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_production")
    public Boolean getIsProduction() {
        return isProduction;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_production")
    public void setIsProduction(Boolean isProduction) {
        this.isProduction = isProduction;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_type_name")
    public String getPackageTypeName() {
        return packageTypeName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("package_type_name")
    public void setPackageTypeName(String packageTypeName) {
        this.packageTypeName = packageTypeName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("verification")
    public Verification getVerification() {
        return verification;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("verification")
    public void setVerification(Verification verification) {
        this.verification = verification;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ports")
    public Ports getPorts() {
        return ports;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ports")
    public void setPorts(Ports ports) {
        this.ports = ports;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
