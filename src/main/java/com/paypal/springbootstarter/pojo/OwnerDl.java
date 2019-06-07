
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
    "owner_dl_size",
    "owner_dl_email",
    "owner_dl_dl_name"
})
public class OwnerDl {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl_size")
    private Object ownerDlSize;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl_email")
    private String ownerDlEmail;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl_dl_name")
    private String ownerDlDlName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl_size")
    public Object getOwnerDlSize() {
        return ownerDlSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl_size")
    public void setOwnerDlSize(Object ownerDlSize) {
        this.ownerDlSize = ownerDlSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl_email")
    public String getOwnerDlEmail() {
        return ownerDlEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl_email")
    public void setOwnerDlEmail(String ownerDlEmail) {
        this.ownerDlEmail = ownerDlEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl_dl_name")
    public String getOwnerDlDlName() {
        return ownerDlDlName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_dl_dl_name")
    public void setOwnerDlDlName(String ownerDlDlName) {
        this.ownerDlDlName = ownerDlDlName;
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
