

/**
 * <p>The Hotel class is an accessor class used to access the relevant Hotel's elements</p>
 * @author John Doe
 * @version 1.0
 */
public class Hotel {

    String HotelId;
    int costPrice;
    int salePrice;
    int rentTaxFine;

    /**
     * <p>Constructor that passes HotelId,  costPrice,  salePrice and rentTaxFine and initializes them
     * <p/>
     */
    public Hotel(String HotelId, int costPrice, int salePrice, int rentTaxFine) {
        this.HotelId=HotelId;
        this.costPrice=costPrice;
        this.salePrice=salePrice;
        this.rentTaxFine=rentTaxFine;

    }

    /**
     * <p>accesses the HotelId<p/>
     * @return String.
     */
    public String getHotelId() {
        return HotelId;
    }

    /**
     * <p>sets the hotelId<p/>
     * @Param hotelId String value passed
     * @return void
     */
    public void setHotelId(String hotelId) {
        HotelId = hotelId;
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
     * @Param costPrice String value passed
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
     * @Param salePrice String value passed
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
     * @Param rentTaxFine String value passed
     * @return void
     */
    public void setRentTaxFine(int rentTaxFine) {
        this.rentTaxFine = rentTaxFine;
    }
}
