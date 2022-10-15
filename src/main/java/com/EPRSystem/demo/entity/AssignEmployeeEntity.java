package com.EPRSystem.demo.entity;

import com.EPRSystem.demo.entity.Key.AssignEmployeeKey;

import javax.persistence.*;

@Entity
@Table(name = "assign_employee")
public class AssignEmployeeEntity {
    @EmbeddedId
    private AssignEmployeeKey id;

    @ManyToOne
    @MapsId("branchId")
    @JoinColumn(name = "branch_id")
    private BranchEntity branchEntity;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employeeEntity;

    private String dateOfAssign;
    private String dateOfDischarge;

    public AssignEmployeeEntity() {
    }

    public AssignEmployeeKey getId() {
        return id;
    }

    public void setId(AssignEmployeeKey id) {
        this.id = id;
    }

    public BranchEntity getBranchEntity() {
        return branchEntity;
    }

    public void setBranchEntity(BranchEntity branchEntity) {
        this.branchEntity = branchEntity;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public String getDateOfAssign() {
        return dateOfAssign;
    }

    public void setDateOfAssign(String dateOfAssign) {
        this.dateOfAssign = dateOfAssign;
    }

    public String getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(String dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }
}
