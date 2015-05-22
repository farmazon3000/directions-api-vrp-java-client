package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


@ApiModel(description = "")
public class Shipment  {
  
  private String id = null;
  private String name = null;
  private Stop pickup = null;
  private Stop delivery = null;
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
   * name of shipment
   **/
  @ApiModelProperty(value = "name of shipment")
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
  @JsonProperty("pickup")
  public Stop getPickup() {
    return pickup;
  }
  public void setPickup(Stop pickup) {
    this.pickup = pickup;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("delivery")
  public Stop getDelivery() {
    return delivery;
  }
  public void setDelivery(Stop delivery) {
    this.delivery = delivery;
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
    sb.append("class Shipment {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  pickup: ").append(pickup).append("\n");
    sb.append("  delivery: ").append(delivery).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  requiredSkills: ").append(requiredSkills).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
