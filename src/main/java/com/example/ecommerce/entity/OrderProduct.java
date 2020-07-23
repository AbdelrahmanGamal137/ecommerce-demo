package com.example.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class OrderProduct {

    @EmbeddedId
    @JsonIgnore
    private OrderProductPK pk;
 
//    @ManyToOne
//    @JoinColumn(name = "orders_id")
//    Order order;
// 
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    Product product;
    
//    @Column(nullable = false)
	private Integer quantity;
 
    // default constructor
 
//    public OrderProduct(Order order, Product product, Integer quantity) {
//        pk = new OrderProductPK();
//        pk.setOrder(order);
//        pk.setProduct(product);
//        this.quantity = quantity;
//    }
// 
	
//    @Transient
//    public Product getProduct() {
//        return this.pk.getProduct();
//    }
// 
//    @Transient
//    public Double getTotalPrice() {
//        return getProduct().getPrice() * getQuantity();
//    }
}
