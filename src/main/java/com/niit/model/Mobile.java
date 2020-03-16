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
@Table(name = "Mobile")
public class Mobile
{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Mobileid;
		@Column
		private String MobileModel;
		private String Brand;
		private Float price;
		private String link;
		
		@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "Mobile")
		//private List<CartItem> cartItems;
		
		public String getLink() {
			return link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		
		public int getMobileid() {
			return Mobileid;
		}
		public void Mobileid(int mobileid) {
			  Mobileid=  Mobileid;
		}
		public String getMobileModel() {
			return MobileModel;
		}
		public void setMobileModel(String mobilemodel) {
			MobileModel = MobileModel;
		}
		public String getBrand() {
			return Brand;
		}
		public void setBrand(String brand) {
			Brand = Brand;
		}
		public Float getPrice() {
			return price;
		}
		public void setPrice(Float price) {
			this.price = price;
		}
		
		
		
	}