/**
 * 
 */
package com.nscorp.analytics.dataObjects;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author sedupuganti
 *
 */
@XmlRootElement(name = "Report")
@XmlType(propOrder = { "name", "label", "columns" }) 
@XmlAccessorType(XmlAccessType.FIELD)
public class ReportData {

	@XmlElement(name="name")
	private String name ;
	@XmlElement(name="label")
	private String label;
	@XmlElementWrapper(name="columns")
    @XmlElement(name="column")
	private List<ColumnDefinition> columnList;
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
	 * @return the columnList
	 */
	public List<ColumnDefinition> getColumnList() {
		return columnList;
	}
	/**
	 * @param columnList the columnList to set
	 */
	public void setColumnList(List<ColumnDefinition> columnList) {
		this.columnList = columnList;
	}
	
	
}
