package com.EPRSystem.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class ContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String phoneNo;
    private String label;
    private String email;

    @ManyToOne(optional = false)
    @JoinColumn(name = "addressable_id", nullable = false)
    private AddressableEntity addressableEntity;

    public ContactEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressableEntity getAddressableEntity() {
        return addressableEntity;
    }

    public void setAddressableEntity(AddressableEntity addressableEntity) {
        this.addressableEntity = addressableEntity;
    }
}
