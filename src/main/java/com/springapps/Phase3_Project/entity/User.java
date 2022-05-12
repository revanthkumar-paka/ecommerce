package com.springapps.Phase3_Project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Comparable<User> {
	@Id
	private Integer userid;
	private String username;
	private String useraddress;
	private String userregister;
	private String usernumber;
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", useraddress=" + useraddress + ", userregister="
				+ userregister + ", usernumber=" + usernumber + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUserregister() {
		return userregister;
	}
	public void setUserregister(String userregister) {
		this.userregister = userregister;
	}
	public String getUsernumber() {
		return usernumber;
	}
	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.userid.compareTo(o.getUserid());
	}
    
}
