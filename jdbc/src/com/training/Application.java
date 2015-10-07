package com.training;

import com.training.daos.CustomerDAOimpl;
import com.training.entity.Customer;
import com.training.ifaces.MyDAO;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDAO<Customer> dao = new CustomerDAOimpl();
		
		Customer obj = new Customer(456,"kkkk","mukesh@abc.com",988999L);
		
		int rowInserted = dao.add(obj);
		
		System.out.println(rowInserted+"row[s] inserted");
		
		/*System.out.println(dao.find(456));
		
		int del;
		String custName = "kkkk";
		del = dao.delete(custName);
		
		if(del==0)
			System.out.println(" !! Invalid Input, Please insert another name  !!");
		else
			System.out.println("Name "+custName+" Succecfully deleted from Database");*/

	}

}
