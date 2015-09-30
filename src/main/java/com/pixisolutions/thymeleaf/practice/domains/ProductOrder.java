package com.pixisolutions.thymeleaf.practice.domains;

import javax.persistence.*;


/**
 * Created by sanjoy on 9/30/15.
 */
@Entity
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(targetEntity = Product.class)
    private Product product;
    private Integer quantity;
    @ManyToOne(targetEntity = Order.class)
    private Order order;

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }
}
