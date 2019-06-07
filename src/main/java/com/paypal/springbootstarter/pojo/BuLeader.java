
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
    "bu_leader_login",
    "bu_leader_email",
    "bu_leader_name"
})
public class BuLeader {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader_login")
    private String buLeaderLogin;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader_email")
    private String buLeaderEmail;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader_name")
    private String buLeaderName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader_login")
    public String getBuLeaderLogin() {
        return buLeaderLogin;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader_login")
    public void setBuLeaderLogin(String buLeaderLogin) {
        this.buLeaderLogin = buLeaderLogin;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader_email")
    public String getBuLeaderEmail() {
        return buLeaderEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader_email")
    public void setBuLeaderEmail(String buLeaderEmail) {
        this.buLeaderEmail = buLeaderEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader_name")
    public String getBuLeaderName() {
        return buLeaderName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bu_leader_name")
    public void setBuLeaderName(String buLeaderName) {
        this.buLeaderName = buLeaderName;
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
