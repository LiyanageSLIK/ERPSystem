package com.EPRSystem.demo.dto;

import com.EPRSystem.demo.entity.ContactEntity;

import java.io.Serializable;


public class ContactDto implements Serializable {
    private long id;
    private String phoneNo;
    private String label;
    private String email;

    public ContactDto() {
    }

    public ContactDto(ContactEntity contactEntity) {
        this.id=contactEntity.getId();
        this.phoneNo= contactEntity.getPhoneNo();
        this.label= contactEntity.getLabel();
        this.email= contactEntity.getEmail();
    }

    public long getId() {
        return id;
    }

    public ContactDto setId(long id) {
        this.id = id;
        return this;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public ContactDto setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public ContactDto setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactDto setEmail(String email) {
        this.email = email;
        return this;
    }

}