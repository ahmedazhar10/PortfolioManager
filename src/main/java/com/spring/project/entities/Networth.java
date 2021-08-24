package com.spring.project.entities;

import javax.persistence.*;

@Entity @Table(name="networth")
public class Networth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cash_id", referencedColumnName="id")
    private Integer cashID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="investment_id", referencedColumnName="id")
    private Integer investmentID;

    @Column(name="user_name")
    private String userName;

    public Networth(){}

    public Networth(Integer cashID, Integer investmentID, String userName) {
        this.cashID = cashID;
        this.investmentID = investmentID;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCashID() {
        return cashID;
    }

    public void setCashID(Integer cashID) {
        this.cashID = cashID;
    }

    public Integer getInvestmentID() {
        return investmentID;
    }

    public void setInvestmentID(Integer investmentID) {
        this.investmentID = investmentID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
