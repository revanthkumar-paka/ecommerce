package com.springapps.Phase3_Project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Comparable<Product> {
	@Id
	private Integer productid; 
	private String productname; 
	private int productprice;
	private String productcat; 
	private String productdate;
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ ", productcat=" + productcat + ", productdate=" + productdate + "]";
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public String getProductcat() {
		return productcat;
	}
	public void setProductcat(String productcat) {
		this.productcat = productcat;
	}
	public String getProductdate() {
		return productdate;
	}
	public void setProductdate(String productdate) {
		this.productdate = productdate;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.productid.compareTo(o.getProductid());
	}
	
}
