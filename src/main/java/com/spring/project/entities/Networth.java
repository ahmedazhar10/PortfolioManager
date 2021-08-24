package com.spring.project.entities;

import javax.persistence.*;
import java.util.Set;

@Entity @Table(name="networth")
public class Networth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cash_id", referencedColumnName="id")
    private Integer cashID;

    @Column(name="user_name")
    private String userName;

    @OneToMany(mappedBy = "networth", cascade = CascadeType.ALL)
    private Set<Integer> stockID;

    @OneToMany(mappedBy = "networth", cascade = CascadeType.ALL)
    private Set<Integer> etfID;

    @OneToMany(mappedBy = "networth", cascade = CascadeType.ALL)
    private Set<Integer> futureID;

    @OneToMany(mappedBy = "networth", cascade = CascadeType.ALL)
    private Set<Integer> bondID;

    public Networth(){}

    public Networth(Integer cashID, String userName) {
        this.cashID = cashID;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
