package com.pixisolutions.thymeleaf.practice.domains;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by sanjoy on 9/30/15.
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(targetEntity = Order.class)
    private List<Order> orders;
    private Date created;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
