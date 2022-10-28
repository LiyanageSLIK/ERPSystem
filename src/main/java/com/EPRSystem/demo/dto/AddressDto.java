package com.EPRSystem.demo.dto;

import com.EPRSystem.demo.entity.AddressEntity;

import java.io.Serializable;


public class AddressDto implements Serializable {
    private long id;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private int postalCode;
    private float longitude;
    private float latitude;

    public AddressDto() {
    }

    public AddressDto(AddressEntity addressEntity) {
        this.id=addressEntity.getId();
        this.addressLine1=addressEntity.getAddressLine1();
        this.addressLine2=addressEntity.getAddressLine2();
        this.city=addressEntity.getCity();
        this.country=addressEntity.getCountry();
        this.postalCode=addressEntity.getPostalCode();
        this.latitude=addressEntity.getLatitude();
        this.longitude=addressEntity.getLongitude();
    }

    public boolean isValidDto() {
        return !this.addressLine1.isEmpty()
                && !this.city.isEmpty()
                && !this.country.isEmpty()
                && this.postalCode>1;
    }

    public long getId() {
        return id;
    }

    public AddressDto setId(long id) {
        this.id = id;
        return this;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public AddressDto setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public AddressDto setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AddressDto setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AddressDto setCountry(String country) {
        this.country = country;
        return this;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public AddressDto setPostalCode(int postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public float getLongitude() {
        return longitude;
    }

    public AddressDto setLongitude(float longitude) {
        this.longitude = longitude;
        return this;
    }

    public float getLatitude() {
        return latitude;
    }

    public AddressDto setLatitude(float latitude) {
        this.latitude = latitude;
        return this;
    }

}