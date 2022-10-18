package com.EPRSystem.demo.entity;

import com.EPRSystem.demo.dto.WarehouseDto;

import javax.persistence.*;

@Entity
@Table(name = "warehouse")
public class WarehouseEntity extends AddressableEntity{

    private String label;
    private String floorArea;
    private String name;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchEntity branchEntity;

    public WarehouseEntity() {
    }

    public WarehouseEntity(WarehouseDto warehouseDto) {
        this.name=warehouseDto.getName();
        this.label=warehouseDto.getLabel();
        this.floorArea=warehouseDto.getFloorArea();
        super.setAddressEntitiesByDto(warehouseDto.getAddresses());
        super.setContactEntitiesByDto(warehouseDto.getContacts());
    }


    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(String floorArea) {
        this.floorArea = floorArea;
    }

    public BranchEntity getBranchEntity() {
        return branchEntity;
    }

    public void setBranchEntity(BranchEntity branchEntity) {
        this.branchEntity = branchEntity;
    }


}
