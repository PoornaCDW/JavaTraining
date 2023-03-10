package Exercise9.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Exercise9.DBUtility;
import Exercise9.DTO.InvoiceTransactionDTO;

public class InvoiceTransactionDAOImplementation extends InvoiceTransactionDAO implements Cloneable {

    private static InvoiceTransactionDAOImplementation invoiceTransDAO;

    private InvoiceTransactionDAOImplementation() {}

	public static InvoiceTransactionDAOImplementation getUserDAOImplObject() {
		if(invoiceTransDAO == null) {
			invoiceTransDAO = new InvoiceTransactionDAOImplementation();
			return invoiceTransDAO;
		}
		else {
			return invoiceTransDAO.createClone();
		}
	}
	private  InvoiceTransactionDAOImplementation createClone() {
		if(invoiceTransDAO!=null) {
			try {
				return (InvoiceTransactionDAOImplementation)super.clone();
			}catch(CloneNotSupportedException e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}

    @Override
    public InvoiceTransactionDTO findByID(int itemNumber, int invoiceNumber) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from invoice_trans where invoiceno=? and itemno=?");
			preparedStatement.setInt(1, invoiceNumber);
			preparedStatement.setInt(2, itemNumber);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				InvoiceTransactionDTO invoiceTransDTO = new InvoiceTransactionDTO();
				invoiceTransDTO.setInvoiceNumber(rs.getInt("invoiceno"));
				invoiceTransDTO.setItemNumber(rs.getInt("itemno"));
				invoiceTransDTO.setItemQuantity(rs.getInt("itemqty"));
				return invoiceTransDTO;
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
    public Collection<InvoiceTransactionDTO> findAll() {
		try {
			Connection connection = DBUtility.getConnection();
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select * from invoice_trans");
			List<InvoiceTransactionDTO> transactions = new ArrayList<InvoiceTransactionDTO>();
			while(resultSet.next()) {
				InvoiceTransactionDTO dto = new InvoiceTransactionDTO();
				dto.setInvoiceNumber(resultSet.getInt("invoiceno"));
				dto.setItemNumber(resultSet.getInt("itemno"));
				dto.setItemQuantity(resultSet.getInt("itemqty"));
				transactions.add(dto);
			}
			return transactions;
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
    }

    @Override
    public InvoiceTransactionDTO update(InvoiceTransactionDTO invoiceTransactionDTO) {
		try {
			Connection connection=DBUtility.getConnection();
			int invoiceno = invoiceTransactionDTO.getInvoiceNumber();
			int itemno = invoiceTransactionDTO.getItemNumber();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from invoice_trans where invoiceno=? and itemno=?");
			preparedStatement.setInt(1, invoiceno);
			preparedStatement.setInt(2, itemno);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				preparedStatement = connection.prepareStatement("update invoice_trans set itemqty=? where invoiceno=? and itemno=?");
				preparedStatement.setInt(1, invoiceTransactionDTO.getItemQuantity());
				preparedStatement.setInt(2, invoiceno);
				preparedStatement.setInt(3, itemno);
				preparedStatement.executeUpdate();
				DBUtility.closeConnection(null);
				return invoiceTransactionDTO;
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
    public int deleteItem(InvoiceTransactionDTO invoiceTransactionDTO) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from invoice_trans where invoiceno=? and itemno=?");
			preparedStatement.setInt(1, invoiceTransactionDTO.getInvoiceNumber());
			preparedStatement.setInt(2, invoiceTransactionDTO.getItemNumber());
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
