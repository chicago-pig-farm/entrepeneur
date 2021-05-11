


/**
 * <p>The Asset class is an accessor class used to access the relevant Asset's elements</p>
 * @author John Doe
 * @version 1.0
 */
public class Asset {
    private String assetName = "";
    private int costPrice = 0;
    private int salePrice = 0;
    private int rentTaxFine = 0;

    /**
     * <p>Constructor that passes assetName, costPrice, salePrice
     * and rentTaxFine
     * <p/>
     */
    public Asset(String assetName, int costPrice, int salePrice, int rentTaxFine) {
        this.assetName = assetName;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
        this.rentTaxFine = rentTaxFine;
    }

    /**
     * <p>accesses the asset name<p/>
     * @return String.
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * <p>sets the asset name<p/>
     * @Param assetName String value passed
     * @return String
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName;
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

    /**
     * <p>prints the string version of the object and it's elements<p/>
     * @return String
     */
    @Override
    public String toString() {
        return "Asset{" +
                "assetName='" + assetName + '\'' +
                ", costPrice=" + costPrice +
                ", salePrice=" + salePrice +
                ", rentTaxFine=" + rentTaxFine +
                '}';
    }
}
