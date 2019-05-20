
package com.fwd.demo.beans.response;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "__type",
    "ChildCount",
    "FamilyPlanBPremium",
    "FamilyPlanCount",
    "FamilyPlanPremium",
    "IndividualPlanBPremium",
    "IndividualPlanCount",
    "IndividualPlanPremium",
    "OtherCount",
    "SelfCount",
    "SpouseCount",
    "WithChildPlanBPremium",
    "WithChildPlanCount",
    "WithChildPlanPremium"
})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InsuredSummary {

	
	@XmlElement( name="__type")
    @JsonProperty("__type")
    private String type;
	
	@XmlElement
    @JsonProperty("ChildCount")
    private Integer childCount;
	
	@XmlElement
    @JsonProperty("FamilyPlanBPremium")
    private Integer familyPlanBPremium;
	
	@XmlElement
    @JsonProperty("FamilyPlanCount")
    private Integer familyPlanCount;
	
	@XmlElement
    @JsonProperty("FamilyPlanPremium")
    private Integer familyPlanPremium;
	
	@XmlElement
    @JsonProperty("IndividualPlanBPremium")
    private Integer individualPlanBPremium;
	
	@XmlElement
    @JsonProperty("IndividualPlanCount")
    private Integer individualPlanCount;
	
	@XmlElement
    @JsonProperty("IndividualPlanPremium")
    private Integer individualPlanPremium;
	
	@XmlElement
    @JsonProperty("OtherCount")
    private Integer otherCount;
	
	@XmlElement
    @JsonProperty("SelfCount")
    private Integer selfCount;
	
	@XmlElement
    @JsonProperty("SpouseCount")
    private Integer spouseCount;
	
	@XmlElement
    @JsonProperty("WithChildPlanBPremium")
    private Integer withChildPlanBPremium;
	
	@XmlElement
    @JsonProperty("WithChildPlanCount")
    private Integer withChildPlanCount;
	
	@XmlElement
    @JsonProperty("WithChildPlanPremium")
    private Integer withChildPlanPremium;
	
	@XmlTransient
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("__type")
    public String getType() {
        return type;
    }

    @JsonProperty("__type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("ChildCount")
    public Integer getChildCount() {
        return childCount;
    }

    @JsonProperty("ChildCount")
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    @JsonProperty("FamilyPlanBPremium")
    public Integer getFamilyPlanBPremium() {
        return familyPlanBPremium;
    }

    @JsonProperty("FamilyPlanBPremium")
    public void setFamilyPlanBPremium(Integer familyPlanBPremium) {
        this.familyPlanBPremium = familyPlanBPremium;
    }

    @JsonProperty("FamilyPlanCount")
    public Integer getFamilyPlanCount() {
        return familyPlanCount;
    }

    @JsonProperty("FamilyPlanCount")
    public void setFamilyPlanCount(Integer familyPlanCount) {
        this.familyPlanCount = familyPlanCount;
    }

    @JsonProperty("FamilyPlanPremium")
    public Integer getFamilyPlanPremium() {
        return familyPlanPremium;
    }

    @JsonProperty("FamilyPlanPremium")
    public void setFamilyPlanPremium(Integer familyPlanPremium) {
        this.familyPlanPremium = familyPlanPremium;
    }

    @JsonProperty("IndividualPlanBPremium")
    public Integer getIndividualPlanBPremium() {
        return individualPlanBPremium;
    }

    @JsonProperty("IndividualPlanBPremium")
    public void setIndividualPlanBPremium(Integer individualPlanBPremium) {
        this.individualPlanBPremium = individualPlanBPremium;
    }

    @JsonProperty("IndividualPlanCount")
    public Integer getIndividualPlanCount() {
        return individualPlanCount;
    }

    @JsonProperty("IndividualPlanCount")
    public void setIndividualPlanCount(Integer individualPlanCount) {
        this.individualPlanCount = individualPlanCount;
    }

    @JsonProperty("IndividualPlanPremium")
    public Integer getIndividualPlanPremium() {
        return individualPlanPremium;
    }

    @JsonProperty("IndividualPlanPremium")
    public void setIndividualPlanPremium(Integer individualPlanPremium) {
        this.individualPlanPremium = individualPlanPremium;
    }

    @JsonProperty("OtherCount")
    public Integer getOtherCount() {
        return otherCount;
    }

    @JsonProperty("OtherCount")
    public void setOtherCount(Integer otherCount) {
        this.otherCount = otherCount;
    }

    @JsonProperty("SelfCount")
    public Integer getSelfCount() {
        return selfCount;
    }

    @JsonProperty("SelfCount")
    public void setSelfCount(Integer selfCount) {
        this.selfCount = selfCount;
    }

    @JsonProperty("SpouseCount")
    public Integer getSpouseCount() {
        return spouseCount;
    }

    @JsonProperty("SpouseCount")
    public void setSpouseCount(Integer spouseCount) {
        this.spouseCount = spouseCount;
    }

    @JsonProperty("WithChildPlanBPremium")
    public Integer getWithChildPlanBPremium() {
        return withChildPlanBPremium;
    }

    @JsonProperty("WithChildPlanBPremium")
    public void setWithChildPlanBPremium(Integer withChildPlanBPremium) {
        this.withChildPlanBPremium = withChildPlanBPremium;
    }

    @JsonProperty("WithChildPlanCount")
    public Integer getWithChildPlanCount() {
        return withChildPlanCount;
    }

    @JsonProperty("WithChildPlanCount")
    public void setWithChildPlanCount(Integer withChildPlanCount) {
        this.withChildPlanCount = withChildPlanCount;
    }

    @JsonProperty("WithChildPlanPremium")
    public Integer getWithChildPlanPremium() {
        return withChildPlanPremium;
    }

    @JsonProperty("WithChildPlanPremium")
    public void setWithChildPlanPremium(Integer withChildPlanPremium) {
        this.withChildPlanPremium = withChildPlanPremium;
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
