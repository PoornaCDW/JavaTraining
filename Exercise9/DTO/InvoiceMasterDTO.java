package Exercise9.DTO;

import java.sql.Date;

public class InvoiceMasterDTO {
    private int invoiceNumber;
    private Date date;
    private int customerId;

    public InvoiceMasterDTO() {}

    public InvoiceMasterDTO(int invoiceNumber, Date date, int customerId) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.customerId = customerId;
    }

    public int getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "{" +
            " invoiceNumber='" + getInvoiceNumber() + "'" +
            ", date='" + getDate() + "'" +
            ", customerId='" + getCustomerId() + "'" +
            "}";
    }
}
