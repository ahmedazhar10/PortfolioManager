package com.spring.project.entities;

import javax.persistence.*;
import java.util.Set;

@Entity @Table(name="investment")
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @OneToMany(mappedBy = "investment")
    private Set<Integer> bondIdSet;

    @OneToOne(mappedBy = "networth")
    private Networth networth;

    public Investment(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
