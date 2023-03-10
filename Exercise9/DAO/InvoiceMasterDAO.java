package Exercise9.DAO;

import java.sql.Date;
import java.util.Collection;

import Exercise9.DTO.InvoiceMasterDTO;

public abstract class InvoiceMasterDAO {
    abstract public InvoiceMasterDTO findByID(int invoiceNumber);
	abstract public InvoiceMasterDTO findByOrderDate(Date date);
	abstract public Collection<InvoiceMasterDTO> findAll();
	abstract public InvoiceMasterDTO update(InvoiceMasterDTO invoiceMasterDTO);
	abstract public int deleteItem(InvoiceMasterDTO invoiceMasterDTO);
}