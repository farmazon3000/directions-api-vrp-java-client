package com.graphhopper.api.vrp.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@ApiModel(description = "")
public class Request  {
  
  private List<Vehicle> vehicles = new ArrayList<Vehicle>() ;
  private List<VehicleType> vehicleTypes = Arrays.asList(new VehicleType());
  private List<Service> services = new ArrayList<Service>() ;
  private List<Shipment> shipments = new ArrayList<Shipment>() ;

  
  /**
   * An array of vehicles that can be employed
   **/
  @ApiModelProperty(value = "An array of vehicles that can be employed")
  @JsonProperty("vehicles")
  public List<Vehicle> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  
  /**
   * An array of vehicle types
   **/
  @ApiModelProperty(value = "An array of vehicle types")
  @JsonProperty("vehicle_types")
  public List<VehicleType> getVehicleTypes() {
    return vehicleTypes;
  }
  public void setVehicleTypes(List<VehicleType> vehicleTypes) {
    this.vehicleTypes = vehicleTypes;
  }

  
  /**
   * An array of services
   **/
  @ApiModelProperty(value = "An array of services")
  @JsonProperty("services")
  public List<Service> getServices() {
    return services;
  }
  public void setServices(List<Service> services) {
    this.services = services;
  }

  
  /**
   * An array of shipments
   **/
  @ApiModelProperty(value = "An array of shipments")
  @JsonProperty("shipments")
  public List<Shipment> getShipments() {
    return shipments;
  }
  public void setShipments(List<Shipment> shipments) {
    this.shipments = shipments;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    
    sb.append("  vehicles: ").append(vehicles).append("\n");
    sb.append("  vehicleTypes: ").append(vehicleTypes).append("\n");
    sb.append("  services: ").append(services).append("\n");
    sb.append("  shipments: ").append(shipments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
