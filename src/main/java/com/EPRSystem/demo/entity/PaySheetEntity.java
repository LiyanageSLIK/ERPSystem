package com.EPRSystem.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pay_sheet")
public class PaySheetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String year;
    private String month;
    private long basicSalary;
    private long epf;
    private long etf;
    private long fixAllowanceTotal;
    private long incentiveTotal;
    private long grossSalary;
    private long payeeTax;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employeeEntity;

    @OneToMany(mappedBy = "paySheetEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<IncentiveEntity> incentiveEntities;

    public PaySheetEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public long getEpf() {
        return epf;
    }

    public void setEpf(long epf) {
        this.epf = epf;
    }

    public long getEtf() {
        return etf;
    }

    public void setEtf(long etf) {
        this.etf = etf;
    }

    public long getFixAllowanceTotal() {
        return fixAllowanceTotal;
    }

    public void setFixAllowanceTotal(long fixAllowanceTotal) {
        this.fixAllowanceTotal = fixAllowanceTotal;
    }

    public long getIncentiveTotal() {
        return incentiveTotal;
    }

    public void setIncentiveTotal(long incentiveTotal) {
        this.incentiveTotal = incentiveTotal;
    }

    public long getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(long grossSalary) {
        this.grossSalary = grossSalary;
    }

    public long getPayeeTax() {
        return payeeTax;
    }

    public void setPayeeTax(long payeeTax) {
        this.payeeTax = payeeTax;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public Set<IncentiveEntity> getIncentiveEntities() {
        return incentiveEntities;
    }

    public void setIncentiveEntities(Set<IncentiveEntity> incentiveEntities) {
        this.incentiveEntities = incentiveEntities;
    }
}
