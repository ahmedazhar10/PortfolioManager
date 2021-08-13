package com.spring.project.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name="cashaccounts")
public class CashAccounts implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="institution")
    private String institution;

    @Column(name="accountType")
    private String accountType;

    @Column(name="amount")
    private Integer amount;

    @Column(name="holderName")
    private String holderName;



}
