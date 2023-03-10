package Exercise9.DTO;

public class CustomerDTO {
    private int customerId;
    private String customerName;
    private String customerAddreass;

    public CustomerDTO() {}

    public CustomerDTO(int customerId, String customerName, String customerAddreass) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddreass = customerAddreass;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return this.customerAddreass;
    }

    public void setCustomerAddress(String customerAddreass) {
        this.customerAddreass = customerAddreass;
    }

    @Override
    public String toString() {
        return "{" +
            " customerId='" + getCustomerId() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", customerAddreass='" + getCustomerAddress() + "'" +
            "}";
    }
}