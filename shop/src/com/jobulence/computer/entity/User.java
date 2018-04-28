package com.jobulence.computer.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private String phone;
	private String password;
	private UserCart userCart;
	private UserOrder userOrder;
	private Set<Userloginlogging> userLoginLogging = new HashSet<Userloginlogging>();
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@OneToOne(mappedBy="user",targetEntity=UserOrder.class,cascade=CascadeType.MERGE)
	public UserOrder getUserOrder() {
		return userOrder;
	}
	public void setUserOrder(UserOrder userOrder) {
		this.userOrder = userOrder;
	}
	@OneToOne(mappedBy="user",targetEntity=UserCart.class,cascade=CascadeType.MERGE)
	public UserCart getUserCart() {
		return userCart;
	}
	public void setUserCart(UserCart userCart) {
		this.userCart = userCart;
	}
	@OneToMany(cascade=CascadeType.ALL,targetEntity=Userloginlogging.class)
	@JoinColumn(name="user_id")
	public Set<Userloginlogging> getUserLoginLogging() {
		return userLoginLogging;
	}
	
	public void setUserLoginLogging(Set<Userloginlogging> userLoginLogging) {
		this.userLoginLogging = userLoginLogging;
	}
	public  User() {
		
	}

	public User(String name, String country, String companyname, String address, String town, String county,
			int postcode, String email, String phone, String password) {
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
	
}
