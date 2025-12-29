package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ICustomerDAO;
import com.nt.model.Customer;

@Service("custService")
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerDAO customerDAO;
	
	@Override
	public String registerCustomer(Customer customer) throws Exception {
		//Calculate the discount amount
		double discountAmount = (customer.getBillamount()) * (customer.getDiscount() / 100.0);
		//Calculate the Final Amount 
		double finalAmount = customer.getBillamount() - discountAmount;
		//Set the Final Amount to the Customer Object
		customer.setFinalamount(finalAmount);
		int count = customerDAO.insert(customer);
		
		return (count==0) ? "Unfortunately Registration Failed" :  "Registtration has Successfully done with discountAmount: "+discountAmount+" and the final Amount of the product is : "+finalAmount;
	}

}
