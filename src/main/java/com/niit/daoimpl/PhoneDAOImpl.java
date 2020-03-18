package com.niit.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.dao.PhoneDAO;
import com.niit.dbconfig.HibernateUtil;
import com.niit.model.Phone;

public class PhoneDAOImpl implements PhoneDAO
{

	public boolean addPhone(Phone phone)
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(phone);
		tx.commit();
		return true;
	}

	public boolean deletePhone(int phoneid) 
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Phone phone=new Phone();
		
		session.delete(phone);
		tx.commit();
		return true;
	}

	public boolean updatePhone(Phone phone) 
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.update(phone);
		tx.commit();
		return true;
	}

	public List<Phone> displayPhone()
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.Phone").list();
	}

	public Phone displayPhoneById(int phoneid) 
	{
		Session session=HibernateUtil.getSession();
		Query query=session.createQuery("from com.niit.model.Phone where phoneid= :pid");
		query.setParameter("pid", phoneid);
		return (Phone)query.getResultList().get(0);
	}
	
	public List<Phone> displayPhoneByName(String name)
	{
		Session session=HibernateUtil.getSession();
		Query query=session.createQuery("from com.niit.model.Phone where bookname like :name");
		query.setParameter("name", "%"+name+"%");
		return query.getResultList();
	}
	
	public List<Phone> displayPhoneByPriceHighToLow() 
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.Phone order by price desc").getResultList();
	}

	public List<Phone> displayBookByPriceLowToHigh() 
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.Phone order by price asc").getResultList();
	}

	
	public List<Phone> displayPhoneByPriceLowToHigh() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addBook(Phone book) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteBook(int phoneid) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateBook(Phone phone) {
		// TODO Auto-generated method stub
		return false;
	}

}