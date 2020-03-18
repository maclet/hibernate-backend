package com.niit.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.daoimpl.PhoneDAOImpl;
import com.niit.model.Phone;

public class PhoneTest {
PhoneDAOImpl pdi=new PhoneDAOImpl();
	
	@Test
	
	public void addPhone()
	{
		Phone p=new Phone();
		p.setPhoneid(123);
		p.setPhonename("Redmi");
		p.setBrand("note 8 pro");
		p.setPrice(16000f);
		p.setLink("https://www.flipkart.com/search");
		pdi.addPhone(p);
	}
	
	@Test
	@Ignore
	public void deletePhone()
	{
		pdi.deletePhone(1);
	}
	
	@Test
	@Ignore
	public void updatePhone()
	{
		Phone p=pdi.displayPhoneById(123);
		p.setPhonename("Redmi");
		pdi.updatePhone(p);
	}
	
	@Test
	@Ignore
	public void displayPhoneById()
	{
		assertNotNull( pdi.displayPhoneById(123));
	}
	
	@Test
	@Ignore
	public void displayPhone()
	{
		assertNotNull(pdi.displayPhone());
	}

}
