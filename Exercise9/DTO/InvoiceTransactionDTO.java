package Exercise9.DTO;

public class InvoiceTransactionDTO {
    private int invoiceNumber;
    private int itemNumber;
    private int itemQuantity;

    public InvoiceTransactionDTO() {}

    public InvoiceTransactionDTO(int invoiceNumber, int itemNumber, int itemQuantity) {
        this.invoiceNumber = invoiceNumber;
        this.itemNumber = itemNumber;
        this.itemQuantity = itemQuantity;
    }

    public int getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getItemNumber() {
        return this.itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "{" +
            " invoiceNumber='" + getInvoiceNumber() + "'" +
            ", itemNumber='" + getItemNumber() + "'" +
            ", itemQuantity='" + getItemQuantity() + "'" +
            "}";
    }
}