package com.spring.project.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cashaccounts")
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

    public CashAccounts(String institution, String accountType, Integer amount) {
        this.institution = institution;
        this.accountType = accountType;
        this.amount = amount;
    }

    public CashAccounts(int id){
        this.id = id;
    }

    public CashAccounts(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
