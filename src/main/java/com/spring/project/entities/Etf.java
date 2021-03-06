package com.spring.project.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name="etf")
public class Etf implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="symbol")
    private String symbol;

    @Column(name="name")
    private String name;

    @Column(name="ytdReturn")
    private Double ytdReturn;

    @Column(name="aum")
    private Integer aum;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="networth_id", nullable = false)
    private Networth networth;

    public Etf(String symbol, String name, Double ytdReturn, Integer aum, Networth networth) {
        this.symbol = symbol;
        this.name = name;
        this.ytdReturn = ytdReturn;
        this.aum = aum;
        this.networth = networth;
    }

    public Etf(int id){
        this.id = id;
    }

    public Etf(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getYtdReturn() {
        return ytdReturn;
    }

    public void setYtdReturn(Double ytdReturn) {
        this.ytdReturn = ytdReturn;
    }

    public Integer getAum() {
        return aum;
    }

    public void setAum(Integer aum) {
        this.aum = aum;
    }

    public Networth getNetworth() {
        return networth;
    }

    public void setNetworth(Networth networth) {
        this.networth = networth;
    }
}
