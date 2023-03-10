package Exercise9.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Exercise9.DBUtility;
import Exercise9.DTO.InvoiceMasterDTO;

public class InvoiceMasterDAOImplementation extends InvoiceMasterDAO implements Cloneable {

    private InvoiceMasterDAOImplementation() {}
	
	private static InvoiceMasterDAOImplementation invoiceMasterDAO;
	public static InvoiceMasterDAOImplementation getUserDAOImplObject() {
		if(invoiceMasterDAO==null) 
		{
			invoiceMasterDAO = new InvoiceMasterDAOImplementation();
			return invoiceMasterDAO;
		}
		else 
		{
			return invoiceMasterDAO.createClone();
		}
	}
	private InvoiceMasterDAOImplementation createClone() {
		if(invoiceMasterDAO != null) {
			try {
				return (InvoiceMasterDAOImplementation)super.clone();
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
    public InvoiceMasterDTO findByID(int invoiceNumber) {
        try {
            Connection connection = DBUtility.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from invoice_master where invoice=?");
            preparedStatement.setInt(1, invoiceNumber);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                InvoiceMasterDTO invoiceMasterDTO=new InvoiceMasterDTO();
                invoiceMasterDTO.setInvoiceNumber(resultSet.getInt("invoice"));
                invoiceMasterDTO.setDate(resultSet.getDate("date"));
                invoiceMasterDTO.setCustomerId(resultSet.getInt("customerid"));
                return invoiceMasterDTO;
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
    public InvoiceMasterDTO findByOrderDate(Date date) {
        try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from invoice_master where date=?");
			ps.setDate(1, date);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				InvoiceMasterDTO invoiceMasterDTO=new InvoiceMasterDTO();
				invoiceMasterDTO.setInvoiceNumber(rs.getInt("invoice"));
				invoiceMasterDTO.setDate(rs.getDate("date"));
				invoiceMasterDTO.setCustomerId(rs.getInt("customerid"));
				return invoiceMasterDTO;
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
    public Collection<InvoiceMasterDTO> findAll() {
		try {
			Connection connection = DBUtility.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from invoice_master");
			List<InvoiceMasterDTO> invoices=new ArrayList<InvoiceMasterDTO>();
			while(resultSet.next()) {
				InvoiceMasterDTO invoiceMasterDTO = new InvoiceMasterDTO();
				invoiceMasterDTO.setInvoiceNumber(resultSet.getInt("invoice"));
				invoiceMasterDTO.setDate(resultSet.getDate("date"));
				invoiceMasterDTO.setCustomerId(resultSet.getInt("customerid"));
				invoices.add(invoiceMasterDTO);
			}
			return invoices;
		} catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
    }

    @Override
    public InvoiceMasterDTO update(InvoiceMasterDTO invoiceMasterDTO) {
		try {
			Connection connection = DBUtility.getConnection();
			int invoiceNumber = invoiceMasterDTO.getInvoiceNumber();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from invoice_master where invoice=?");
			preparedStatement.setInt(1,invoiceNumber);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				preparedStatement = connection.prepareStatement("update invoice_master set customerid=?,date=? where invoice=?");
				preparedStatement.setInt(1, invoiceMasterDTO.getCustomerId());
				preparedStatement.setDate(2, invoiceMasterDTO.getDate());
				preparedStatement.executeUpdate();
				DBUtility.closeConnection(null);
				return invoiceMasterDTO;
			}
			else {
				return invoiceMasterDTO;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return invoiceMasterDTO;
		}
    }

    @Override
    public int deleteItem(InvoiceMasterDTO invoiceMasterDTO) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from invoice_master where invoice=?");
			ps.setInt(1, invoiceMasterDTO.getInvoiceNumber());
			int n = ps.executeUpdate();
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
