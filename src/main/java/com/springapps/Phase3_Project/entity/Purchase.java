package com.springapps.Phase3_Project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase implements Comparable<Purchase> {
	@Id
	private
	Integer userid;
	private int productid;
	private String productname;
	@Override
	public String toString() {
		return "Purchase [userid=" + userid + ", productid=" + productid + ", productname=" + productname + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	@Override
	public int compareTo(Purchase o) {
		// TODO Auto-generated method stub
		return this.userid.compareTo(o.getUserid());
	}

}
