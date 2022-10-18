package com.EPRSystem.demo.entity;

import com.EPRSystem.demo.dto.AddressDto;
import org.jetbrains.annotations.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private int postalCode;
    @Nullable
    private float longitude;
    @Nullable
    private float latitude;

    @ManyToOne(optional = false)
    @JoinColumn(name = "addressable_id", nullable = false)
    private AddressableEntity addressableEntity;

    public AddressEntity() {
    }

    public AddressEntity(AddressDto addressDto) {
        this.addressLine1=addressDto.getAddressLine1();
        this.addressLine2=addressDto.getAddressLine2();
        this.city=addressDto.getCity();
        this.country=addressDto.getCountry();
        this.postalCode=addressDto.getPostalCode();
        this.longitude=addressDto.getLongitude();
        this.latitude=addressDto.getLatitude();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
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

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public AddressableEntity getAddressable() {
        return addressableEntity;
    }

    public void setAddressable(AddressableEntity addressableEntity) {
        this.addressableEntity = addressableEntity;
    }
}
