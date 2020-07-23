package com.example.ecommerce.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.validation.annotation.Validated;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "date_created")
	@CreationTimestamp
	private Date dateCreated;
	
	@Column(name = "last_updated")
	@UpdateTimestamp
	private Date lastUpdated;	
	
	private String status;

	@OneToMany(mappedBy = "pk.order")
	private Set<OrderProduct> orderProducts;
	 
//	    @Transient
//	    public Double getTotalOrderPrice() {
//	        double sum = 0D;
//	        List<OrderProduct> orderProducts = getOrderProducts();
//	        for (OrderProduct op : orderProducts) {
//	            sum += op.getTotalPrice();
//	        }
//	        return sum;
//	    }
//	 
//	    @Transient
//	    public int getNumberOfProducts() {
//	        return this.orderProducts.size();
//	    }

}
