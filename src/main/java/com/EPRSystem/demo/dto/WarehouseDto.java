package com.EPRSystem.demo.dto;

import com.EPRSystem.demo.entity.AddressEntity;
import com.EPRSystem.demo.entity.ContactEntity;
import com.EPRSystem.demo.entity.WarehouseEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class WarehouseDto implements Serializable {
    private long id=0;
    @Autowired
    private Set<AddressDto> addresses;
    @Autowired
    @Nullable
    private Set<ContactDto> contacts;
    private String name="";
    private String label="";
    private String floorArea="";

    public boolean isValidDto(long id){
        if(this.name.isEmpty() || this.addresses.isEmpty() ||this.id!=id){
            return false;
        }
        AddressDto addressDto= this.addresses.stream().toList().get(0);
        return addressDto.isValidDto();
    }

    public WarehouseDto(@NotNull WarehouseEntity warehouseEntity) {
        this.id=warehouseEntity.getId();
        setAddressesByEntity(warehouseEntity.getAddressEntities());
        setContactsByEntity(warehouseEntity.getContactEntities());
        this.name=warehouseEntity.getName();
        this.label=warehouseEntity.getLabel();
        this.floorArea=warehouseEntity.getFloorArea();
    }

    public void setAddressesByEntity( Set<AddressEntity> addresses){
        this.addresses=new HashSet<>();
        for (AddressEntity addressEntity:addresses) {
            this.addresses.add(new AddressDto(addressEntity));
        }
    }

    public void setContactsByEntity(Set<ContactEntity> contacts){
        this.contacts=new HashSet<>();
        for (ContactEntity contactEntity:contacts) {
            this.contacts.add(new ContactDto(contactEntity));
        }
    }

    public long getId() {
        return id;
    }

    public WarehouseDto setId(long id) {
        this.id = id;
        return this;
    }

    public Set<AddressDto> getAddresses() {
        return addresses;
    }


    public WarehouseDto setAddresses(Set<AddressDto> addresses) {
        this.addresses = addresses;
        return this;
    }

    public Set<ContactDto> getContacts() {
        return contacts;
    }

    public WarehouseDto setContacts(Set<ContactDto> contacts) {
        this.contacts = contacts;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public WarehouseDto setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getFloorArea() {
        return floorArea;
    }

    public WarehouseDto setFloorArea(String floorArea) {
        this.floorArea = floorArea;
        return this;
    }
}