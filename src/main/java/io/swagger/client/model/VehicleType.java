package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


@ApiModel(description = "")
public class VehicleType  {
  
  private String typeId = "default";
  public enum ProfileEnum {
     car,  bike,  foot, 
  };
  private ProfileEnum profile = ProfileEnum.car;
  private List<Integer> capacity = new ArrayList<Integer>() ;

  
  /**
   * Unique identifier for the vehicle type
   **/
  @ApiModelProperty(value = "Unique identifier for the vehicle type")
  @JsonProperty("type_id")
  public String getTypeId() {
    return typeId;
  }
  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  
  /**
   * Profile of vehicle type
   **/
  @ApiModelProperty(value = "Profile of vehicle type")
  @JsonProperty("profile")
  public ProfileEnum getProfile() {
    return profile;
  }
  public void setProfile(ProfileEnum profile) {
    this.profile = profile;
  }

  
  /**
   * array of capacity dimensions
   **/
  @ApiModelProperty(value = "array of capacity dimensions")
  @JsonProperty("capacity")
  public List<Integer> getCapacity() {
    return capacity;
  }
  public void setCapacity(List<Integer> capacity) {
    this.capacity = capacity;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleType {\n");
    
    sb.append("  typeId: ").append(typeId).append("\n");
    sb.append("  profile: ").append(profile).append("\n");
    sb.append("  capacity: ").append(capacity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
