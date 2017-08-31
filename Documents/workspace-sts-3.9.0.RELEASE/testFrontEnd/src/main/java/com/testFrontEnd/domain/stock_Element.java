package com.testFrontEnd.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_Stock_Element")
public class stock_Element implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private BigDecimal price;
	private BigDecimal cost;
	private String vendor;
	private Medicine medicine;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="PRICE", nullable = true, precision = 18, scale = 2)
	public BigDecimal getPrice() {
		return this.price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Column(name="COST", nullable = true, precision = 18, scale = 2)
	public BigDecimal getCost() {
		return this.cost;
	}
	
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	
	@Column(name="VENDEDOR", length=50)
	public String getVendedor() {
		return this.vendor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MEDICINE_ID")
	public Medicine getMedicine() {
		return this.medicine;
	}
	
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

}
