package Exercise9.DTO;

public class ItemMasterDTO {
    private int itemNumber;
    private float itemPrice;
    private String itemDescription;
    private String itemUnit;

    public ItemMasterDTO() {
    }

    public ItemMasterDTO(int itemNumber, float itemPrice, String itemDescription, String itemUnit) {
        this.itemNumber = itemNumber;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemUnit = itemUnit;
    }

    public int getItemNumber() {
        return this.itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public float getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemUnit() {
        return this.itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Override
    public String toString() {
        return "{" +
            " itemNumber='" + getItemNumber() + "'" +
            ", itemPrice='" + getItemPrice() + "'" +
            ", itemDescription='" + getItemDescription() + "'" +
            ", itemUnit='" + getItemUnit() + "'" +
            "}";
    }
}
