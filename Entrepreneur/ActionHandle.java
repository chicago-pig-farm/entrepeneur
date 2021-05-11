

import javax.swing.*;
import java.util.*;

/**
 * <p>The ActionHandle class implements AllActions interface and it's methods</p>
 * @author John Doe
 * @version 1.0
 */
public class ActionHandle implements AllActions{
    public static final int numDice=2;
    HashMap<Integer,JLabel> assetPosMap=new HashMap<>();

    /**
     * <p>Constructor that passes the required arguments
     * to it's super class
     * <p/>
     */
    public ActionHandle(JLabel startLabel,JLabel jail1Label,JLabel jail2Label,JLabel jail3Label,JLabel suffolkLabel ,JLabel wccLabel
            ,JLabel marvelLabel ,JLabel gojLabel
            ,JLabel nyLabel ,JLabel cincinnatiLabel,JLabel hollywoodLabel
            , JLabel orphanageLabel ,JLabel londonLabel ,JLabel moscowLabel ,JLabel disneyLabel
            ,JLabel propertyTaxLabel ,JLabel tokyoLabel , JLabel shanghaiLabel ,JLabel hallmarkLabel ,JLabel corporateTaxLabel){

        //initialize Assets
        assetPosMap.put(1,startLabel);
        assetPosMap.put(2,hollywoodLabel);
        assetPosMap.put(3,nyLabel);
        assetPosMap.put(4,cincinnatiLabel);
        assetPosMap.put(5,orphanageLabel);
        assetPosMap.put(6,jail1Label);
        assetPosMap.put(7,moscowLabel);
        assetPosMap.put(8,londonLabel);
        assetPosMap.put(9,disneyLabel);
        assetPosMap.put(10,propertyTaxLabel);
        assetPosMap.put(11,jail2Label);
        assetPosMap.put(12,suffolkLabel);
        assetPosMap.put(13,marvelLabel);
        assetPosMap.put(14,gojLabel);
        assetPosMap.put(15,wccLabel);
        assetPosMap.put(16,jail3Label);
        assetPosMap.put(17,corporateTaxLabel);
        assetPosMap.put(18,tokyoLabel);
        assetPosMap.put(19,shanghaiLabel);
        assetPosMap.put(20,hallmarkLabel);


    }

    /**
     * <p>executes the actions related to the purchase of an asset<p/>
     * @param asset Asset value passed
     * @param p Player value passed
     * @return int.
     */
    @Override
    public int purchase(Asset asset, Player p) {
        int cost=asset.getCostPrice();
        int playerCash=p.getCashAfter();
        if(playerCash<cost){
            return 0;
        }else{
            Integer i=new Integer(p.getCashAfter());
            p.setCashBefore(i);
            p.setCashAfter(playerCash-cost);

            return 1;
        }
    }

    /**
     * <p>executes the actions related to the sale of an asset<p/>
     * @param asset Asset value passed
     * @param p Player value passed
     * @return int.
     */
    @Override
    public int sell(Asset asset, Player p) {
        Integer i = new Integer(p.getCashAfter());
        p.setCashBefore(i);
        int result= (int) (i+ asset.getSalePrice());
        p.setCashAfter(result);


        return result;
    }

    /**
     * <p>executes the actions related to the purchase of a mall<p/>
     * @param asset Mall value passed
     * @param p Player value passed
     * @return int.
     */
    @Override
    public int sell(Mall asset, Player p) {
        Integer i = new Integer(p.getCashAfter());
        p.setCashBefore(i);
        int result= (int) (i+ asset.getSalePrice());
        p.setCashAfter(result);


        return result;
    }

    /**
     * <p>executes the actions related to the sale of a House<p/>
     * @param asset House value passed
     * @param p Player value passed
     * @return int.
     */
    @Override
    public int sell(House asset, Player p) {
        Integer i = new Integer(p.getCashAfter());
        p.setCashBefore(i);
        int result= (int) (i+ asset.getSalePrice());
        p.setCashAfter(result);


        return result;
    }

    /**
     * <p>executes the actions related to the sale of a Hotel<p/>
     * @param asset Hotel value passed
     * @param p Player value passed
     * @return int.
     */
    @Override
    public int sell(Hotel asset, Player p) {
        Integer i = new Integer(p.getCashAfter());
        p.setCashBefore(i);
        int result= (int) (i+ asset.getSalePrice());
        p.setCashAfter(result);


        return result;
    }

    /**
     * <p>executes the actions related to the payment of rent, tax or fine<p/>
     * @param asset Asset value passed
     * @param rentor Player value passed
     * @return int[].
     */
    @Override
    public int[] payRentTaxFine(Asset asset,Player rentor) {
        int playerCash=rentor.getCashAfter();
        double rent =0.0;
        if(asset.getAssetName().contains("propertyTax")) {

            double sum=0.0;


            for (Map.Entry<JLabel, PrivateAsset> set :
                    rentor.getAssets().entrySet()) {


                sum+=set.getValue().getCostPrice();

                if(set.getValue().isHotelbool()){
                    sum+=set.getValue().hotel.getCostPrice();
                }
                if(set.getValue().isH1bool()){
                    sum+=set.getValue().H1.getCostPrice();
                }
                if(set.getValue().isH2bool()){
                    sum+=set.getValue().H2.getCostPrice();
                }
                if(set.getValue().isH3bool()){
                    sum+=set.getValue().H3.getCostPrice();
                }
                if(set.getValue().isH4bool()){
                    sum+=set.getValue().H4.getCostPrice();
                }
                if(set.getValue().isH5bool()){
                    sum+=set.getValue().H5.getCostPrice();
                }




            }

            rent=(sum*asset.getRentTaxFine())/100;


        }else if(asset.getAssetName().contains("corporateTax")) {



            rent = (rentor.getCashAfter()*asset.getRentTaxFine())/100;

        }else{
            rent = asset.getRentTaxFine();
        }


        Integer i = new Integer(rentor.getCashAfter());
        rentor.setCashBefore(i);
        int result= (int) (playerCash - rent);
        rentor.setCashAfter(result);

        int a[]={result, (int) rent};
        return a;

    }

    /**
     * <p>executes the actions related to the payment of rent, tax or fine<p/>
     * @param asset Mall value passed
     * @param rentor Player value passed
     * @param owner Player value passed
     * @return int[].
     */
    @Override
    public int[]  payRentTaxFine(Mall asset,Player rentor,Player owner) {
        int playerCash=rentor.getCashAfter();
        int rent=asset.getRentTaxFine();
        Integer i = new Integer(rentor.getCashAfter());
        rentor.setCashBefore(i);
        int result=playerCash - rent;
        rentor.setCashAfter(result);


        Integer playerCashOwner=new Integer(owner.getCashAfter());
        owner.setCashBefore(playerCashOwner);
        owner.setCashAfter(playerCashOwner+rent);
        int a[]={result, (int) rent};
        return a;


    }

    /**
     * <p>executes the actions related to the payment of rent, tax or fine<p/>
     * @param asset PrivateAsset value passed
     * @param rentor Player value passed
     * @param owner Player value passed
     * @return int[].
     */
    @Override
    public int[] payRentTaxFine(PrivateAsset asset,Player rentor,Player owner) {

        int landRent=asset.getRentTaxFine();
        int h1Rent=asset.H1.getRentTaxFine();
        int h2Rent=asset.H2.getRentTaxFine();
        int h3Rent=asset.H3.getRentTaxFine();
        int h4Rent=asset.H4.getRentTaxFine();
        int h5Rent=asset.H5.getRentTaxFine();
        int hotelRent=asset.hotel.getRentTaxFine();
        int playerCash=rentor.getCashAfter();
        int sum=0;
        sum+=landRent;
        if(asset.isH1bool()){
            sum+=h1Rent;
        }
        if(asset.isH2bool()){
            sum+=h2Rent;
        }
        if(asset.isH3bool()){
            sum+=h3Rent;
        }
        if(asset.isH4bool()){
            sum+=h4Rent;
        }
        if(asset.isH5bool()){
            sum+=h5Rent;
        }
        if(asset.isHotelbool()){
            sum+=hotelRent;
        }


        Integer i = new Integer(rentor.getCashAfter());
        rentor.setCashBefore(i);
        int result=playerCash - sum;
        rentor.setCashAfter(result);


        Integer playerCashOwner=new Integer(owner.getCashAfter());
        owner.setCashBefore(playerCashOwner);
        owner.setCashAfter(playerCashOwner+sum);

        int a[]={result, (int) sum};
        return a;

    }


    /**
     * <p>executes the actions related to the building of a mall<p/>
     * @param asset Mall value passed
     * @param p Player value passed
     * @return int.
     */
    @Override
    public int buildMall(Mall asset, Player p) {
        int cost=asset.getCostPrice(); //cost price of land same as mall price
        int playerCash=p.getCashAfter();
        if(p.getName().equals("player1")) {
            if (playerCash < cost) {
                return 0;
            } else if (asset.isBuilt() == false) {
                Integer i = new Integer(p.getCashAfter());
                p.setCashBefore(i);
                p.setCashAfter(playerCash - cost);

                return 1;
            } else {
                return 2;
            }
        }else{
            if (playerCash < (2*cost)) {
                return 0;
            } else if (asset.isBuilt() == false) {
                Integer i = new Integer(p.getCashAfter());
                p.setCashBefore(i);
                p.setCashAfter(playerCash - cost);

                return 1;
            } else {
                return 2;
            }
        }
    }


    /**
     * <p>executes the actions related to the building of a House<p/>
     * @param asset PrivateAsset value passed
     * @param h House value passed
     * @param p Player value passed
     * @return int.
     */
    @Override
    public int buildHouse(PrivateAsset asset,House h,Player p) {


        int cost =0;
        int playerCash=p.getCashAfter();

        boolean bl=false;
        if(h.equals(asset.H1)){
            bl=asset.isH1bool();
            cost=asset.H1.costPrice;
        }
        if(h.equals(asset.H2)){
            bl=asset.isH2bool();
            cost=asset.H2.costPrice;
        }
        if(h.equals(asset.H3)){
            bl=asset.isH3bool();
            cost=asset.H3.costPrice;
        }
        if(h.equals(asset.H4)){
            bl=asset.isH4bool();
            cost=asset.H4.costPrice;
        }
        if(h.equals(asset.H5)){
            bl=asset.isH5bool();
            cost=asset.H5.costPrice;
        }

        if(p.getName().equals("player1")) {

            if (playerCash < cost) {
                return 0;
            } else if (bl == false) {
                Integer i = new Integer(p.getCashAfter());
                p.setCashBefore(i);
                p.setCashAfter(playerCash - cost);

                return 1;
            } else {
                return 2;
            }
        }else{

            if (playerCash < (2*cost)) {
                return 0;
            } else if (bl == false) {
                Integer i = new Integer(p.getCashAfter());
                p.setCashBefore(i);
                p.setCashAfter(playerCash - cost);

                return 1;
            } else {
                return 2;
            }
        }
    }

    /**
     * <p>executes the actions related to the building of a Hotel<p/>
     * @param asset PrivateAsset value passed
     * @param h Hotel value passed
     * @param p Player value passed
     * @return int.
     */
    @Override
    public int buildHotel(PrivateAsset asset,Hotel h,Player p) {// to be done later
        int cost =0;
        int playerCash=p.getCashAfter();

        boolean bl=false;
        if(h.equals(asset.hotel)){
            bl=asset.isHotelbool();
            cost=asset.hotel.costPrice;
        }

        if(p.getName().equals("player1")) {

            if (playerCash < cost) {
                return 0;
            } else if (bl == false) {
                Integer i = new Integer(p.getCashAfter());
                p.setCashBefore(i);
                p.setCashAfter(playerCash - cost);

                return 1;
            } else {
                return 2;
            }
        }else{

            if (playerCash < (2*cost)) {
                return 0;
            } else if (bl == false) {
                Integer i = new Integer(p.getCashAfter());
                p.setCashBefore(i);
                p.setCashAfter(playerCash - cost);

                return 1;
            } else {
                return 2;
            }
        }
    }

    /**
     * <p>executes the actions related to the crossing of 'Start' cube<p/>
     * @param ps Player[] value passed
     * @return void.
     */
    @Override
    public void addCashStartCube(Player[] ps) {
        for(Player p:ps){

            Integer i=new Integer(p.getCashAfter());
            p.setCashAfter(p.getCashAfter()+250);
            p.setCashBefore(i);

        }

    }

    /**
     * <p>executes the actions related to the rolling of the dice<p/>
     * @param p Player value passed
     * @return List<Integer>.
     */
    @Override
    public List<Integer> rollDice(Player p) {
        Random ranNum = new Random();


        List<Integer> numList = new ArrayList<>();
        int randomNumber = 0;
        int total=0;

        for (int i = 0; i < numDice; i++) {

            randomNumber = ranNum.nextInt(6) + 1;
            total+=randomNumber;
            numList.add(randomNumber);

        }
        numList.add(total);
        return numList;


    }

    /**
     * <p>executes the actions related to the movement of the player<p/>
     * @param p Player value passed
     * @param total Integer value passed
     * @return void.
     */
    @Override
    public void playerMove(Player p, Integer total) {

        //move

        Integer newcurrPos=(p.getCurrPosition()+total);
        if(newcurrPos>20){
            newcurrPos=(newcurrPos%20);
        }

        p.setPrevPosition(p.getCurrPosition());
        p.setCurrPosition(newcurrPos);



    }


}
