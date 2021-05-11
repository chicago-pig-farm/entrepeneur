

/**
 * <p>The House class is an accessor class used to access the relevant House's elements</p>
 * @author John Doe
 * @version 1.0
 */
public class House{
    String HouseId;
    int costPrice;
    int salePrice;
    int rentTaxFine;

    /**
     * <p>Constructor that passes HouseId,  costPrice,  salePrice and rentTaxFine and initializes them
     * <p/>
     */
    public House(String HouseId, int costPrice, int salePrice, int rentTaxFine) {
        this.HouseId=HouseId;
        this.costPrice=costPrice;
        this.salePrice=salePrice;
        this.rentTaxFine=rentTaxFine;

    }

    /**
     * <p>accesses the HouseId<p/>
     * @return String.
     */
    public String getHouseId() {
        return HouseId;
    }

    /**
     * <p>sets the houseId<p/>
     * @Param houseId String value passed
     * @return void
     */
    public void setHouseId(String houseId) {
        HouseId = houseId;
    }

    /**
     * <p>accesses the costPrice<p/>
     * @return int.
     */
    public int getCostPrice() {
        return costPrice;
    }

    /**
     * <p>sets the costPrice<p/>
     * @Param costPrice int value passed
     * @return void
     */
    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * <p>accesses the salePrice<p/>
     * @return int.
     */
    public int getSalePrice() {
        return salePrice;
    }

    /**
     * <p>sets the salePrice<p/>
     * @Param salePrice int value passed
     * @return void
     */
    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * <p>accesses the rentTaxFine<p/>
     * @return int.
     */
    public int getRentTaxFine() {
        return rentTaxFine;
    }

    /**
     * <p>sets the rentTaxFine<p/>
     * @Param rentTaxFine int value passed
     * @return void
     */
    public void setRentTaxFine(int rentTaxFine) {
        this.rentTaxFine = rentTaxFine;
    }
}
