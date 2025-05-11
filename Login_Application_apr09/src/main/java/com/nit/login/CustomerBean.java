package com.nit.login;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable
{
    private String uname,pwd,fname,lname,mid;
    private long phno;
	public CustomerBean() {
		super();
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "CustomerBean [uname=" + uname + ", pwd=" + pwd + ", fname=" + fname + ", lname=" + lname + ", mid="
				+ mid + ", phno=" + phno + "]";
	}
    
    
}
