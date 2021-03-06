package com.logistimo.locations.model;

import com.logistimo.locations.validation.ValidLocation;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by kumargaurav on 24/02/17.
 */
@ValidLocation
public class LocationRequestModel implements Serializable {

  @NotNull(message = "Country code can not be null!")
  private String countryCode;
  private String country;
  private String state;
  private String district;
  private String taluk;
  private String block;
  private String city;
  private Double latitude;
  private Double longitude;
  private String pincode;
  @NotNull(message = "app name can not be null!")
  private String appName;
  @NotNull(message = "user name can not be null!")
  private String userName;

  public LocationRequestModel() {
  }

  public LocationRequestModel(String countryCode, String appName, String userName) {
    this.countryCode = countryCode;
    this.appName = appName;
    this.userName = userName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getTaluk() {
    return taluk;
  }

  public void setTaluk(String taluk) {
    this.taluk = taluk;
  }

  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public String getPlace() {
    return this.city;
  }

  public void setPlace(String city) {
    this.city = city;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "LocationRequestModel{" +
        "countryCode='" + countryCode + '\'' +
            ", country='" + country + '\'' +
        ", state='" + state + '\'' +
        ", district='" + district + '\'' +
        ", taluk='" + taluk + '\'' +
        ", city='" + city + '\'' +
        ", appName='" + appName + '\'' +
        ", userName='" + userName + '\'' +
        '}';
  }
}


