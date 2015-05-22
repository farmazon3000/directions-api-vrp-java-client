package com.graphhopper.api.vrp.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


@ApiModel(description = "")
public class Stop  {
  
  private Address address = null;
  private Long duration = 0L;
  private List<TimeWindow> timeWindows = new ArrayList<TimeWindow>() ;

  
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
   * duration of stop, i.e. time in ms the corresponding activity takes
   **/
  @ApiModelProperty(value = "duration of stop, i.e. time in ms the corresponding activity takes")
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stop {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  duration: ").append(duration).append("\n");
    sb.append("  timeWindows: ").append(timeWindows).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
