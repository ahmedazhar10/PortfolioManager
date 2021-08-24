package com.spring.project.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="networth")
public class Networth implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cash_id", referencedColumnName="id")
    private CashAccounts cashAccounts;

    @Column(name="user_name")
    private String userName;

    @OneToMany(mappedBy = "networth", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Stock> stock;

    @OneToMany(mappedBy = "networth", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Etf> etf;

    @OneToMany(mappedBy = "networth", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Future> future;

    @OneToMany(mappedBy = "networth", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Bond> bond;

    public Networth(){}

    public Networth(String userName, CashAccounts cashAccounts) {
        this.userName = userName;
        this.cashAccounts = cashAccounts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CashAccounts getCashAccounts() {
        return cashAccounts;
    }

    public void setCashAccounts(CashAccounts cashAccounts) {
        this.cashAccounts = cashAccounts;
    }
}
