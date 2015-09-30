package com.pixisolutions.thymeleaf.practice.domains;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by sanjoy on 9/30/15.
 */
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;
    @OneToMany(targetEntity = ProductOrder.class)
    private List<ProductOrder> productOrders;
    private Date created;

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ProductOrder> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(List<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
