package com.EPRSystem.demo.entity;

import com.EPRSystem.demo.dto.ContactDto;
import org.jetbrains.annotations.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class ContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String phoneNo;
    private String label;
    @Nullable
    private String email;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "addressable_id",referencedColumnName = "id")
    private AddressableEntity addressableEntity;

    public ContactEntity() {
    }

    public ContactEntity(ContactDto contactDto,AddressableEntity addressableEntity) {
        this.phoneNo=contactDto.getPhoneNo();
        this.label= contactDto.getLabel();
        this.email= contactDto.getEmail();
        this.addressableEntity=addressableEntity;
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
