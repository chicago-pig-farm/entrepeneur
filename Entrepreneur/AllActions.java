

import java.util.List;

/**
 * <p>The AllActions interface declares methods that will be implemented by classes
 * in this project</p>
 * @author John Doe
 * @version 1.0
 */
public interface AllActions {
    Asset asset = null;
    int purchase(Asset asset, Player p);
    int sell(Asset asset, Player p);
    int sell(Hotel asset, Player p);
    int sell(House asset, Player p);
    int sell(Mall asset, Player p);
    int[] payRentTaxFine(Asset asset,Player p);
    int[] payRentTaxFine(PrivateAsset asset,Player rentor,Player owner);
    int[] payRentTaxFine(Mall asset, Player p, Player owner);
    void addCashStartCube(Player[] p);
    List<Integer> rollDice(Player p);
    void playerMove(Player p, Integer total);
    int buildHouse(PrivateAsset asset, House h, Player p);
    int buildHotel(PrivateAsset asset, Hotel h, Player p);
    int buildMall(Mall asset, Player p);
}
