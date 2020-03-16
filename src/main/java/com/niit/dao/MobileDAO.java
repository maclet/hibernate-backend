package com.niit.dao;

import java.util.List;

import com.niit.model.Mobile;

public interface MobileDAO 
{
	public boolean addBook(Mobile Mobile);
	public boolean deleteBook(int Mobileid);
	public boolean updateBook(Mobile Mobile);
	public List<Mobile> displayMobile();
	public Mobile displayMobileById(int Mobileid);
	public List<Mobile> displayMobileByModel(String MobileModel);
	public List<Mobile> displayMobileByPriceHighToLow();
	public List<Mobile> displayMobileByPriceLowToHigh();
}