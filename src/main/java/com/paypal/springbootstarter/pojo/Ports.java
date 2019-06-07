
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
    "port_live",
    "port_stage",
    "port_sandbox"
})
public class Ports {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("port_live")
    private String portLive;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("port_stage")
    private String portStage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("port_sandbox")
    private String portSandbox;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("port_live")
    public String getPortLive() {
        return portLive;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("port_live")
    public void setPortLive(String portLive) {
        this.portLive = portLive;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("port_stage")
    public String getPortStage() {
        return portStage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("port_stage")
    public void setPortStage(String portStage) {
        this.portStage = portStage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("port_sandbox")
    public String getPortSandbox() {
        return portSandbox;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("port_sandbox")
    public void setPortSandbox(String portSandbox) {
        this.portSandbox = portSandbox;
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
