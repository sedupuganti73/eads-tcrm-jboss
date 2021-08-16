package com.nscorp.analytics.dataObjects;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sedupuganti
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldData { 
	
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private String description = null;
	private String fullyQualifiedName = null;
	private String label = null;
	private String name = null;
	/*
	@JsonProperty("isSystemField")
	private Boolean isSystemField;
	@JsonProperty("isUniqueId")
	private Boolean isUniqueId ;
	@JsonProperty("isMultiValue")
	private Boolean isMultiValue;
	*/
	
	@JsonProperty("isUniqueId")
	private Boolean isUniqueId ;
	private String type = null;
	private String defaultValue;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private Integer precision = null;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private Integer scale = null;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String format = null;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer fiscalMonthOffset = null;
	
	public FieldData(String name , String label, String objectName, String type, Boolean isUniqueId) {
		this.name = name;
		this.fullyQualifiedName = objectName+'.'+ name;
		this.label = label;
		//this.isSystemField = Boolean.FALSE;
		this.isUniqueId = isUniqueId;
		//this.isMultiValue = Boolean.FALSE;
		this.type = type;
		this.description =null;
	}
	
	public FieldData(String name , String label, String objectName, String type,String format, Integer fiscalMonthOffset, Boolean isUniqueId) {
		this.name = name;
		this.fullyQualifiedName = objectName+'.'+ name;
		this.label = label;
		//this.isSystemField = Boolean.FALSE;
		this.isUniqueId = isUniqueId;
		this.type = type;
		this.format = format;
		this.fiscalMonthOffset = fiscalMonthOffset;
		this.description =null;
	}
	
	public FieldData(String name , String label, String objectName, String type,String format, String defaultValue,Integer precision,Integer scale, Boolean isUniqueId) {
		this.name = name;
		this.fullyQualifiedName = objectName+'.'+ name;
		this.label = label;
		//this.isSystemField = Boolean.FALSE;
		this.type = type;
		this.format = format;
		this.defaultValue = defaultValue;
		this.precision = precision;
		this.scale = scale;
		this.description =null;
		this.isUniqueId = isUniqueId;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the fullyQualifiedName
	 */
	public String getFullyQualifiedName() {
		return fullyQualifiedName;
	}
	/**
	 * @param fullyQualifiedName the fullyQualifiedName to set
	 */
	public void setFullyQualifiedName(String fullyQualifiedName) {
		this.fullyQualifiedName = fullyQualifiedName;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the isSystemField
	 */
	/*
	@JsonProperty("isSystemField")
	public Boolean isSystemField() {
		return isSystemField;
	}*/
	/**
	 * @param isSystemField the isSystemField to set
	 */
	/*
	@JsonProperty("isSystemField")
	public void setSystemField(Boolean isSystemField) {
		this.isSystemField = isSystemField;
	}
	/**
	 * @return the isUniqueId
	 */
	
	@JsonProperty("isUniqueId")
	public Boolean isUniqueId() {
		return isUniqueId;
	}
	/**
	 * @param isUniqueId the isUniqueId to set
	 */
	
	@JsonProperty("isUniqueId")
	public void setUniqueId(Boolean isUniqueId) {
		this.isUniqueId = isUniqueId;
	}
	/**
	 * @return the isMultiValue
	 */
	/*
	@JsonProperty("isMultiValue")
	public Boolean isMultiValue() {
		return isMultiValue;
	}*/
	/**
	 * @param isMultiValue the isMultiValue to set
	 */
	/*
	@JsonProperty("isMultiValue")
	public void setMultiValue(Boolean isMultiValue) {
		this.isMultiValue = isMultiValue;
	}*/
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the defaultValue
	 */
	public String getDefaultValue() {
		return defaultValue;
	}
	/**
	 * @param defaultValue the defaultValue to set
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	/**
	 * @return the precision
	 */
	public Integer getPrecision() {
		return precision;
	}
	/**
	 * @param precision the precision to set
	 */
	public void setPrecision(Integer precision) {
		this.precision = precision;
	}
	/**
	 * @return the scale
	 */
	public Integer getScale() {
		return scale;
	}
	/**
	 * @param scale the scale to set
	 */
	public void setScale(Integer scale) {
		this.scale = scale;
	}
	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	/**
	 * @return the fiscalMonthOffset
	 */
	public Integer getFiscalMonthOffset() {
		return fiscalMonthOffset;
	}
	/**
	 * @param fiscalMonthOffset the fiscalMonthOffset to set
	 */
	public void setFiscalMonthOffset(Integer fiscalMonthOffset) {
		this.fiscalMonthOffset = fiscalMonthOffset;
	}

}
