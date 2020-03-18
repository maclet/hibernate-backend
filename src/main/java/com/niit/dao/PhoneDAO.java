package com.niit.dao;

import java.util.List;

import com.niit.model.Phone;

public interface PhoneDAO 
{
	public boolean addBook(Phone book);
	public boolean deleteBook(int phoneid);
	public boolean updateBook(Phone phone);
	public List<Phone> displayPhone();
	public Phone displayPhoneById(int phoneid);
	public List<Phone> displayPhoneByName(String phonename);
	public List<Phone> displayPhoneByPriceHighToLow();
	public List<Phone> displayPhoneByPriceLowToHigh();
}