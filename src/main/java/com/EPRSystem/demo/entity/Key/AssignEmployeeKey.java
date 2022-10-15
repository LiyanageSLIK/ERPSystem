package com.EPRSystem.demo.entity.Key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AssignEmployeeKey implements Serializable {
    private static final long serialVersionUID = 7365804116590006359L;
    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "employee_id")
    private Long employeeId;

    public AssignEmployeeKey() {
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}
