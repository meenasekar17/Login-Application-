package com.nit.login;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable
{
    private String code,name;
    private float price;
    private int stock;
	public ProductBean() {
		super();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "ProductBean [code=" + code + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
    
    
}
