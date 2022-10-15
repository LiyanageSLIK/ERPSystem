package com.EPRSystem.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "warehouse")
public class WarehouseEntity extends AddressableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String label;
    private String floorArea;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchEntity branchEntity;

    public WarehouseEntity() {
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
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
