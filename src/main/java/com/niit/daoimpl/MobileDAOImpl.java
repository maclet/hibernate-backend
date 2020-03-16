package com.niit.daoimpl;
//
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.dao.MobileDAO;
import com.niit.dbconfig.HibernateUtil;
import com.niit.model.Mobile;

public class MobileDAOImpl implements MobileDAO
{

	public boolean addMobile(Mobile mobile)
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(mobile);
		tx.commit();
		return true;
	}

	public boolean deleteMobile(int Mobileid) 
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Mobile Mobile=new Mobile();
		Mobile.setMobileid(Mobileid);
		session.delete(Mobile);
		tx.commit();
		return true;
	}

	public boolean updateMobile(Mobile mobile) 
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.update(mobile);
		tx.commit();
		return true;
	}

	public List<Mobile> displayMobile()
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.Mobile").list();
	}

	public Mobile displayMobileById(int Mobileid) 
	{
		Session session=HibernateUtil.getSession();
		Query query=session.createQuery("from com.niit.model.Mobile where Mobileid= :mid");
		query.setParameter("mid", Mobileid);
		return (Mobile)query.getResultList().get(0);
	}
	
	public List<Mobile> displayMobileByName(String name)
	{
		Session session=HibernateUtil.getSession();
		Query query=session.createQuery("from com.niit.model.Mobile where MobileModel like :name");
		query.setParameter("name", "%"+name+"%");
		return query.getResultList();
	}
	
	public List<Mobile> displayMobileByPriceHighToLow() 
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.Mobile order by price desc").getResultList();
	}

	public List<Mobile> displayBookByPriceLowToHigh() 
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.Mobile order by price asc").getResultList();
	}
}

	