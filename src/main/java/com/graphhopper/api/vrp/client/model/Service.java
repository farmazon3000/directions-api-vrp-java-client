package com.graphhopper.api.vrp.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


@ApiModel(description = "")
public class Service  {
  
  private String id = null;
  public enum TypeEnum {
     service, 
  };
  private TypeEnum type = TypeEnum.service;
  private String name = null;
  private Address address = null;
  private Long duration = 0L;
  private List<TimeWindow> timeWindows = new ArrayList<TimeWindow>() ;
  private List<Integer> size = new ArrayList<Integer>() ;
  private List<String> requiredSkills = new ArrayList<String>() ;

  
  /**
   * Unique identifier of service
   **/
  @ApiModelProperty(value = "Unique identifier of service")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * type of service
   **/
  @ApiModelProperty(value = "type of service")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * name of service
   **/
  @ApiModelProperty(value = "name of service")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  
  /**
   * duration of service, i.e. time in ms the corresponding activity takes
   **/
  @ApiModelProperty(value = "duration of service, i.e. time in ms the corresponding activity takes")
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  
  /**
   * array of time windows. currently, only a single time window is allowed
   **/
  @ApiModelProperty(value = "array of time windows. currently, only a single time window is allowed")
  @JsonProperty("time_windows")
  public List<TimeWindow> getTimeWindows() {
    return timeWindows;
  }
  public void setTimeWindows(List<TimeWindow> timeWindows) {
    this.timeWindows = timeWindows;
  }

  
  /**
   * array of capacity dimensions
   **/
  @ApiModelProperty(value = "array of capacity dimensions")
  @JsonProperty("size")
  public List<Integer> getSize() {
    return size;
  }
  public void setSize(List<Integer> size) {
    this.size = size;
  }

  
  /**
   * array of required skills
   **/
  @ApiModelProperty(value = "array of required skills")
  @JsonProperty("required_skills")
  public List<String> getRequiredSkills() {
    return requiredSkills;
  }
  public void setRequiredSkills(List<String> requiredSkills) {
    this.requiredSkills = requiredSkills;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  duration: ").append(duration).append("\n");
    sb.append("  timeWindows: ").append(timeWindows).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  requiredSkills: ").append(requiredSkills).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
