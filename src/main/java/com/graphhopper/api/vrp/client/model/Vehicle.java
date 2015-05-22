package com.graphhopper.api.vrp.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


@ApiModel(description = "")
public class Vehicle  {
  
  private String vehicleId = null;
  private String typeId = null;
  private Address startAddress = null;
  private Address endAddress = null;
  private Boolean returnToDepot = null;
  private Long earliestStart = null;
  private Long latestEnd = null;
  private List<String> skills = new ArrayList<String>() ;

  
  /**
   * Unique identifier of vehicle
   **/
  @ApiModelProperty(value = "Unique identifier of vehicle")
  @JsonProperty("vehicle_id")
  public String getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  
  /**
   * Unique identifier referring to the available vehicle types
   **/
  @ApiModelProperty(value = "Unique identifier referring to the available vehicle types")
  @JsonProperty("type_id")
  public String getTypeId() {
    return typeId;
  }
  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("start_address")
  public Address getStartAddress() {
    return startAddress;
  }
  public void setStartAddress(Address startAddress) {
    this.startAddress = startAddress;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("end_address")
  public Address getEndAddress() {
    return endAddress;
  }
  public void setEndAddress(Address endAddress) {
    this.endAddress = endAddress;
  }

  
  /**
   * Indicates whether vehicle should return to start address or not. If not, it can end at any service activity.
   **/
  @ApiModelProperty(value = "Indicates whether vehicle should return to start address or not. If not, it can end at any service activity.")
  @JsonProperty("return_to_depot")
  public Boolean getReturnToDepot() {
    return returnToDepot;
  }
  public void setReturnToDepot(Boolean returnToDepot) {
    this.returnToDepot = returnToDepot;
  }

  
  /**
   * earliest start of vehicle at its start location
   **/
  @ApiModelProperty(value = "earliest start of vehicle at its start location")
  @JsonProperty("earliest_start")
  public Long getEarliestStart() {
    return earliestStart;
  }
  public void setEarliestStart(Long earliestStart) {
    this.earliestStart = earliestStart;
  }

  
  /**
   * latest end of vehicle at its end location
   **/
  @ApiModelProperty(value = "latest end of vehicle at its end location")
  @JsonProperty("latest_end")
  public Long getLatestEnd() {
    return latestEnd;
  }
  public void setLatestEnd(Long latestEnd) {
    this.latestEnd = latestEnd;
  }

  
  /**
   * array of skills
   **/
  @ApiModelProperty(value = "array of skills")
  @JsonProperty("skills")
  public List<String> getSkills() {
    return skills;
  }
  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("  typeId: ").append(typeId).append("\n");
    sb.append("  startAddress: ").append(startAddress).append("\n");
    sb.append("  endAddress: ").append(endAddress).append("\n");
    sb.append("  returnToDepot: ").append(returnToDepot).append("\n");
    sb.append("  earliestStart: ").append(earliestStart).append("\n");
    sb.append("  latestEnd: ").append(latestEnd).append("\n");
    sb.append("  skills: ").append(skills).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
