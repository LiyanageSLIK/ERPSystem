package com.EPRSystem.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "incentive")
public class IncentiveEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String category;
    private String label;
    private long amount;

    @ManyToOne
    @JoinColumn(name = "pat_sheet_id")
    private PaySheetEntity paySheetEntity;

    public IncentiveEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public PaySheetEntity getPaySheetEntity() {
        return paySheetEntity;
    }

    public void setPaySheetEntity(PaySheetEntity paySheetEntity) {
        this.paySheetEntity = paySheetEntity;
    }
}
