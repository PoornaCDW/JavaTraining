package Exercise9.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Exercise9.DBUtility;
import Exercise9.DTO.CustomerDTO;

public class CustomerDAOImplementation extends CustomerDAO implements Cloneable {
    private CustomerDAOImplementation() {}
	
	private static CustomerDAOImplementation customerDAO;
	public static CustomerDAOImplementation getUserDAOImplObject() {
		if(customerDAO == null) {
			customerDAO = new CustomerDAOImplementation();
			return customerDAO;
		}
		else {
			return customerDAO.createClone();
		}
	}
	private CustomerDAOImplementation createClone() {
		if(customerDAO != null) {
			try { 
				return (CustomerDAOImplementation)super.clone();
			} catch(CloneNotSupportedException e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	@Override
	public CustomerDTO findByID(int customerID) {
		try {
				Connection connection = DBUtility.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("select * from custome_rmaster where customer_id=?");
				preparedStatement.setInt(1, customerID);
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					CustomerDTO customerDTO = new CustomerDTO();
					customerDTO.setCustomerId(resultSet.getInt("customer_id"));
					customerDTO.setCustomerAddress(resultSet.getString("customer_address"));
					customerDTO.setCustomerName(resultSet.getString("customer_name"));
					return customerDTO;
			}
				
			else {
				return null;
			}
				
			} catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}

	@Override
	public CustomerDTO findByName(String uname) {
		try {
				Connection connection = DBUtility.getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("select * from customer_master where customer_name=?");
				preparedStatement.setString(1, uname);
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					CustomerDTO customerDTO = new CustomerDTO();
					customerDTO.setCustomerAddress(resultSet.getString("customer_address"));
					customerDTO.setCustomerId(resultSet.getInt("customer_id"));
					customerDTO.setCustomerName(resultSet.getString("customer_name"));
					return customerDTO;
			}
			else {
				return null;
			}
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	@Override
	public Collection<CustomerDTO> findAll() {
		try {
				Connection connection = DBUtility.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from customer_master");
				List<CustomerDTO> customers = new ArrayList<CustomerDTO>();
				while(resultSet.next()) {
					CustomerDTO customerDTO = new CustomerDTO();
					customerDTO.setCustomerAddress(resultSet.getString("customer_address"));
					customerDTO.setCustomerId(resultSet.getInt("customer_id"));
					customerDTO.setCustomerName(resultSet.getString("customer_name"));
					customers.add(customerDTO);
				}
				return customers;
		} catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	@Override
	public CustomerDTO updateUser(CustomerDTO userDTO) {
		try {
				Connection connection = DBUtility.getConnection();
				int customerID = userDTO.getCustomerId();
				PreparedStatement preparedStatement = connection.prepareStatement("select * from customer_master where customer_id=?");
				preparedStatement.setInt(1, customerID);
				ResultSet rs = preparedStatement.executeQuery();
				if(rs.next()) {
					preparedStatement=connection.prepareStatement("update customer_master set customer_name=?,customer_address=? where customer_id=?");
					preparedStatement.setString(1, userDTO.getCustomerName());
					preparedStatement.setString(2, userDTO.getCustomerAddress());
					preparedStatement.setInt(3, userDTO.getCustomerId());
					DBUtility.closeConnection(null);
					return userDTO;
			}
			else {
				return null;
			}	
		} catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return null;
		}
	}

	@Override
	public int deleteUserByID(int customerID) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from customer_master where customer_id=?");
			preparedStatement.setInt(1, customerID);
			int n = preparedStatement.executeUpdate();
			return n;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}
}
