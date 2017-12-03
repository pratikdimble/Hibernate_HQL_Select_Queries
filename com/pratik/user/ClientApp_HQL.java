package com.pratik.user;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pratik.domain.prod;
import com.pratik.domain.product;
import com.pree.utility.HibernateUtil;


public class ClientApp_HQL {
	private static final String hql_query="from prod ";
	public static void main(String[] args) {
		
		Session ses=null;
		//get the session
		ses=HibernateUtil.getSession();
		//create the HQL query
		Query query=ses.createQuery(hql_query);
		//execute the query
		List<prod> list=query.list();
			//display the result
		for(prod p:list)
		{
			System.out.println("\n\t"+p.getPid()+"\t"+p.getPname()+
						"\t"+p.getPrice()+p.getQuantity());
		}

		//close the session and session factory
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeFactory();
	System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE(06:00)==\n\n\n");
	}//main(-,-)
}//class
