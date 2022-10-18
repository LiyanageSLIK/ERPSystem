package com.EPRSystem.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employee")
public class EmployeeEntity extends AddressableEntity {

    private String fullName;
    private String nameWithInitial;
    private long nicNo;
    private long empNo;
    private long epfNo;
    private long hrFileNo;
    private String dateOfBirth;
    private String dateOfJoin;
    private String dateOfLeave;

    @OneToMany(mappedBy = "employeeEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<AssignEmployeeEntity> assignEmployeeEntities;

    @OneToMany(mappedBy = "employeeEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<JobContractEntity> jobContractEntities;

    public EmployeeEntity() {
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNameWithInitial() {
        return nameWithInitial;
    }

    public void setNameWithInitial(String nameWithInitial) {
        this.nameWithInitial = nameWithInitial;
    }

    public long getNicNo() {
        return nicNo;
    }

    public void setNicNo(long nicNo) {
        this.nicNo = nicNo;
    }

    public long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    public long getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(long epfNo) {
        this.epfNo = epfNo;
    }

    public long getHrFileNo() {
        return hrFileNo;
    }

    public void setHrFileNo(long hrFileNo) {
        this.hrFileNo = hrFileNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(String dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getDateOfLeave() {
        return dateOfLeave;
    }

    public void setDateOfLeave(String dateOfLeave) {
        this.dateOfLeave = dateOfLeave;
    }

    public Set<AssignEmployeeEntity> getAssignEmployeeEntities() {
        return assignEmployeeEntities;
    }

    public void setAssignEmployeeEntities(Set<AssignEmployeeEntity> assignEmployeeEntities) {
        this.assignEmployeeEntities = assignEmployeeEntities;
    }
}
