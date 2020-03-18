package com.niit.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.daoimpl.PhoneDAOImpl;
import com.niit.daoimpl.CartDAOImpl;
import com.niit.daoimpl.UserDAOImpl;
import com.niit.model.Phone;
import com.niit.model.CartItem;
import com.niit.model.User;

public class CartTest
{
	CartDAOImpl cdi=new CartDAOImpl();
	UserDAOImpl udi=new UserDAOImpl();
	PhoneDAOImpl pdi=new PhoneDAOImpl();
	
	@Test
	
	public void addCartItem()
	{
		CartItem c=new CartItem();
		
		User u=udi.displayUserById(1);
		Phone p=pdi.displayPhoneById(1);
		
		c.setUser(u);
		c.setPhone(p);
		cdi.addCartItem(c);
	}
	
	@Test
	public void displayCartItemsByName()
	{
		List<CartItem> cartItems=cdi.displayCartItems("Govind123");
		
		for(CartItem c:cartItems)
		{
			System.out.println(c.getCartitemid());
			System.out.println(c.getPhone().getPhoneid());
			System.out.println(c.getPhone().getPhonename());
			System.out.println(c.getUser().getUsername());
		}
	}
	
	
}