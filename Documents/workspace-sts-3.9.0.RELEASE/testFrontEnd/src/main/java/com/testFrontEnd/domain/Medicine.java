package com.testFrontEnd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.awt.List;
import java.io.Serializable;

import org.springframework.data.annotation.Id;

import java.sql.*;
import java.util.ArrayList;


@Entity
@Table(name="T_MEDICINE")
public class Medicine implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date expiration_date;
	private String name;
	private double weight;
	private ArrayList<stock_Element> stock_Elements = new ArrayList<stock_Element>();
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="EXPIRATION_DATE", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getExpirationDate() {
		return expiration_date;
	}
	
	public void setExperationDate(Date expirationDate) {
		this.expiration_date = expirationDate;
	}
	
	@Column(name="NAME", length=100, nullable = true)
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	@Column(name="WEIGHT", nullable=true, precision = 18, scale = 2)
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@OneToMany(mappedBy = "Medicine", fetch = FetchType.LAZY)
	public ArrayList<stock_Element> getStock_Elements(){
		return this.stock_Elements;
	}
	
	
	@Override
	   public String toString() {
	      return "T_MEDICINE [ID=" + id + ", EXPIRATION_DATE=" + expiration_date + ", NAME="
	            + name + "]";
	   }


}
