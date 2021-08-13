package com.spring.project.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name="Stock")
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="ticker")
    private String ticker;

    @Column(name="volume")
    private Integer volume;

    @Column(name="purchasePrice")
    private Double purchasePrice;

    @Column(name="closingPrice")
    private Double closingPrice;

    public Stock(){}

    public Stock(int id){
        this.id = id;
    }

    public Stock(int id, String ticker, int volume, double purchasePrice, double closingPrice){
        this.id = id;
        this.ticker = ticker;
        this.volume = volume;
        this.purchasePrice = purchasePrice;
        this.closingPrice = closingPrice;
    }

}
