
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
    "status",
    "confirmed_by",
    "confirmed_on"
})
public class Verification {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private String status;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confirmed_by")
    private String confirmedBy;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confirmed_on")
    private String confirmedOn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confirmed_by")
    public String getConfirmedBy() {
        return confirmedBy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confirmed_by")
    public void setConfirmedBy(String confirmedBy) {
        this.confirmedBy = confirmedBy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confirmed_on")
    public String getConfirmedOn() {
        return confirmedOn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confirmed_on")
    public void setConfirmedOn(String confirmedOn) {
        this.confirmedOn = confirmedOn;
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
