
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
    "owner_support_dl_size",
    "owner_support_dl_email",
    "owner_support_dl_dl_name"
})
public class OwnerSupportDl {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl_size")
    private Object ownerSupportDlSize;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl_email")
    private String ownerSupportDlEmail;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl_dl_name")
    private String ownerSupportDlDlName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl_size")
    public Object getOwnerSupportDlSize() {
        return ownerSupportDlSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl_size")
    public void setOwnerSupportDlSize(Object ownerSupportDlSize) {
        this.ownerSupportDlSize = ownerSupportDlSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl_email")
    public String getOwnerSupportDlEmail() {
        return ownerSupportDlEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl_email")
    public void setOwnerSupportDlEmail(String ownerSupportDlEmail) {
        this.ownerSupportDlEmail = ownerSupportDlEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl_dl_name")
    public String getOwnerSupportDlDlName() {
        return ownerSupportDlDlName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner_support_dl_dl_name")
    public void setOwnerSupportDlDlName(String ownerSupportDlDlName) {
        this.ownerSupportDlDlName = ownerSupportDlDlName;
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
