package Exercise9.DAO;

import java.util.Collection;

import Exercise9.DTO.InvoiceTransactionDTO;

public abstract class InvoiceTransactionDAO {
	abstract public InvoiceTransactionDTO findByID(int itemNumber, int invoiceNumber);
	abstract public Collection<InvoiceTransactionDTO> findAll();
	abstract public InvoiceTransactionDTO update(InvoiceTransactionDTO invoiceTransactionDTO);
	abstract public int deleteItem(InvoiceTransactionDTO invoiceTransactionDTO);
}