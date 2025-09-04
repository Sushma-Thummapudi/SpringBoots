//pojo class
package com.rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//annotations
@Entity
@Table(name = "product_info")

public class Product {
	
	//fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int pid;
	@Column(name="product_name")
	private String pname;
	private int price;
	
	
	//constructor
	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	//default constructor
	public Product() {
		super();
	}


	//methods
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	

}
