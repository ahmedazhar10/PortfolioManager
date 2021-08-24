package com.spring.project.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="future")
public class Future implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="contractValue")
    private Integer contractValue;

    @Column(name="issuer")
    private String issuer;

    @Column(name="margin")
    private Double margin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="networth_id", nullable = false)
    private Networth networth;

    public Future(Integer contractValue, String issuer, Double margin, Networth networth) {
        this.contractValue = contractValue;
        this.issuer = issuer;
        this.margin = margin;
        this.networth = networth;
    }

    public Future(int id){
        this.id = id;
    }

    public Future(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContractValue() {
        return contractValue;
    }

    public void setContractValue(Integer contractValue) {
        this.contractValue = contractValue;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Double getMargin() {
        return margin;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    public Networth getNetworth() {
        return networth;
    }

    public void setNetworth(Networth networth) {
        this.networth = networth;
    }
}
