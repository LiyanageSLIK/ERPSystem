package com.EPRSystem.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "fix_allowance")
public class FixAllowanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String category;
    private String label;
    private long amount;

    @ManyToOne
    @JoinColumn(name = "job_contract_id")
    private JobContractEntity jobContractEntity;
}
