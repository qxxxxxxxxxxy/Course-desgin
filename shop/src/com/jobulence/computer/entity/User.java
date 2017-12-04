package com.jobulence.computer.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="USER")
public class User {
	
	private Integer id;
	private String name;
	private String country;
	private String companyname;
	private String address;
	private String town;
	private String county;
	private int postcode;
	private String email;
	private int phone;
	private String password;
	private Set<Cart>cart = new HashSet<Cart>();
	private Set<Orders>order = new HashSet<Orders>();
	
	@Id
	@GeneratedValue(generator="a")
	@GenericGenerator(name="a",strategy="identity")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public  User() {
		
	}
	public User(String name, String country, String companyname, String address, String town, String county,
			int postcode, String email, int phone, String password) {
		this.name = name;
		this.country = country;
		this.companyname = companyname;
		this.address = address;
		this.town = town;
		this.county = county;
		this.postcode = postcode;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	

	@OneToMany(mappedBy="user",targetEntity=Orders.class,cascade=CascadeType.MERGE)
	public Set<Orders> getOrder() {
		return order;
	}
	public void setOrder(Set<Orders> order) {
		this.order = order;
	}
	@OneToMany(mappedBy="user",targetEntity=Cart.class,cascade=CascadeType.MERGE)
	public Set<Cart> getCart() {
		return cart;
	}
	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}
}
