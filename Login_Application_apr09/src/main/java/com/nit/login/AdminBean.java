package com.nit.login;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable
{
	private String name,mail,pwd,cpwd;
	private long pno;
	
	public AdminBean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCpwd() {
		return cpwd;
	}

	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}

	public long getPno() {
		return pno;
	}

	public void setPno(long pno) {
		this.pno = pno;
	}

	@Override
	public String toString() {
		return "AdminBean [name=" + name + ", mail=" + mail + ", pwd=" + pwd + ", cpwd=" + cpwd + ", pno=" + pno + "]";
	}
	
	
	

}
