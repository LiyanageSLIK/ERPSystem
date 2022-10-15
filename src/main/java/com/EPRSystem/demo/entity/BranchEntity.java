package com.EPRSystem.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "branch")
public class BranchEntity extends AddressableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(mappedBy = "branchEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<WarehouseEntity> warehouseEntities;

    @OneToMany(mappedBy = "branchEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<AssignEmployeeEntity> assignEmployeeEntities;



    public BranchEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<WarehouseEntity> getWarehouseEntities() {
        return warehouseEntities;
    }

    public Set<AssignEmployeeEntity> getAssignEmployeeEntities() {
        return assignEmployeeEntities;
    }

    public void setAssignEmployeeEntities(Set<AssignEmployeeEntity> assignEmployeeEntities) {
        this.assignEmployeeEntities = assignEmployeeEntities;
    }

    public void setWarehouseEntities(Set<WarehouseEntity> warehouseEntities) {
        this.warehouseEntities = warehouseEntities;


    }
}
