

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

/**
 * <p>The Player class is an accessor class used to access the relevant Player's elements</p>
 * @author John Doe
 * @version 1.0
 */
public class Player {
    private  String name="";
    private  HashMap<JLabel, PrivateAsset> assets=new HashMap<>();
    private  Integer currPosition;
    private  Integer prevPosition;
    private  Integer cashBefore;
    private  Integer cashAfter;
    private  Integer goj;


    /**
     * <p>Constructor that passes name,  currPosition,  prevPosition,
     *  cashBefore,  cashAfter and goj and initializes them
     * <p/>
     */
    public Player(String name, Integer currPosition, Integer prevPosition, Integer cashBefore, Integer cashAfter, Integer goj) {
        this.name = name;
        this.currPosition = currPosition;
        this.prevPosition = prevPosition;
        this.cashBefore = cashBefore;
        this.cashAfter = cashAfter;
        this.goj=goj;

    }


    /**
     * <p>accesses the cashBefore<p/>
     * @return Integer.
     */
    public Integer getCashBefore() {
        return cashBefore;
    }

    /**
     * <p>sets the cashBefore<p/>
     * @Param cashBefore Integer value passed
     * @return void
     */
    public void setCashBefore(Integer cashBefore) {
        this.cashBefore = cashBefore;
    }

    /**
     * <p>accesses the cashAfter<p/>
     * @return Integer.
     */
    public Integer getCashAfter() {
        return cashAfter;
    }

    /**
     * <p>sets the cashAfter<p/>
     * @Param cashAfter Integer value passed
     * @return void
     */
    public void setCashAfter(Integer cashAfter) {
        this.cashAfter = cashAfter;
    }

    /**
     * <p>accesses the name<p/>
     * @return String.
     */
    public String getName() {
        return name;
    }

    /**
     * <p>sets the name<p/>
     * @Param name String value passed
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>accesses the assets<p/>
     * @return HashMap<JLabel, PrivateAsset>.
     */
    public HashMap<JLabel, PrivateAsset> getAssets() {
        return assets;
    }

    /**
     * <p>sets the assets<p/>
     * @Param assets HashMap<JLabel, PrivateAsset> value passed
     * @return void
     */
    public void setAssets(HashMap<JLabel, PrivateAsset> assets) {
        this.assets = assets;
    }

    /**
     * <p>accesses the currPosition<p/>
     * @return Integer.
     */
    public Integer getCurrPosition() {
        return currPosition;
    }

    /**
     * <p>sets the currPosition<p/>
     * @Param currPosition Integer value passed
     * @return void
     */
    public void setCurrPosition(Integer currPosition) {
        this.currPosition = currPosition;
    }

    /**
     * <p>accesses the prevPosition<p/>
     * @return Integer.
     */
    public Integer getPrevPosition() {
        return prevPosition;
    }

    /**
     * <p>sets the prevPosition<p/>
     * @Param prevPosition Integer value passed
     * @return void
     */
    public void setPrevPosition(Integer prevPosition) {
        this.prevPosition = prevPosition;
    }

    /**
     * <p>accesses the goj<p/>
     * @return Integer.
     */
    public Integer getGoj() {
        return goj;
    }

    /**
     * <p>sets the goj<p/>
     * @Param goj Integer value passed
     * @return void
     */
    public void setGoj(Integer goj) {
        this.goj = goj;
    }
}
