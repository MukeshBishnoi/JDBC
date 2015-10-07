package com.training.entity;

public class Customer {
	
	private long customer_Id;
	private String customer_Name;
	private String email_Id;
	private long handPhone;
	
	public Customer(long customer_Id, String customer_Name, String email_Id,
			long handPhone) {
		super();
		this.customer_Id = customer_Id;
		this.customer_Name = customer_Name;
		this.email_Id = email_Id;
		this.handPhone = handPhone;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//protocl:subprotocol/driver/location/portNo/database
	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", customer_Name="
				+ customer_Name + ", email_Id=" + email_Id + ", handPhone="
				+ handPhone + "]";
	}

	public long getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(long customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	
	

}
