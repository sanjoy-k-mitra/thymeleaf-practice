package com.pixisolutions.thymeleaf.practice.domains;

import javax.persistence.*;

/**
 * Created by sanjoy on 9/30/15.
 */
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer rating;
    private String comment;
    @ManyToOne(targetEntity = Product.class)
    private Product product;

    public Long getId() {
        return id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Product getProduct() {
        return product;
    }
}
