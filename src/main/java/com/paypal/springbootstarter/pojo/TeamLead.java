
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
    "team_lead_login",
    "team_lead_email",
    "team_lead_name"
})
public class TeamLead {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead_login")
    private String teamLeadLogin;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead_email")
    private String teamLeadEmail;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead_name")
    private String teamLeadName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead_login")
    public String getTeamLeadLogin() {
        return teamLeadLogin;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead_login")
    public void setTeamLeadLogin(String teamLeadLogin) {
        this.teamLeadLogin = teamLeadLogin;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead_email")
    public String getTeamLeadEmail() {
        return teamLeadEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead_email")
    public void setTeamLeadEmail(String teamLeadEmail) {
        this.teamLeadEmail = teamLeadEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead_name")
    public String getTeamLeadName() {
        return teamLeadName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_lead_name")
    public void setTeamLeadName(String teamLeadName) {
        this.teamLeadName = teamLeadName;
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
