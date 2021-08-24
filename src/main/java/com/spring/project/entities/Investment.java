package com.spring.project.entities;

import javax.persistence.*;

@Entity @Table(name="investment")
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="stock_ID")
    private Integer stockID;

    @Column(name="etf_ID")
    private Integer etfID;

    @Column(name="future_ID")
    private Integer futureID;

    @Column(name="bond_ID")
    private Integer bondID;

    public Investment(){}

    public Investment(Integer stockID, Integer etfID, Integer futureID, Integer bondID) {
        this.stockID = stockID;
        this.etfID = etfID;
        this.futureID = futureID;
        this.bondID = bondID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStockID() {
        return stockID;
    }

    public void setStockID(Integer stockID) {
        this.stockID = stockID;
    }

    public Integer getEtfID() {
        return etfID;
    }

    public void setEtfID(Integer etfID) {
        this.etfID = etfID;
    }

    public Integer getFutureID() {
        return futureID;
    }

    public void setFutureID(Integer futureID) {
        this.futureID = futureID;
    }

    public Integer getBondID() {
        return bondID;
    }

    public void setBondID(Integer bondID) {
        this.bondID = bondID;
    }
}
