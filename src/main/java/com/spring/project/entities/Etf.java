package com.spring.project.entities;

import javax.persistence.*;

@Entity @Table(name="etf")
public class Etf {

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

    @Column(name="sum")
    private Integer sum;

    @ManyToOne
    @JoinColumn(name="networth_id")
    private Networth networth;

    public Etf(String symbol, String name, Double ytdReturn, Integer sum, Networth networth) {
        this.symbol = symbol;
        this.name = name;
        this.ytdReturn = ytdReturn;
        this.sum = sum;
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

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
