

/**
 * <p>The Mall class is an accessor class used to access the relevant Mall's elements</p>
 * @author John Doe
 * @version 1.0
 */
public class Mall extends PrivateAsset{
    Player owner;
    String assetName;
    int costPrice;
    int salePrice;
    int rentTaxFine;
    boolean built;

    /**
     * <p>Constructor that passes owner,  assetName,  costPrice, salePrice, rentTaxFine and  built and initializes them
     * <p/>
     */
    public Mall(Player owner,String assetName, int costPrice, int salePrice, int rentTaxFine, boolean built) {
        super(owner,assetName, costPrice, salePrice, rentTaxFine);
        this.owner=owner;
        this.assetName=assetName;
        this.costPrice=costPrice;
        this.salePrice=salePrice;
        this.rentTaxFine=rentTaxFine;
        this.built=built;
    }

    /**
     * <p>accesses the owner<p/>
     * @return Player.
     */
    @Override
    public Player getOwner() {
        return owner;
    }

    /**
     * <p>sets the owner<p/>
     * @Param owner Player value passed
     * @return void
     */
    public void setOwner(Player owner) {
        this.owner = owner;
    }

    /**
     * <p>accesses the assetName<p/>
     * @return String.
     */
    @Override
    public String getAssetName() {
        return assetName;
    }

    /**
     * <p>sets the assetName<p/>
     * @Param assetName String value passed
     * @return void
     */
    @Override
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>accesses the costPrice<p/>
     * @return int.
     */
    @Override
    public int getCostPrice() {
        return costPrice;
    }

    /**
     * <p>sets the costPrice<p/>
     * @Param costPrice String value passed
     * @return void
     */
    @Override
    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * <p>accesses the salePrice<p/>
     * @return int.
     */
    @Override
    public int getSalePrice() {
        return salePrice;
    }

    /**
     * <p>sets the salePrice<p/>
     * @Param salePrice String value passed
     * @return void
     */
    @Override
    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * <p>accesses the modified rentTaxFine<p/>
     * @return int.
     */
    @Override
    public int getRentTaxFine() {
        if(built==false) {
            return rentTaxFine;
        }else{
            return 2*rentTaxFine;
        }
    }

    /**
     * <p>sets the rentTaxFine<p/>
     * @Param rentTaxFine int value passed
     * @return void
     */
    @Override
    public void setRentTaxFine(int rentTaxFine) {
        this.rentTaxFine = rentTaxFine;
    }

    /**
     * <p>accesses the built<p/>
     * @return boolean.
     */
    public boolean isBuilt() {
        return built;
    }

    /**
     * <p>sets the built<p/>
     * @Param built boolean value passed
     * @return void
     */
    public void setBuilt(boolean built) {
        this.built = built;
    }
}
