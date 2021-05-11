

/**
 * <p>The PrivateAsset class is an accessor class used to access the relevant PrivateAsset's elements</p>
 * @author John Doe
 * @version 1.0
 */
public class PrivateAsset extends Asset{
    House H1,H2,H3,H4,H5;
    Hotel hotel;
    Player owner;
    boolean h1bool,h2bool,h3bool,h4bool,h5bool,hotelbool;

    /**
     * <p>Constructor that passes owner,  assetName,  costPrice, salePrice and rentTaxFine  and initializes them
     * <p/>
     */
    public PrivateAsset(Player owner,String assetName, int costPrice, int salePrice, int rentTaxFine) {
        super(assetName, costPrice, salePrice, rentTaxFine);
        this.owner=owner;
        H1=new House("H1",(2*costPrice),(costPrice),(costPrice/2));
        H2=new House("H2",(2*costPrice),(costPrice),(costPrice/2));
        H3=new House("H3",(2*costPrice),(costPrice),(costPrice/2));
        H4=new House("H4",(2*costPrice),(costPrice),(costPrice/2));
        H5=new House("H5",(2*costPrice),(costPrice),(costPrice/2));
        hotel=new Hotel("Hotel",(5*costPrice),(4*costPrice),(2*costPrice));
    }

    /**
     * <p>accesses the H1<p/>
     * @return House.
     */
    public House getH1() {
        return H1;
    }

    /**
     * <p>sets the H1<p/>
     * @Param h1 House value passed
     * @return void
     */
    public void setH1(House h1) {
        H1 = h1;
    }

    /**
     * <p>accesses the H2<p/>
     * @return House.
     */
    public House getH2() {
        return H2;
    }

    /**
     * <p>sets the H2<p/>
     * @Param h2 House value passed
     * @return void
     */
    public void setH2(House h2) {
        H2 = h2;
    }

    /**
     * <p>accesses the H3<p/>
     * @return House.
     */
    public House getH3() {
        return H3;
    }

    /**
     * <p>sets the H3<p/>
     * @Param h3 House value passed
     * @return void
     */
    public void setH3(House h3) {
        H3 = h3;
    }

    /**
     * <p>accesses the H4<p/>
     * @return House.
     */
    public House getH4() {
        return H4;
    }

    /**
     * <p>sets the H4<p/>
     * @Param h4 House value passed
     * @return void
     */
    public void setH4(House h4) {
        H4 = h4;
    }

    /**
     * <p>accesses the H5<p/>
     * @return House.
     */
    public House getH5() {
        return H5;
    }

    /**
     * <p>sets the H5<p/>
     * @Param h5 House value passed
     * @return void
     */
    public void setH5(House h5) {
        H5 = h5;
    }

    /**
     * <p>accesses the hotel<p/>
     * @return Hotel.
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * <p>sets the hotel<p/>
     * @Param hotel Hotel value passed
     * @return void
     */
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    /**
     * <p>accesses the owner<p/>
     * @return Player.
     */
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
     * <p>accesses the h1bool<p/>
     * @return boolean.
     */
    public boolean isH1bool() {
        return h1bool;
    }

    /**
     * <p>sets the h1bool<p/>
     * @Param h1bool boolean value passed
     * @return void
     */
    public void setH1bool(boolean h1bool) {
        this.h1bool = h1bool;
    }

    /**
     * <p>accesses the h2bool<p/>
     * @return boolean.
     */
    public boolean isH2bool() {
        return h2bool;
    }

    /**
     * <p>sets the h2bool<p/>
     * @Param h2bool boolean value passed
     * @return void
     */
    public void setH2bool(boolean h2bool) {
        this.h2bool = h2bool;
    }

    /**
     * <p>accesses the h3bool<p/>
     * @return boolean.
     */
    public boolean isH3bool() {
        return h3bool;
    }

    /**
     * <p>sets the h3bool<p/>
     * @Param h3bool boolean value passed
     * @return void
     */
    public void setH3bool(boolean h3bool) {
        this.h3bool = h3bool;
    }

    /**
     * <p>accesses the h4bool<p/>
     * @return boolean.
     */
    public boolean isH4bool() {
        return h4bool;
    }

    /**
     * <p>sets the h4bool<p/>
     * @Param h4bool boolean value passed
     * @return void
     */
    public void setH4bool(boolean h4bool) {
        this.h4bool = h4bool;
    }

    /**
     * <p>accesses the h5bool<p/>
     * @return boolean.
     */
    public boolean isH5bool() {
        return h5bool;
    }

    /**
     * <p>sets the h5bool<p/>
     * @Param h5bool boolean value passed
     * @return void
     */
    public void setH5bool(boolean h5bool) {
        this.h5bool = h5bool;
    }

    /**
     * <p>accesses the hotelbool<p/>
     * @return boolean.
     */
    public boolean isHotelbool() {
        return hotelbool;
    }

    /**
     * <p>sets the hotelbool<p/>
     * @Param hotelbool boolean value passed
     * @return void
     */
    public void setHotelbool(boolean hotelbool) {
        this.hotelbool = hotelbool;
    }
}
