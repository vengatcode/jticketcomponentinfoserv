
package com.paypal.springbootstarter.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "git_org",
    "git_url",
    "git_bu",
    "git_owners"
})
public class GitRepo {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_org")
    private String gitOrg;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_url")
    private String gitUrl;
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
    @JsonProperty("git_owners")
    private List<Object> gitOwners = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_org")
    public String getGitOrg() {
        return gitOrg;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_org")
    public void setGitOrg(String gitOrg) {
        this.gitOrg = gitOrg;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_url")
    public String getGitUrl() {
        return gitUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_url")
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
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
    @JsonProperty("git_owners")
    public List<Object> getGitOwners() {
        return gitOwners;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_owners")
    public void setGitOwners(List<Object> gitOwners) {
        this.gitOwners = gitOwners;
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
