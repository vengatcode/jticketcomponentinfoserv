
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
    "team_manager_email",
    "team_manager_name",
    "team_manager_login"
})
public class TeamManager {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager_email")
    private String teamManagerEmail;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager_name")
    private String teamManagerName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager_login")
    private String teamManagerLogin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager_email")
    public String getTeamManagerEmail() {
        return teamManagerEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager_email")
    public void setTeamManagerEmail(String teamManagerEmail) {
        this.teamManagerEmail = teamManagerEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager_name")
    public String getTeamManagerName() {
        return teamManagerName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager_name")
    public void setTeamManagerName(String teamManagerName) {
        this.teamManagerName = teamManagerName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager_login")
    public String getTeamManagerLogin() {
        return teamManagerLogin;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_manager_login")
    public void setTeamManagerLogin(String teamManagerLogin) {
        this.teamManagerLogin = teamManagerLogin;
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
