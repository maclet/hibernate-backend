package com.niit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Phone")
public class Phone
{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Phoneid;
		@Column
		private String Phonename;
		private String Brand;
		private float price;
		@Column(length=999999)
		private String link;
		public int getPhoneid() {
			return Phoneid;
		}
		public void setPhoneid(int phoneid) {
			Phoneid = phoneid;
		}
		public String getPhonename() {
			return Phonename;
		}
		public void setPhonename(String phonename) {
			Phonename = phonename;
		}
		public String getBrand() {
			return Brand;
		}
		public void setBrand(String brand) {
			Brand = brand;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public String getLink() {
			return link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		
		@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "phone")
		private List<CartItem> cartItems;
		public List<CartItem> getCartItems() {
			return cartItems;
		}
		public void setCartItems(List<CartItem> cartItems) {
			this.cartItems = cartItems;
		}
		
		
		
		
	}