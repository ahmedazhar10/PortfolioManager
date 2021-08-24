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
    private Integer purchasePrice;

    @Column(name="closingPrice")
    private Integer closingPrice;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="networth_id")
    private Networth networth;

    public Stock(){}

    public Stock(int id){
        this.id = id;
    }

    public Stock(int id, String ticker, int volume, int purchasePrice, int closingPrice, String name, Networth networth){
        this.id = id;
        this.ticker = ticker;
        this.volume = volume;
        this.purchasePrice = purchasePrice;
        this.closingPrice = closingPrice;
        this.name = name;
        this.networth = networth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(Integer closingPrice) {
        this.closingPrice = closingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
