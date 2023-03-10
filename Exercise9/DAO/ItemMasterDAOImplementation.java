package Exercise9.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Exercise9.DBUtility;
import Exercise9.DTO.ItemMasterDTO;

public class ItemMasterDAOImplementation extends ItemMasterDAO implements Cloneable {
    
    private static ItemMasterDAOImplementation itemMasterDAO;

    private ItemMasterDAOImplementation() {}

	public static ItemMasterDAOImplementation getUserDAOImplObject() {
		if(itemMasterDAO == null) {
			itemMasterDAO = new ItemMasterDAOImplementation();
			return itemMasterDAO;
		}
		else {
			return itemMasterDAO.createClone();
		}
	}
	private ItemMasterDAOImplementation createClone() {
		if(itemMasterDAO != null) {
			try {
				return ( ItemMasterDAOImplementation)super.clone();
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
    public ItemMasterDTO findByID(int itemNumber) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from item_master where itemno=?");
			preparedStatement.setInt(1, itemNumber);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				ItemMasterDTO itemMasterDTO=new ItemMasterDTO();
				itemMasterDTO.setItemNumber(resultSet.getInt("itemno"));
				itemMasterDTO.setItemDescription(resultSet.getString("itemdescription"));
				itemMasterDTO.setItemPrice(resultSet.getFloat("itemprice"));
				itemMasterDTO.setItemUnit(resultSet.getString("item_unit"));
				return itemMasterDTO;
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
    public Collection<ItemMasterDTO> findAll() {
		try {
			Connection connection = DBUtility.getConnection();
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select * from item_master");
			List<ItemMasterDTO> items=new ArrayList<ItemMasterDTO>();
			while(resultSet.next()) {
				ItemMasterDTO itemMasterDTO=new ItemMasterDTO();
				itemMasterDTO.setItemNumber(resultSet.getInt("itemno"));
				itemMasterDTO.setItemDescription(resultSet.getString("itemdescription"));
				itemMasterDTO.setItemPrice(resultSet.getFloat("itemprice"));
				itemMasterDTO.setItemUnit(resultSet.getString("item_unit"));				
				items.add(itemMasterDTO);
			}
			return items;
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
    }

    @Override
    public ItemMasterDTO update(ItemMasterDTO itemMasterDTO) {
		try {
			Connection connection = DBUtility.getConnection();
			int itemNumber = itemMasterDTO.getItemNumber();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from item_master where itemno=?");
			preparedStatement.setInt(1, itemNumber);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				preparedStatement = connection.prepareStatement("update item_master set itemdescription=?,itemprice=?,item_unit=? where itemno=?");
				preparedStatement.setString(1, itemMasterDTO.getItemDescription());
				preparedStatement.setFloat(2, itemMasterDTO.getItemPrice());
				preparedStatement.setString(3, itemMasterDTO.getItemUnit());
				preparedStatement.executeUpdate();
				DBUtility.closeConnection(null);
				return itemMasterDTO;
			}
			else {
				return null;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return null;
		}
    }

    @Override
    public int deleteItem(ItemMasterDTO itemMasterDTO) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from item_master where itemno=?");
			preparedStatement.setInt(1, itemMasterDTO.getItemNumber());
			int n = preparedStatement.executeUpdate();
			return n;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
    }
}
