package com.EPRSystem.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "job_contract")
public class JobContractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String designation;
    private String category;
    private long basicSalary;
    private String yearlyIncrement;
    private String dateOfStart;
    private String dateOfEnd;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employeeEntity;

    @OneToMany(mappedBy = "jobContractEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<FixAllowanceEntity> fixAllowanceEntities;



    public JobContractEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getYearlyIncrement() {
        return yearlyIncrement;
    }

    public void setYearlyIncrement(String yearlyIncrement) {
        this.yearlyIncrement = yearlyIncrement;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public String getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(String dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }
}
