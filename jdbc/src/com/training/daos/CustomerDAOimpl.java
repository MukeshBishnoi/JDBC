package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.training.ifaces.MyDAO;
import com.training.utils.DbConnection;
import com.training.entity.*;

public class CustomerDAOimpl implements MyDAO<Customer> {
	
	private Connection con=null;
	
	
	
	public CustomerDAOimpl() {
		super();
		con=DbConnection.getOracleConnection();
	}


	public int add(Customer t){
		int rowInserted = 0;
		
		
		try {
			String sql = "Insert into prefCustomer2 values(?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setLong(1, t.getCustomer_Id());
			pstmt.setString(2, t.getCustomer_Name());
			pstmt.setString(3, t.getEmail_Id());
			pstmt.setLong(4, t.getHandPhone());
			
			rowInserted=pstmt.executeUpdate();
			//System.out.println("here "+rowInserted);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowInserted; 
	}
	

	@Override 
		public Customer find(int key) {
				// TODO Auto-generated method stub
				Customer cust = null;
				try {
					String sql = "select * from Cust where Cust_Id=?";
					PreparedStatement pstmt = con.prepareStatement(sql);
					pstmt.setLong(1, key);
					ResultSet rs = pstmt.executeQuery();
		if(rs.next())
					{
						long id=rs.getLong("Cust_Id");
						String customerName =  rs.getString("Cust_Name");
						String email_id = rs.getString("emailid");
						long handphone = rs.getLong("Phone");
						
						cust = new Customer();
						cust.setCustomer_Id(id);
						cust.setCustomer_Name(customerName);
						cust.setEmail_Id(email_id);
						cust.setHandPhone(handphone);
						
						
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return cust;
	}

	/*public Customer find(String key) {
		// TODO Auto-generated method stub
		Customer cust=null;
		try {
			String sql="select * from prefcustomer2 where customerName=?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				String CustomerName=rs.getString("customername");
				String email_Id=rs.getString("email_Id");
				long handphone=rs.getLong("handphone");
				long custId=rs.getLong("Customer_id");
				
				cust = new Customer();
				cust.setCustomer_Id(custId);
				cust.setCustomer_Name(CustomerName);
				cust.setEmail_Id(email_Id);
				cust.setHandPhone(handphone);
				
			}*/
			
		/*} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cust;
	}*/

	@Override
	public List<Customer> findAll() {
		
		
		try {
			String sql = "select * from prefcustomer2 ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public int delete(String keyval) {
		// TODO Auto-generated method stub
		
		try {
			
			String sql = "delete from prefcustomer2 where customername = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, keyval);
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public Customer update(String keyvalue, String newName) {
		// TODO Auto-generated method stub
		
		try {
			String sql = "update prefcustomer2 SET customerName = ? WHERE customerName = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,newName);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
