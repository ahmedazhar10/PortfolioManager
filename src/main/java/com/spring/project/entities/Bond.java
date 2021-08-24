package com.spring.project.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="bond")
public class Bond implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="issuer")
    private String issuer;

    @Column(name="coupon")
    private Double coupon;

    @Column(name="maturityDate")
    private Date maturityDate;

    @Column(name="yieldPercentage")
    private Double yieldPercentage;

    @Column(name="bidPrice")
    private Double bidPrice;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="networth_id", nullable = false)
    private Networth networth;

    public Bond(String issuer, Double coupon, Date maturityDate, Double yieldPercentage, Double bidPrice, Networth networth) {
        this.issuer = issuer;
        this.coupon = coupon;
        this.maturityDate = maturityDate;
        this.yieldPercentage = yieldPercentage;
        this.bidPrice = bidPrice;
        this.networth = networth;
    }

    public Bond(int id){
        this.id = id;
    }

    public Bond(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Double getCoupon() {
        return coupon;
    }

    public void setCoupon(Double coupon) {
        this.coupon = coupon;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public Double getYieldPercentage() {
        return yieldPercentage;
    }

    public void setYieldPercentage(Double yieldPercentage) {
        this.yieldPercentage = yieldPercentage;
    }

    public Double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

}
