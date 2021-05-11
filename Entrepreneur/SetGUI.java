

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;

/**
 * <p>The SetGUI class sets the GUI of the project and
 * guides the processes by calling the required functions designed
 * and declared by other classes</p>
 * @author John Doe
 * @version 1.0
 */
public class SetGUI extends JFrame {

    //declaring and instantiating the required classes fields and variables
    ActionHandle ah;
    Player player1=new Player("player1",1,1,0,0,0);
    Player player2=new Player("player2",1,1,0,0,0);
    public static boolean player1FinishTurn=false;
    public static boolean player2FinishTurn=false;
    public static List<JLabel> keyToBeRemoved=new ArrayList<>();
    public static Color ENTREPENEUR_ORANGE = new Color(255,178,102);
    public static Color ENTREPENEUR_GREEN = new Color(153,255,153);
    public static Color ENTREPENEUR_MAGENTA = new Color(255,153,255);
    public static Color ENTREPENEUR_BLUE = new Color(153,204,255);
    public static Color ENTREPENEUR_RED = new Color(255,102,102);

    JLabel entrepreneurLabel;
    JLabel p1Label;
    JLabel p2Label;
    JLabel p1GOJLabel;
    JLabel p2GOJLabel;
    JLabel die1Label;
    JLabel die2Label;
    JLabel die3Label;

    JTextArea textArea1;
    JTextArea textArea2;

    JLabel startLabel;
    JLabel jail1Label;
    JLabel jail2Label;
    JLabel jail3Label;

    JLabel suffolkLabel;
    JLabel wccLabel;
    JLabel marvelLabel;
    JLabel gojLabel;

    JLabel nyLabel;
    JLabel cincinnatiLabel;
    JLabel hollywoodLabel;
    JLabel orphanageLabel;

    JLabel londonLabel;
    JLabel moscowLabel;
    JLabel disneyLabel;
    JLabel propertyTaxLabel;

    JLabel tokyoLabel;
    JLabel shanghaiLabel;
    JLabel hallmarkLabel;
    JLabel corporateTaxLabel;

    JLabel p1jail1Label;
    JLabel p2jail1Label;
    JLabel p1jail2Label;
    JLabel p2jail2Label;
    JLabel p1jail3Label;
    JLabel p2jail3Label;
    JLabel p1startLabel;
    JLabel p2startLabel;
    JLabel p1hollywoodLabel;
    JLabel p2hollywoodLabel;
    JLabel p1nyLabel;
    JLabel p2nyLabel;
    JLabel p1cincinnatiLabel;
    JLabel p2cincinnatiLabel;
    JLabel p1orphanageLabel;
    JLabel p2orphanageLabel;
    JLabel p1moscowLabel;
    JLabel p2moscowLabel;
    JLabel p1londonLabel;
    JLabel p2londonLabel;
    JLabel p1disneyLabel;
    JLabel p2disneyLabel;
    JLabel p1propertyTaxLabel;
    JLabel p2propertyTaxLabel;
    JLabel p1suffolkLabel;
    JLabel p2suffolkLabel;
    JLabel p1marvelLabel;
    JLabel p2marvelLabel;
    JLabel p1gojLabel;
    JLabel p2gojLabel;
    JLabel p1wccLabel;
    JLabel p2wccLabel;
    JLabel p1corporateTaxLabel;
    JLabel p2corporateTaxLabel;
    JLabel p1tokyoLabel;
    JLabel p2tokyoLabel;
    JLabel p1shanghaiLabel;
    JLabel p2shanghaiLabel;
    JLabel p1hallmarkLabel;
    JLabel p2hallmarkLabel;


    JButton suffolkH1;
    JButton suffolkH2;
    JButton suffolkH3;
    JButton suffolkH4;
    JButton suffolkH5;
    JButton suffolkHotel;
    JButton wccH1;
    JButton wccH2;
    JButton wccH3;
    JButton wccH4;
    JButton wccH5;
    JButton wccHotel;
    JButton nyH1;
    JButton nyH2;
    JButton nyH3;
    JButton nyH4;
    JButton nyH5;
    JButton nyHotel;
    JButton cincinnatiH1;
    JButton cincinnatiH2;
    JButton cincinnatiH3;
    JButton cincinnatiH4;
    JButton cincinnatiH5;
    JButton cincinnatiHotel;
    JButton londonH1;
    JButton londonH2;
    JButton londonH3;
    JButton londonH4;
    JButton londonH5;
    JButton londonHotel;
    JButton moscowH1;
    JButton moscowH2;
    JButton moscowH3;
    JButton moscowH4;
    JButton moscowH5;
    JButton moscowHotel;
    JButton tokyoH1;
    JButton tokyoH2;
    JButton tokyoH3;
    JButton tokyoH4;
    JButton tokyoH5;
    JButton tokyoHotel;
    JButton shanghaiH1;
    JButton shanghaiH2;
    JButton shanghaiH3;
    JButton shanghaiH4;
    JButton shanghaiH5;
    JButton shanghaiHotel;
    JButton marvelMall;
    JButton hollywoodMall;
    JButton disneyMall;
    JButton hallmarkMall;


    PublicAsset start=new PublicAsset("start",0,0,0);
    PublicAsset jail1=new PublicAsset("jail1",0,0,50);
    PublicAsset jail2=new PublicAsset("jail2",0,0,50);
    PublicAsset jail3=new PublicAsset("jail3",0,0,50);

    PrivateAsset suffolk=new PrivateAsset(null,"suffolk",160,80,40);
    PrivateAsset wcc=new PrivateAsset(null,"wcc",200,100,50);
    Mall marvel=new Mall(null,"marvel",1500,1000,500,false);
    PublicAsset goj=new PublicAsset("goj",0,0,40);

    PrivateAsset ny=new PrivateAsset(null,"ny",20,10,1);
    PrivateAsset cincinnati=new PrivateAsset(null,"cincinnati",30,15,2);
    Mall hollywood=new Mall(null,"hollywood",500,450,100,false);
    PublicAsset orphanage=new PublicAsset("orphanage",0,0,20);


    PrivateAsset london=new PrivateAsset(null,"london",120,60,20);
    PrivateAsset moscow=new PrivateAsset(null,"moscow",60,30,10);
    Mall disney=new Mall(null,"disney",1000,900,200,false);
    PublicAsset propertyTax=new PublicAsset("propertyTax",0,0,10);

    PrivateAsset tokyo=new PrivateAsset(null,"tokyo",300,150,70);
    PrivateAsset shanghai=new PrivateAsset(null,"shanghai",500,250,100);
    Mall hallmark=new Mall(null,"hallmark",2000,1800,400,false);
    PublicAsset corporateTax=new PublicAsset("corporateTax",0,0,30);

    /**
     * <p>Constructor that passes title
     * to it's super class and initializes
     * all instance variables
     * <p/>
     */
    SetGUI(String title){
        super(title);
        JPanel mainPanel=new JPanel();
        JPanel northPanel=new JPanel();
        JPanel southPanel=new JPanel();
        JPanel eastPanel=new JPanel();
        JPanel westPanel=new JPanel();
        JPanel centerPanel=new JPanel();
        mainPanel.setLayout(new BorderLayout());
        northPanel.setLayout(new GridLayout(1,6));
        eastPanel.setLayout(new GridLayout(4,1));
        westPanel.setLayout(new GridLayout(4,1));
        southPanel.setLayout(new GridLayout(1,6));

        startLabel=new JLabel();
        startLabel.setName("Start");
        jail1Label=new JLabel();
        jail1Label.setName("Jail1");
        jail2Label=new JLabel();
        jail2Label.setName("Jail2");
        jail3Label=new JLabel();
        jail3Label.setName("Jail3");

        suffolkLabel=new JLabel("Suffolk Valley");
        wccLabel=new JLabel("Washington C.C.");
        marvelLabel=new JLabel("Marvel Mall");
        gojLabel=new JLabel("Get out of Jail");

        nyLabel=new JLabel("New York Plaza");
        cincinnatiLabel=new JLabel("Cincinnati Park");
        hollywoodLabel=new JLabel("Hollywood Mall");
        orphanageLabel=new JLabel();
        orphanageLabel.setName("Orphanage");

        londonLabel=new JLabel("London Heights");
        moscowLabel=new JLabel("Moscow Square");
        disneyLabel=new JLabel("Disney Mall");
        propertyTaxLabel=new JLabel();
        propertyTaxLabel.setName("Property Tax");


        tokyoLabel=new JLabel("Tokyo Park");
        shanghaiLabel=new JLabel("Shanghai Avenue");
        hallmarkLabel=new JLabel("Hallmark Mall");
        corporateTaxLabel=new JLabel();
        corporateTaxLabel.setName("Corporate Tax");

        ah=new ActionHandle(startLabel,jail1Label,jail2Label, jail3Label,suffolkLabel ,wccLabel ,marvelLabel ,gojLabel
                ,nyLabel ,cincinnatiLabel, hollywoodLabel ,orphanageLabel ,londonLabel ,moscowLabel ,disneyLabel
                ,propertyTaxLabel ,tokyoLabel ,shanghaiLabel ,hallmarkLabel ,corporateTaxLabel);

        entrepreneurLabel=new JLabel();
        p1Label=new JLabel();
        p2Label=new JLabel();
        p1GOJLabel=new JLabel();
        p2GOJLabel=new JLabel();
        die1Label=new JLabel();
        die2Label=new JLabel();
        die3Label=new JLabel();



        //Player labels
        p1jail1Label=new JLabel("Player1");
        p2jail1Label=new JLabel("Player2");
        p1jail2Label=new JLabel("Player1");
        p2jail2Label=new JLabel("Player2");
        p1jail3Label=new JLabel("Player1");
        p2jail3Label=new JLabel("Player2");
        p1startLabel=new JLabel("Player1");
        p2startLabel=new JLabel("Player2");
        p1hollywoodLabel=new JLabel("Player1");
        p2hollywoodLabel=new JLabel("Player2");
        p1nyLabel=new JLabel("Player1");
        p2nyLabel=new JLabel("Player2");
        p1cincinnatiLabel=new JLabel("Player1");
        p2cincinnatiLabel=new JLabel("Player2");
        p1orphanageLabel=new JLabel("Player1");
        p2orphanageLabel=new JLabel("Player2");
        p1moscowLabel=new JLabel("Player1");
        p2moscowLabel=new JLabel("Player2");
        p1londonLabel=new JLabel("Player1");
        p2londonLabel=new JLabel("Player2");
        p1disneyLabel=new JLabel("Player1");
        p2disneyLabel=new JLabel("Player2");
        p1propertyTaxLabel=new JLabel("Player1");
        p2propertyTaxLabel=new JLabel("Player2");
        p1suffolkLabel=new JLabel("Player1");
        p2suffolkLabel=new JLabel("Player2");
        p1marvelLabel=new JLabel("Player1");
        p2marvelLabel=new JLabel("Player2");
        p1gojLabel=new JLabel("Player1");
        p2gojLabel=new JLabel("Player2");
        p1wccLabel=new JLabel("Player1");
        p2wccLabel=new JLabel("Player2");
        p1corporateTaxLabel=new JLabel("Player1");
        p2corporateTaxLabel=new JLabel("Player2");
        p1tokyoLabel=new JLabel("Player1");
        p2tokyoLabel=new JLabel("Player2");
        p1shanghaiLabel=new JLabel("Player1");
        p2shanghaiLabel=new JLabel("Player2");
        p1hallmarkLabel=new JLabel("Player1");
        p2hallmarkLabel=new JLabel("Player2");

        p1jail1Label.setVisible(false);
        p2jail1Label.setVisible(false);
        p1jail2Label.setVisible(false);
        p2jail2Label.setVisible(false);
        p1jail3Label.setVisible(false);
        p2jail3Label.setVisible(false);
        p1startLabel.setVisible(false);
        p2startLabel.setVisible(false);
        p1hollywoodLabel.setVisible(false);
        p2hollywoodLabel.setVisible(false);
        p1nyLabel.setVisible(false);
        p2nyLabel.setVisible(false);
        p1cincinnatiLabel.setVisible(false);
        p2cincinnatiLabel.setVisible(false);
        p1orphanageLabel.setVisible(false);
        p2orphanageLabel.setVisible(false);
        p1moscowLabel.setVisible(false);
        p2moscowLabel.setVisible(false);
        p1londonLabel.setVisible(false);
        p2londonLabel.setVisible(false);
        p1disneyLabel.setVisible(false);
        p2disneyLabel.setVisible(false);
        p1propertyTaxLabel.setVisible(false);
        p2propertyTaxLabel.setVisible(false);
        p1suffolkLabel.setVisible(false);
        p2suffolkLabel.setVisible(false);
        p1marvelLabel.setVisible(false);
        p2marvelLabel.setVisible(false);
        p1gojLabel.setVisible(false);
        p2gojLabel.setVisible(false);
        p1wccLabel.setVisible(false);
        p2wccLabel.setVisible(false);
        p1corporateTaxLabel.setVisible(false);
        p2corporateTaxLabel.setVisible(false);
        p1tokyoLabel.setVisible(false);
        p2tokyoLabel.setVisible(false);
        p1shanghaiLabel.setVisible(false);
        p2shanghaiLabel.setVisible(false);
        p1hallmarkLabel.setVisible(false);
        p2hallmarkLabel.setVisible(false);

        //All Buttons begin
        suffolkH1=new JButton("H1");
        suffolkH1.setVisible(false);
        suffolkH2=new JButton("H2");
        suffolkH2.setVisible(false);
        suffolkH3=new JButton("H3");
        suffolkH3.setVisible(false);
        suffolkH4=new JButton("H4");
        suffolkH4.setVisible(false);
        suffolkH5=new JButton("H5");
        suffolkH5.setVisible(false);
        suffolkHotel=new JButton("HOTEL");
        suffolkHotel.setVisible(false);

        wccH1=new JButton("H1");
        wccH1.setVisible(false);
        wccH2=new JButton("H2");
        wccH2.setVisible(false);
        wccH3=new JButton("H3");
        wccH3.setVisible(false);
        wccH4=new JButton("H4");
        wccH4.setVisible(false);
        wccH5=new JButton("H5");
        wccH5.setVisible(false);
        wccHotel=new JButton("HOTEL");
        wccHotel.setVisible(false);

        nyH1=new JButton("H1");
        nyH1.setVisible(false);
        nyH2=new JButton("H2");
        nyH2.setVisible(false);
        nyH3=new JButton("H3");
        nyH3.setVisible(false);
        nyH4=new JButton("H4");
        nyH4.setVisible(false);
        nyH5=new JButton("H5");
        nyH5.setVisible(false);
        nyHotel=new JButton("HOTEL");
        nyHotel.setVisible(false);

        cincinnatiH1=new JButton("H1");
        cincinnatiH1.setVisible(false);
        cincinnatiH2=new JButton("H2");
        cincinnatiH2.setVisible(false);
        cincinnatiH3=new JButton("H3");
        cincinnatiH3.setVisible(false);
        cincinnatiH4=new JButton("H4");
        cincinnatiH4.setVisible(false);
        cincinnatiH5=new JButton("H5");
        cincinnatiH5.setVisible(false);
        cincinnatiHotel=new JButton("HOTEL");
        cincinnatiHotel.setVisible(false);

        londonH1=new JButton("H1");
        londonH1.setVisible(false);
        londonH2=new JButton("H2");
        londonH2.setVisible(false);
        londonH3=new JButton("H3");
        londonH3.setVisible(false);
        londonH4=new JButton("H4");
        londonH4.setVisible(false);
        londonH5=new JButton("H5");
        londonH5.setVisible(false);
        londonHotel=new JButton("HOTEL");
        londonHotel.setVisible(false);

        moscowH1=new JButton("H1");
        moscowH1.setVisible(false);
        moscowH2=new JButton("H2");
        moscowH2.setVisible(false);
        moscowH3=new JButton("H3");
        moscowH3.setVisible(false);
        moscowH4=new JButton("H4");
        moscowH4.setVisible(false);
        moscowH5=new JButton("H5");
        moscowH5.setVisible(false);
        moscowHotel=new JButton("HOTEL");
        moscowHotel.setVisible(false);

        tokyoH1=new JButton("H1");
        tokyoH1.setVisible(false);
        tokyoH2=new JButton("H2");
        tokyoH2.setVisible(false);
        tokyoH3=new JButton("H3");
        tokyoH3.setVisible(false);
        tokyoH4=new JButton("H4");
        tokyoH4.setVisible(false);
        tokyoH5=new JButton("H5");
        tokyoH5.setVisible(false);
        tokyoHotel=new JButton("HOTEL");
        tokyoHotel.setVisible(false);

        shanghaiH1=new JButton("H1");
        shanghaiH1.setVisible(false);
        shanghaiH2=new JButton("H2");
        shanghaiH2.setVisible(false);
        shanghaiH3=new JButton("H3");
        shanghaiH3.setVisible(false);
        shanghaiH4=new JButton("H4");
        shanghaiH4.setVisible(false);
        shanghaiH5=new JButton("H5");
        shanghaiH5.setVisible(false);
        shanghaiHotel=new JButton("HOTEL");
        shanghaiHotel.setVisible(false);


        marvelMall=new JButton("Marvel Mall");
        marvelMall.setVisible(false);
        hollywoodMall=new JButton("Hollywood Mall");
        hollywoodMall.setVisible(false);
        disneyMall=new JButton("Disney Mall");
        disneyMall.setVisible(false);
        hallmarkMall=new JButton("Hallmark Mall");
        hallmarkMall.setVisible(false);

        //#new,stat,quit
        JButton newButton=new JButton("New");
        newButton.setVisible(true);
        JButton rollDiceButton=new JButton("Roll");
        rollDiceButton.setVisible(false);
        JButton buildButton=new JButton("Build");
        buildButton.setVisible(false);
        JButton quitButton=new JButton("Quit");
        quitButton.setVisible(false);

        //All Buttons end



        textArea1=new JTextArea(10,40);
        JScrollPane sp1 = new JScrollPane(textArea1);
        textArea1.setEditable(false);
        textArea1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,true));
        
        textArea2=new JTextArea(10,40);
        JScrollPane sp2 = new JScrollPane(textArea2);
        textArea2.setEditable(false);
        textArea2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,true));


        //Jail icon set up
        ImageIcon jailIcon=new ImageIcon("./Icons/jail.jpeg");
        Image imageJail = jailIcon.getImage().getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon jailIconNew = new ImageIcon(imageJail);

        //Start icon set up
        ImageIcon startIcon=new ImageIcon("./Icons/start.jpeg");
        Image imageStart = startIcon.getImage().getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon startIconNew = new ImageIcon(imageStart);

        //Orphanage icon set up
        ImageIcon orphanageIcon=new ImageIcon("./Icons/orphanage.jpeg");
        Image imageOrphanage = orphanageIcon.getImage().getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon startOrphanageNew = new ImageIcon(imageOrphanage);

        //CorporateTax icon set up
        ImageIcon corporateIcon=new ImageIcon("./Icons/corporatetax.jpeg");
        Image imageCorporate = corporateIcon.getImage().getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon corporateIconNew = new ImageIcon(imageCorporate);

        //PropertyTax icon set up
        ImageIcon propertyIcon=new ImageIcon("./Icons/propertytax.jpeg");
        Image imageProperty = propertyIcon.getImage().getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon propertyIconNew = new ImageIcon(imageProperty);

        //Dice icon set up
        ImageIcon diceIcon=new ImageIcon("./Icons/diceroll.gif");
        Image imageDiceIcon = diceIcon.getImage().getScaledInstance(80, 80,  Image.SCALE_DEFAULT);
        ImageIcon diceIconNew = new ImageIcon(imageDiceIcon);


        startLabel.setIcon(startIconNew);
        jail1Label.setIcon(jailIconNew);
        jail2Label.setIcon(jailIconNew);
        jail3Label.setIcon(jailIconNew);
        orphanageLabel.setIcon(startOrphanageNew);
        corporateTaxLabel.setIcon(corporateIconNew);
        propertyTaxLabel.setIcon(propertyIconNew);
        die1Label.setIcon(diceIconNew);
        /* die2Label.setIcon(diceIconNew);*/


        //North Sub-Panels
        JPanel jail2Panel=new JPanel();
        JPanel suffolkPanel=new JPanel();
        JPanel marvelPanel=new JPanel();
        JPanel gojPanel=new JPanel();
        JPanel wccPanel=new JPanel();
        JPanel jail3Panel=new JPanel();

        //South Sub-Panels
        JPanel startPanel=new JPanel();
        JPanel nyPanel=new JPanel();
        JPanel hollywoodPanel=new JPanel();
        JPanel orphanagePanel=new JPanel();
        JPanel cincinnatiPanel=new JPanel();
        JPanel jail1Panel=new JPanel();

        //West Sub-Panels
        JPanel propertyTaxPanel=new JPanel();
        JPanel disneyPanel=new JPanel();
        JPanel londonPanel=new JPanel();
        JPanel moscowPanel=new JPanel();

        //East Sub-Panels
        JPanel corporateTaxPanel=new JPanel();
        JPanel tokyoPanel=new JPanel();
        JPanel shanghaiPanel=new JPanel();
        JPanel hallmarkPanel=new JPanel();

        //Center Sub-Panels
        JPanel entrepreneurPanel=new JPanel();
        JPanel playerDataPanel=new JPanel();
        JPanel dicePanel=new JPanel();
        JPanel buttonsPanel=new JPanel();
        JPanel textAreaPanel=new JPanel();



        //Beginning of Set up of North sub-panels
        JLayeredPane jail2Pane=new JLayeredPane();
        jail2Panel.setSize(150,150);
        jail2Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        jail2Panel.setBackground(ENTREPENEUR_ORANGE);
        jail2Panel.setToolTipText("Jail- Pay $50 to exit or use a GOJ card.");
        jail2Panel.add(jail2Pane);
        jail2Pane.setPreferredSize(new Dimension(150,150));
        jail2Pane.setToolTipText("Jail- Pay $50 to exit or use a GOJ card.");
        jail2Label.setBounds(0,0,150,150);
        jail2Pane.add(jail2Label,2);
        p1jail2Label.setBounds(1,10,75,50);
        jail2Pane.add(p1jail2Label,0);
        p2jail2Label.setBounds(80,10,75,50);
        jail2Pane.add(p2jail2Label,1);



        suffolkPanel.setSize(150,150);
        suffolkPanel.setLayout(new GridLayout(9,1));
        suffolkPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        suffolkPanel.setBackground(ENTREPENEUR_GREEN);
        suffolkPanel.setToolTipText("Suffolk Valley- Plot[Cost-$160, Rent-$40] House[Cost-$320, Sale-$160, Rent-$80] Hotel[Cost-$800, Sale-$640, Rent-$320].");
        suffolkPanel.add(suffolkLabel);
        suffolkPanel.add(suffolkH1);
        suffolkPanel.add(suffolkH2);
        suffolkPanel.add(suffolkH3);
        suffolkPanel.add(suffolkH4);
        suffolkPanel.add(suffolkH5);
        suffolkPanel.add(suffolkHotel);
        suffolkPanel.add(p1suffolkLabel);
        suffolkPanel.add(p2suffolkLabel);

        marvelPanel.setSize(150,150);
        marvelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        marvelPanel.setBackground(ENTREPENEUR_MAGENTA);
        marvelPanel.setToolTipText("Marvel Mall- Plot[Cost-$1500, Rent-$500] MALL[Cost-$1500, Sale-$1000,  Goods Purchase(rent)-$500]");
        marvelPanel.setLayout(new GridLayout(9,1));
        marvelPanel.add(marvelLabel);
        marvelPanel.add(marvelMall);
        marvelPanel.add(p1marvelLabel);
        marvelPanel.add(p2marvelLabel);

        JLayeredPane gojPane=new JLayeredPane();
        gojPanel.setSize(150,150);
        gojPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        gojPanel.setBackground(new Color(255,255,102));
        gojPane.setPreferredSize(new Dimension(150,150));
        gojPanel.setToolTipText("(Optional)Get Out of Jail Card- Buy GOJ card for $40.");
        gojPanel.add(gojPane);
        gojLabel.setBounds(15,0,100,20);
        gojLabel.setBorder(BorderFactory.createLineBorder(ENTREPENEUR_GREEN, 2,true));
        gojLabel.setBackground(ENTREPENEUR_BLUE);
        gojPane.add(gojLabel,2);
        p1gojLabel.setBounds(1,10,75,50);
        gojPane.add(p1gojLabel,0);
        p2gojLabel.setBounds(80,10,75,50);
        gojPane.add(p2gojLabel,1);


        wccPanel.setSize(150,150);
        wccPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        wccPanel.setLayout(new GridLayout(9,1));
        wccPanel.setBackground(ENTREPENEUR_GREEN);
        wccPanel.setToolTipText("Washington Commercial Center- Plot[Cost-$200, Rent-$50] House[Cost-$400, Sale-$200, Rent-$100] Hotel[Cost-$1000, Sale-$800, Rent-$400].");
        wccPanel.add(wccLabel);
        wccPanel.add(wccH1);
        wccPanel.add(wccH2);
        wccPanel.add(wccH3);
        wccPanel.add(wccH4);
        wccPanel.add(wccH5);
        wccPanel.add(wccHotel);
        wccPanel.add(p1wccLabel);
        wccPanel.add(p2wccLabel);


        JLayeredPane jail3Pane=new JLayeredPane();
        jail3Panel.setSize(150,150);
        jail3Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        jail3Panel.setBackground(ENTREPENEUR_ORANGE);
        jail3Panel.setToolTipText("Jail- Pay $50 to exit or use a GOJ card");
        jail3Panel.add(jail3Pane);
        jail3Pane.setPreferredSize(new Dimension(150,150));
        jail3Label.setBounds(0,0,150,150);
        jail3Pane.add(jail3Label,2);
        p1jail3Label.setBounds(1,10,75,50);
        jail3Pane.add(p1jail3Label,0);
        p2jail3Label.setBounds(80,10,75,50);
        jail3Pane.add(p2jail3Label,1);



        /*northPanel.add(jail2Panel);*/
        northPanel.add(jail2Panel);
        northPanel.add(suffolkPanel);
        northPanel.add(marvelPanel);
        northPanel.add(gojPanel);
        northPanel.add(wccPanel);
        northPanel.add(jail3Panel);


        //Beginning of Set up of South sub-panels

        JLayeredPane startPane=new JLayeredPane();
        startPanel.setSize(150,150);
        startPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        startPanel.setBackground(ENTREPENEUR_RED);
        startPane.setPreferredSize(new Dimension(150,150));
        startPanel.setToolTipText("Start position- You are paid $250 every time you cross start.");
        startPanel.add(startPane);
        startLabel.setBounds(0,0,150,150);
        startPane.add(startLabel,2);
        p1startLabel.setBounds(1,10,75,50);
        startPane.add(p1startLabel,0);
        p2startLabel.setBounds(80,10,75,50);
        startPane.add(p2startLabel,1);

        nyPanel.setSize(150,150);
        nyPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        nyPanel.setLayout(new GridLayout(9,1));
        nyPanel.setBackground(ENTREPENEUR_GREEN);
        nyPanel.setToolTipText("New York Plaza- Plot[Cost-$20, Rent-$1] House[Cost-$40, Sale-$20, Rent-$10] Hotel[Cost-$100, Sale-$80, Rent-$40].");
        nyPanel.add(nyLabel);
        nyPanel.add(nyH1);
        nyPanel.add(nyH2);
        nyPanel.add(nyH3);
        nyPanel.add(nyH4);
        nyPanel.add(nyH5);
        nyPanel.add(nyHotel);
        nyPanel.add(p1nyLabel);
        nyPanel.add(p2nyLabel);

        hollywoodPanel.setSize(150,150);
        hollywoodPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        hollywoodPanel.setBackground(ENTREPENEUR_MAGENTA);
        hollywoodPanel.setToolTipText("Hollywood Mall- Plot[Cost-$500, Rent-$100] MALL[Cost-$500, Sale-$450, Goods Purchase(rent)-$100]");
        hollywoodPanel.setLayout(new GridLayout(9,1));
        hollywoodPanel.add(hollywoodLabel);
        hollywoodPanel.add(hollywoodMall);
        hollywoodPanel.add(p1hollywoodLabel);
        hollywoodPanel.add(p2hollywoodLabel);


        JLayeredPane orphanagePane=new JLayeredPane();
        orphanagePanel.setSize(150,150);
        orphanagePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        orphanagePanel.setBackground(Color.WHITE);
        orphanagePanel.setToolTipText("(Optional)Pay the orphanage- $100.");
        orphanagePanel.add(orphanagePane);
        orphanagePane.setPreferredSize(new Dimension(150,150));
        orphanageLabel.setBounds(0,0,150,150);
        orphanagePane.add(orphanageLabel,2);
        p1orphanageLabel.setBounds(1,10,75,50);
        orphanagePane.add(p1orphanageLabel,0);
        p2orphanageLabel.setBounds(80,10,75,50);
        orphanagePane.add(p2orphanageLabel,1);

        cincinnatiPanel.setSize(150,150);
        cincinnatiPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        cincinnatiPanel.setLayout(new GridLayout(9,1));
        cincinnatiPanel.setBackground(ENTREPENEUR_GREEN);
        cincinnatiPanel.setToolTipText("Cincinnati Park- Plot[Cost-$30, Rent-$2] House[Cost-$60, Sale-$30, Rent-$15] Hotel[Cost-$150, Sale-$120, Rent-$60].");
        cincinnatiPanel.add(cincinnatiLabel);
        cincinnatiPanel.add(cincinnatiH1);
        cincinnatiPanel.add(cincinnatiH2);
        cincinnatiPanel.add(cincinnatiH3);
        cincinnatiPanel.add(cincinnatiH4);
        cincinnatiPanel.add(cincinnatiH5);
        cincinnatiPanel.add(cincinnatiHotel);
        cincinnatiPanel.add(p1cincinnatiLabel);
        cincinnatiPanel.add(p2cincinnatiLabel);


        JLayeredPane jail1Pane=new JLayeredPane();
        jail1Panel.setSize(150,150);
        jail1Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        jail1Panel.setBackground(ENTREPENEUR_ORANGE);
        jail1Panel.setToolTipText("Jail- Pay $50 to exit or use a GOJ card");
        jail1Panel.add(jail1Pane);
        jail1Pane.setPreferredSize(new Dimension(150,150));
        jail1Label.setBounds(0,0,150,150);
        p1jail1Label.setBounds(1,10,75,50);
        jail1Pane.add(p1jail1Label,0);
        p2jail1Label.setBounds(80,10,75,50);
        jail1Pane.add(p2jail1Label,1);
        jail1Label.setBounds(0,0,150,150);
        jail1Pane.add(jail1Label,2);

        //End of Set up of South sub-panels

        //Beginning of Set up of West sub-panels

        JLayeredPane propertyTaxPane=new JLayeredPane();
        propertyTaxPanel.setSize(150,150);
        propertyTaxPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        propertyTaxPanel.setBackground(Color.WHITE);
        propertyTaxPanel.setToolTipText("Pay property tax- 10% of all properties owned.");
        propertyTaxPanel.add(propertyTaxPane);
        propertyTaxPane.setPreferredSize(new Dimension(150,150));
        propertyTaxLabel.setBounds(0,0,150,150);
        propertyTaxPane.add(propertyTaxLabel,2);
        p1propertyTaxLabel.setBounds(1,10,75,50);
        propertyTaxPane.add(p1propertyTaxLabel,0);
        p2propertyTaxLabel.setBounds(80,10,75,50);
        propertyTaxPane.add(p2propertyTaxLabel,1);

        londonPanel.setSize(150,150);
        londonPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        londonPanel.setLayout(new GridLayout(9,1));
        londonPanel.setBackground(ENTREPENEUR_GREEN);
        londonPanel.setToolTipText("London Heights- Plot[Cost-$120, Rent-$20] House[Cost-$240, Sale-$120, Rent-$60] Hotel[Cost-$600, Sale-$480, Rent-$240].");
        londonPanel.add(londonLabel);
        londonPanel.add(londonH1);
        londonPanel.add(londonH2);
        londonPanel.add(londonH3);
        londonPanel.add(londonH4);
        londonPanel.add(londonH5);
        londonPanel.add(londonHotel);
        londonPanel.add(p1londonLabel);
        londonPanel.add(p2londonLabel);

        disneyPanel.setSize(150,150);
        disneyPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        disneyPanel.setBackground(ENTREPENEUR_MAGENTA);
        disneyPanel.setToolTipText("Disney Mall- Plot[Cost-$1000, Rent-$200] MALL[Cost-$1000, Sale-$900, Goods Purchase(rent)-$200]");
        disneyPanel.setLayout(new GridLayout(4,1));
        disneyPanel.add(disneyLabel);
        disneyPanel.add(disneyMall);
        disneyPanel.add(p1disneyLabel);
        disneyPanel.add(p2disneyLabel);

        moscowPanel.setSize(150,150);
        moscowPanel.setLayout(new GridLayout(9,1));
        moscowPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        moscowPanel.setBackground(ENTREPENEUR_GREEN);
        moscowPanel.setToolTipText("Moscow Square- Plot[Cost-$60, Rent-$10] House[Cost-$120, Sale-$60, Rent-$30] Hotel[Cost-$300, Sale-$240, Rent-$120].");
        moscowPanel.add(moscowLabel);
        moscowPanel.add(moscowH1);
        moscowPanel.add(moscowH2);
        moscowPanel.add(moscowH3);
        moscowPanel.add(moscowH4);
        moscowPanel.add(moscowH5);
        moscowPanel.add(moscowHotel);
        moscowPanel.add(p1moscowLabel);
        moscowPanel.add(p2moscowLabel);

        //End of Set up of West sub-panels


        //Beginning of Set up of East sub-panels
        JLayeredPane corporateTaxPane=new JLayeredPane();
        corporateTaxPanel.setSize(150,150);
        corporateTaxPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        corporateTaxPanel.setBackground(Color.WHITE);
        corporateTaxPanel.setToolTipText("Pay corporate tax- 30% of all cash holdings.");
        corporateTaxPanel.add(corporateTaxPane);
        corporateTaxPane.setPreferredSize(new Dimension(150,150));
        corporateTaxLabel.setBounds(0,0,150,150);
        corporateTaxPane.add(corporateTaxLabel,2);
        p1corporateTaxLabel.setBounds(1,10,75,50);
        corporateTaxPane.add(p1corporateTaxLabel,0);
        p2corporateTaxLabel.setBounds(80,10,75,50);
        corporateTaxPane.add(p2corporateTaxLabel,1);


        tokyoPanel.setSize(150,150);
        tokyoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        tokyoPanel.setLayout(new GridLayout(9,1));
        tokyoPanel.setBackground(ENTREPENEUR_GREEN);
        tokyoPanel.setToolTipText("Tokyo Park- Plot[Cost-$300, Rent-$70] House[Cost-$600, Sale-$300, Rent-$120] Hotel[Cost-$1500, Sale-$1200, Rent-$600].");
        tokyoPanel.add(tokyoLabel);
        tokyoPanel.add(tokyoH1);
        tokyoPanel.add(tokyoH2);
        tokyoPanel.add(tokyoH3);
        tokyoPanel.add(tokyoH4);
        tokyoPanel.add(tokyoH5);
        tokyoPanel.add(tokyoHotel);
        tokyoPanel.add(p1tokyoLabel);
        tokyoPanel.add(p2tokyoLabel);

        hallmarkPanel.setSize(150,150);
        hallmarkPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        hallmarkPanel.setBackground(ENTREPENEUR_MAGENTA);
        hallmarkPanel.setToolTipText("Hallmark Mall- Plot[Cost-$2000 , Rent-$400] MALL[Cost-$2000, Sale-$1000, Goods Purchase(rent)-$400]");
        hallmarkPanel.setLayout(new GridLayout(4,1));
        hallmarkPanel.add(hallmarkLabel);
        hallmarkPanel.add(hallmarkMall);
        hallmarkPanel.add(p1hallmarkLabel);
        hallmarkPanel.add(p2hallmarkLabel);

        shanghaiPanel.setSize(150,150);
        shanghaiPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,false));
        shanghaiPanel.setLayout(new GridLayout(9,1));
        shanghaiPanel.setBackground(ENTREPENEUR_GREEN);
        shanghaiPanel.setToolTipText("Shanghai Avenue- Plot[Cost-$500, Rent-$100] House[Cost-$1000, Sale-$500, Rent-$250] Hotel[Cost-$2500, Sale-$2000, Rent-$1000].");
        shanghaiPanel.add(shanghaiLabel);
        shanghaiPanel.add(shanghaiH1);
        shanghaiPanel.add(shanghaiH2);
        shanghaiPanel.add(shanghaiH3);
        shanghaiPanel.add(shanghaiH4);
        shanghaiPanel.add(shanghaiH5);
        shanghaiPanel.add(shanghaiHotel);
        shanghaiPanel.add(p1shanghaiLabel);
        shanghaiPanel.add(p2shanghaiLabel);

        //End of Set up of East sub-panels

        //Beginning of Set up of Center sub-panels

        entrepreneurLabel.setText("ENTREPRENEUR");
        entrepreneurLabel.setFont(new Font("Serif", Font.BOLD, 50));
        entrepreneurLabel.setSize(300,50);
        p1Label.setText("Player1:$0");
        p2Label.setText("Player2:$0");
        p1GOJLabel.setText("GOJ Cards: 0");
        p2GOJLabel.setText("GOJ Cards: 0");
        //  die1Label.setVisible(false);
        die2Label.setText("0");
        die2Label.setForeground(Color.WHITE);
        die2Label.setFont(new Font("Serif", Font.BOLD, 50));
        die3Label.setForeground(Color.WHITE);
        die3Label.setText("0");
        die3Label.setFont(new Font("Serif", Font.BOLD, 50));
        die2Label.setVisible(false);
        die3Label.setVisible(false);




        entrepreneurPanel.add(entrepreneurLabel);
        playerDataPanel.setLayout(new GridLayout(2,3));
        playerDataPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,true));
        playerDataPanel.add(p1Label);
        playerDataPanel.add(p1GOJLabel);
        //playerDataPanel.add(textAreaPanel);
        playerDataPanel.add(p2Label);
        playerDataPanel.add(p2GOJLabel);
        dicePanel.setBackground(ENTREPENEUR_RED);
        dicePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2,true));
        // dicePanel.setLayout(new GridLayout(3,1));
        //dicePanel.setSize(500,500);
        dicePanel.add(die2Label);
        dicePanel.add(die1Label);
        dicePanel.add(die3Label);
        buttonsPanel.setSize(500,50);
        buttonsPanel.add(newButton);
        buttonsPanel.add(rollDiceButton);
        buttonsPanel.add(buildButton);
        buttonsPanel.add(quitButton);
        //textAreaPanel.add(sp1);
        //textAreaPanel.add(sp2);

        //End of Set up of Center sub-panels
        northPanel.add(jail2Panel);
        northPanel.add(suffolkPanel);
        northPanel.add(marvelPanel);
        northPanel.add(gojPanel);
        northPanel.add(wccPanel);
        northPanel.add(jail3Panel);

        southPanel.add(jail1Panel);
        southPanel.add(orphanagePanel);
        southPanel.add(cincinnatiPanel);
        southPanel.add(nyPanel);
        southPanel.add(hollywoodPanel);
        southPanel.add(startPanel);

        westPanel.add(propertyTaxPanel);
        westPanel.add(disneyPanel);
        westPanel.add(londonPanel);
        westPanel.add(moscowPanel);

        eastPanel.add(corporateTaxPanel);
        eastPanel.add(tokyoPanel);
        eastPanel.add(shanghaiPanel);
        eastPanel.add(hallmarkPanel);

        centerPanel.setLayout(new GridLayout(3,1));
        centerPanel.add(entrepreneurPanel);
        centerPanel.add(playerDataPanel);
        centerPanel.add(dicePanel);
        centerPanel.add(buttonsPanel);
        centerPanel.add(sp1);
        centerPanel.add(sp2);

        mainPanel.add(northPanel,BorderLayout.NORTH);
        mainPanel.add(eastPanel,BorderLayout.EAST);
        mainPanel.add(westPanel,BorderLayout.WEST);
        mainPanel.add(southPanel,BorderLayout.SOUTH);
        mainPanel.add(centerPanel,BorderLayout.CENTER);
        this.add(mainPanel);


        /**
         * <p>executes the actions when the newButton is clicked<p/>
         * @param actionEvent ActionEvent value passed
         * @return void.
         */
        //All Buttons listeners begin
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                rollDiceButton.setVisible(true);
                quitButton.setVisible(true);
                buildButton.setVisible(true);
                newButton.setVisible(false);
                //add startup money
                Player[] ps={player1,player2};

                player1.setCashBefore(0);
                player2.setCashBefore(0);
                player1.setCashAfter(0);
                player2.setCashAfter(0);
                player1.getAssets().clear();
                player2.getAssets().clear();
                player1.setCurrPosition(1);
                player1.setPrevPosition(1);
                player2.setCurrPosition(1);
                player2.setPrevPosition(1);

                p1startLabel.setVisible(true);
                p2startLabel.setVisible(true);

                ah.addCashStartCube(ps);
                textArea1.append(player1.getName()+" got cash $250 for crossing start. \n");
                textArea2.append(player2.getName()+" got cash $250 for crossing start. \n");
                p1Label.setText("Player1:$"+player1.getCashAfter());
                p2Label.setText("Player2:$"+player2.getCashAfter());
            }
        });

        /**
         * <p>executes the actions when the rollDiceButton is clicked<p/>
         * @param actionEvent ActionEvent value passed
         * @return void.
         */
        rollDiceButton.addActionListener(new ActionListener() {

            //we are not including the free second dice roll chance portion if a double 6 is obtained
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                java.util.List<Integer> list1= ah.rollDice(player1);
                java.util.List<Integer> list2= ah.rollDice(player2);
                player1FinishTurn=false;
                player2FinishTurn=false;
                while(player1FinishTurn==false) {

                    die1Label.setVisible(false);

                    //too fast wil not be visible
                    die2Label.setVisible(true);
                    die2Label.setText(String.valueOf(list1.get(0)));


                    die3Label.setVisible(true);
                    die3Label.setText(String.valueOf(list1.get(1)));

                    textArea1.append(player1.getName()+" rolled "+String.valueOf(list1.get(0))+" and "+String.valueOf(list1.get(1))+" \n");

                    //Finish Movement and then
                    ah.playerMove(player1,list1.get(2));//player's new position set

                    //make the player appear- get the playerlabel first
                    JLabel playerPositionlabelPrev=getCorrespondingPlayer(ah.assetPosMap.get(player1.getPrevPosition()),player1);
                    playerPositionlabelPrev.setVisible(false);
                    JLabel playerPositionlabelCurr=getCorrespondingPlayer(ah.assetPosMap.get(player1.getCurrPosition()),player1);
                    playerPositionlabelCurr.setVisible(true);

                    //make him/her purchase assets or pay rent/tax/fine
                    JLabel jl=ah.assetPosMap.get(player1.getCurrPosition());
                    boolean player2owns=player2.getAssets().containsKey(jl);
                    boolean player1owns=player1.getAssets().containsKey(jl);
                    Asset currAsset=getCorrespondingAsset(jl);
                    PrivateAsset currPrivAsset=getCorrespondingPrivateAsset(jl);
                    Mall currMallAsset=null;
                    if(currPrivAsset!=null) {
                        currMallAsset = getCorrespondingMall(currPrivAsset);
                    }
                    if(player1owns ){
                        //you build if needed and do not pay anything
                        //Build code done separately based on the user's choice using a 'Build' button


                    }else if(player2owns || (currAsset instanceof PublicAsset)){

                        //pay rent as per properties owned by opposite player

                        if(currMallAsset!=null && (currMallAsset instanceof Mall)) {

                            int r[]=ah.payRentTaxFine(currMallAsset, player1, player2);
                            if(r[0]<0){
                                keyToBeRemoved=new ArrayList<>();
                                sale(player1);
                                for(JLabel l:keyToBeRemoved){

                                    player1.getAssets().remove(l);

                                }
                                if(player1.getCashAfter()<0){
                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                    popLoserAndWinner(player1);
                                }

                            }

                            textArea1.append(player1.getName()+" paid  "+player2.getName()+" $"+Math.abs(r[1])+" as rent for "
                                    +currMallAsset.getAssetName()+". \n");
                            p1Label.setText("Player1:$"+player1.getCashAfter());

                        }else if(currAsset instanceof PrivateAsset ) {

                            int r[]=ah.payRentTaxFine(currPrivAsset, player1, player2);
                            if(r[0]<0){

                                keyToBeRemoved=new ArrayList<>();
                                sale(player1);
                                for(JLabel l:keyToBeRemoved){

                                    player1.getAssets().remove(l);

                                }
                                if(player1.getCashAfter()<0){
                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                    popLoserAndWinner(player1);
                                }


                            }

                            textArea1.append(player1.getName()+" paid $"+Math.abs(r[1])+" to "+player2.getName()+" as  rent for "
                                    +currPrivAsset.getAssetName()+". \n");
                            p1Label.setText("Player1:$"+player1.getCashAfter());



                        }else if(!currAsset.equals(goj) && !currAsset.equals(orphanage)){

                            if(currAsset.equals(jail1) || currAsset.equals(jail2) || currAsset.equals(jail3)){
                                if(player1.getGoj()>0){
                                    int response = JOptionPane.showConfirmDialog(null,
                                            "Do you wish to use the 'Get out of jail' card?",
                                            "Confirm", JOptionPane.YES_NO_CANCEL_OPTION,
                                            JOptionPane.QUESTION_MESSAGE);

                                    switch (response) {
                                        case JOptionPane.YES_OPTION: {


                                            int k = player1.getGoj() - 1;
                                            player1.setGoj(k);
                                            p1GOJLabel.setText("GOJ Cards:" + k);
                                            textArea1.append(player1.getName() + " used a Get out of Jail card to get out of jail. \n");
                                            p1Label.setText("Player1:$" + player1.getCashAfter());
                                            break;
                                        }
                                        case JOptionPane.NO_OPTION: {

                                            int r[] = ah.payRentTaxFine(currAsset, player1);
                                            if (r[0] < 0) {

                                                keyToBeRemoved=new ArrayList<>();
                                                sale(player1);
                                                for(JLabel l:keyToBeRemoved){

                                                    player1.getAssets().remove(l);

                                                }
                                                if(player1.getCashAfter()<0){
                                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                                    popLoserAndWinner(player1);
                                                }

                                            }

                                            textArea1.append(player1.getName() + " paid $" + Math.abs(r[1]) + " the government  for " + currAsset.getAssetName() + ". \n");
                                            p1Label.setText("Player1:$" + player1.getCashAfter());
                                            break;
                                        }
                                        case JOptionPane.CANCEL_OPTION:{

                                            int r[] = ah.payRentTaxFine(currAsset, player1);
                                            if (r[0] < 0) {


                                                keyToBeRemoved=new ArrayList<>();
                                                sale(player1);
                                                for(JLabel l:keyToBeRemoved){

                                                    player1.getAssets().remove(l);

                                                }
                                                if(player1.getCashAfter()<0){
                                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                                    popLoserAndWinner(player1);
                                                }

                                            }

                                            textArea1.append(player1.getName() + " paid $" + Math.abs(r[1]) + " the government  for " + currAsset.getAssetName() + ". \n");
                                            p1Label.setText("Player1:$" + player1.getCashAfter());
                                            break;
                                        }
                                        case JOptionPane.CLOSED_OPTION:{

                                            int r[] = ah.payRentTaxFine(currAsset, player1);
                                            if (r[0] < 0) {


                                                keyToBeRemoved=new ArrayList<>();
                                                sale(player1);
                                                for(JLabel l:keyToBeRemoved){

                                                    player1.getAssets().remove(l);

                                                }
                                                if(player1.getCashAfter()<0){
                                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                                    popLoserAndWinner(player1);
                                                }

                                            }

                                            textArea1.append(player1.getName() + " paid $" + Math.abs(r[1]) + " the government  for " + currAsset.getAssetName() + ". \n");
                                            p1Label.setText("Player1:$" + player1.getCashAfter());
                                            break;
                                        }
                                        default: {

                                            int r[] = ah.payRentTaxFine(currAsset, player1);
                                            if (r[0] < 0) {


                                                keyToBeRemoved=new ArrayList<>();
                                                sale(player1);
                                                for(JLabel l:keyToBeRemoved){

                                                    player1.getAssets().remove(l);

                                                }
                                                if(player1.getCashAfter()<0){
                                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                                    popLoserAndWinner(player1);
                                                }

                                            }

                                            textArea1.append(player1.getName() + " paid $" + Math.abs(r[1]) + " the government  for " + currAsset.getAssetName() + ". \n");
                                            p1Label.setText("Player1:$" + player1.getCashAfter());

                                        }
                                    }

                                }else{
                                    int r[] = ah.payRentTaxFine(currAsset, player1);
                                    if (r[0] < 0) {

                                        keyToBeRemoved=new ArrayList<>();
                                        sale(player1);
                                        for(JLabel l:keyToBeRemoved){

                                            player1.getAssets().remove(l);

                                        }
                                        if(player1.getCashAfter()<0){
                                            p1Label.setText("Player1:$" + player1.getCashAfter());
                                            p2Label.setText("Player2:$" + player2.getCashAfter());
                                            popLoserAndWinner(player1);
                                        }

                                    }

                                    textArea1.append(player1.getName() + " paid $" + Math.abs(r[1]) + " the government  for " + currAsset.getAssetName() + ". \n");
                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                }
                            }else {

                                int r[] = ah.payRentTaxFine(currAsset, player1);
                                if (r[0] < 0) {


                                    keyToBeRemoved=new ArrayList<>();
                                    sale(player1);
                                    for(JLabel l:keyToBeRemoved){

                                        player1.getAssets().remove(l);

                                    }
                                    if(player1.getCashAfter()<0){
                                        p1Label.setText("Player1:$" + player1.getCashAfter());
                                        p2Label.setText("Player2:$" + player2.getCashAfter());
                                        popLoserAndWinner(player1);
                                    }

                                }

                                textArea1.append(player1.getName() + " paid $" + Math.abs(r[1]) + " the government  for " + currAsset.getAssetName() + ". \n");
                                p1Label.setText("Player1:$" + player1.getCashAfter());
                            }

                        }else{
                            if(currAsset.equals(goj)) {

                                //pop up to pay and depending on the condition pay or dont

                                int response = JOptionPane.showConfirmDialog(null,
                                        "Do you wish to buy the 'Get out of jail' card?",
                                        "Confirm", JOptionPane.YES_NO_CANCEL_OPTION,
                                        JOptionPane.QUESTION_MESSAGE);

                                switch (response) {
                                    case JOptionPane.YES_OPTION:

                                        int r[]=ah.payRentTaxFine(currAsset, player1);
                                        if(r[0]<0){


                                            keyToBeRemoved=new ArrayList<>();
                                            sale(player1);
                                            for(JLabel l:keyToBeRemoved){

                                                player1.getAssets().remove(l);

                                            }
                                            if(player1.getCashAfter()<0){
                                                p1Label.setText("Player1:$" + player1.getCashAfter());
                                                p2Label.setText("Player2:$" + player2.getCashAfter());
                                                popLoserAndWinner(player1);
                                            }

                                        }

                                        int k=player1.getGoj()+1;
                                        player1.setGoj(k);
                                        p1GOJLabel.setText("GOJ Cards:"+k);
                                        textArea1.append(player1.getName()+" paid $100 to the government for 'Get out of Jail' card. \n");
                                        p1Label.setText("Player1:$"+player1.getCashAfter());
                                        break;
                                    case JOptionPane.NO_OPTION:
                                        break;
                                    case JOptionPane.CANCEL_OPTION:
                                        break;
                                    case JOptionPane.CLOSED_OPTION:
                                        break;
                                    default:
                                        System.out.println("");
                                }

                            }else{

                                //pop up to pay and depending on the condition pay or dont
                                int response = JOptionPane.showConfirmDialog(null,
                                        "Do you wish to donate to the orphanage?",
                                        "Confirm", JOptionPane.YES_NO_CANCEL_OPTION,
                                        JOptionPane.QUESTION_MESSAGE);

                                switch (response) {
                                    case JOptionPane.YES_OPTION:

                                        int r[]=ah.payRentTaxFine(currAsset, player1);
                                        if(r[0]<0){


                                            keyToBeRemoved=new ArrayList<>();
                                            sale(player1);
                                            for(JLabel l:keyToBeRemoved){

                                                player1.getAssets().remove(l);

                                            }
                                            if(player1.getCashAfter()<0){
                                                p1Label.setText("Player1:$" + player1.getCashAfter());
                                                p2Label.setText("Player2:$" + player2.getCashAfter());
                                                popLoserAndWinner(player1);
                                            }

                                        }

                                        textArea1.append(player1.getName()+" paid $20 to the orphanage. \n");
                                        p1Label.setText("Player1:$"+player1.getCashAfter());
                                        break;
                                    case JOptionPane.NO_OPTION:
                                        break;
                                    case JOptionPane.CANCEL_OPTION:
                                        break;
                                    case JOptionPane.CLOSED_OPTION:
                                        break;
                                    default:
                                        System.out.println("");
                                }

                            }
                        }

                    }else{
                        //you purchase and do not pay anything
                        //get the object
                        //currAsset

                        //dialogbox
                        int response = JOptionPane.showConfirmDialog(null,
                                "Do you wish to purchase "+currAsset.getAssetName()+"?",
                                "Confirm  to purchase", JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE);

                        switch (response) {
                            case JOptionPane.YES_OPTION:

                                int i=ah.purchase(currAsset,player1);
                                if(i==0){
                                    textArea1.append(player1.getName()+" did not have cash to buy "+currAsset.getAssetName()+". \n");
                                }else{
                                    textArea1.append(player1.getName()+" bought "+currAsset.getAssetName()+". \n");
                                    currPrivAsset.setOwner(player1);
                                    player1.getAssets().put(jl, currPrivAsset);
                                    p1Label.setText("Player1:$"+player1.getCashAfter());
                                    String jltxt=jl.getText();
                                    jl.setText(jltxt+"(player1)");

                                }
                                break;
                            case JOptionPane.NO_OPTION:

                                break;
                            case JOptionPane.CANCEL_OPTION:

                                break;
                            case JOptionPane.CLOSED_OPTION:

                                break;
                            default:
                                System.out.println("");
                        }





                    }

                    //check if start crossed and pay startup money
                    if(player1.getCurrPosition()<player1.getPrevPosition()){
                        Player[] p={player1};
                        ah.addCashStartCube(p);
                        p1Label.setText("Player1:$"+player1.getCashAfter());
                        textArea1.append(player1.getName()+" earned $250 for crossing start square. \n");
                    }

                    die1Label.setVisible(true);
                    die2Label.setVisible(false);
                    die3Label.setVisible(false);

                    player1FinishTurn=true;
                }
                while(player2FinishTurn==false) {
                    textArea2.append(player2.getName()+" rolled "+String.valueOf(list2.get(0))+" and "+String.valueOf(list2.get(1))+" \n");
                    //Finish Movement and then
                    ah.playerMove(player2,list2.get(2));//player's new position set

                    //make the player appear- get the playerlabel first
                    JLabel playerPositionlabelPrev=getCorrespondingPlayer(ah.assetPosMap.get(player2.getPrevPosition()),player2);
                    playerPositionlabelPrev.setVisible(false);
                    JLabel playerPositionlabelCurr=getCorrespondingPlayer(ah.assetPosMap.get(player2.getCurrPosition()),player2);
                    playerPositionlabelCurr.setVisible(true);

                    //make him/her purchase assets or pay rent/tax/fine
                    JLabel jl=ah.assetPosMap.get(player2.getCurrPosition());
                    boolean player2owns=player2.getAssets().containsKey(jl);
                    boolean player1owns=player1.getAssets().containsKey(jl);
                    Asset currAsset=getCorrespondingAsset(jl);
                    PrivateAsset currPrivAsset=getCorrespondingPrivateAsset(jl);
                    Mall currMallAsset=null;
                    if(currPrivAsset!=null) {
                        currMallAsset = getCorrespondingMall(currPrivAsset);
                    }

                    if(player2owns ){

                        //custom code set up in the computerBuilds() method
                    }else if(player1owns || (currAsset instanceof PublicAsset)){
                        //pay rent as per properties owned by opposite player

                        if(currMallAsset!=null && (currMallAsset instanceof Mall)) {

                            int r[]=ah.payRentTaxFine(currMallAsset, player2, player1);
                            p1Label.setText("Player1:$" + player1.getCashAfter());
                            p2Label.setText("Player2:$" + player2.getCashAfter());
                            if(r[0]<0){


                                keyToBeRemoved=new ArrayList<>();
                                sale(player2);
                                for(JLabel l:keyToBeRemoved){

                                    player2.getAssets().remove(l);

                                }
                                if(player2.getCashAfter()<0){
                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                    popLoserAndWinner(player2);
                                }

                            }

                            textArea2.append(player2.getName()+" paid  "+player1.getName()+" $"+Math.abs(r[1])+" as rent for "
                                    +currMallAsset.getAssetName()+". \n");
                            p2Label.setText("Player2:$"+player2.getCashAfter());

                        }else if(currAsset instanceof PrivateAsset ) {

                            int r[]=ah.payRentTaxFine(currPrivAsset, player2, player1);
                            p1Label.setText("Player1:$" + player1.getCashAfter());
                            p2Label.setText("Player2:$" + player2.getCashAfter());
                            if(r[0]<0){


                                keyToBeRemoved=new ArrayList<>();
                                sale(player2);
                                for(JLabel l:keyToBeRemoved){

                                    player2.getAssets().remove(l);

                                }
                                if(player2.getCashAfter()<0){
                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                    popLoserAndWinner(player2);
                                }

                            }

                            textArea2.append(player2.getName()+" paid $"+Math.abs(r[1])+" to "+player1.getName()+" as  rent for "
                                    +currPrivAsset.getAssetName()+". \n");
                            p2Label.setText("Player2:$"+player2.getCashAfter());



                        }else if(!currAsset.equals(goj) && !currAsset.equals(orphanage)){

                            if(currAsset.equals(jail1) || currAsset.equals(jail2) || currAsset.equals(jail3)){
                                if(player2.getGoj()>0){


                                    int k=player2.getGoj()-1;
                                    player2.setGoj(k);
                                    p2GOJLabel.setText("GOJ Cards:"+k);
                                    textArea2.append(player2.getName()+" used a Get out of Jail card to get out of jail. \n");
                                    p2Label.setText("Player2:$"+player2.getCashAfter());


                                }else{
                                    int r[] = ah.payRentTaxFine(currAsset, player2);
                                    p1Label.setText("Player1:$" + player1.getCashAfter());
                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                    if (r[0] < 0) {


                                        keyToBeRemoved=new ArrayList<>();
                                        sale(player2);
                                        for(JLabel l:keyToBeRemoved){

                                            player2.getAssets().remove(l);

                                        }
                                        if(player2.getCashAfter()<0){
                                            p1Label.setText("Player1:$" + player1.getCashAfter());
                                            p2Label.setText("Player2:$" + player2.getCashAfter());
                                            popLoserAndWinner(player2);
                                        }

                                    }

                                    textArea2.append(player2.getName() + " paid $" + Math.abs(r[1]) + " the government  for " + currAsset.getAssetName() + ". \n");
                                    p2Label.setText("Player2:$" + player2.getCashAfter());
                                }
                            }else {

                                int r[] = ah.payRentTaxFine(currAsset, player2);
                                p1Label.setText("Player1:$" + player1.getCashAfter());
                                p2Label.setText("Player2:$" + player2.getCashAfter());
                                if (r[0] < 0) {


                                    keyToBeRemoved=new ArrayList<>();
                                    sale(player2);
                                    for(JLabel l:keyToBeRemoved){

                                        player2.getAssets().remove(l);

                                    }
                                    if(player2.getCashAfter()<0){
                                        p1Label.setText("Player1:$" + player1.getCashAfter());
                                        p2Label.setText("Player2:$" + player2.getCashAfter());
                                        popLoserAndWinner(player2);
                                    }

                                }

                                textArea2.append(player2.getName() + " paid $" + Math.abs(r[1]) + " the government  for " + currAsset.getAssetName() + ". \n");
                                p2Label.setText("Player2:$" + player2.getCashAfter());
                            }

                        }else{
                            if(currAsset.equals(goj)) {

                                //pop up to pay and depending on the condition pay or dont


                                int r[]=ah.payRentTaxFine(currAsset, player2);
                                p1Label.setText("Player1:$" + player1.getCashAfter());
                                p2Label.setText("Player2:$" + player2.getCashAfter());
                                if(r[0]<0){


                                    keyToBeRemoved=new ArrayList<>();
                                    sale(player2);
                                    for(JLabel l:keyToBeRemoved){

                                        player2.getAssets().remove(l);

                                    }
                                    if(player2.getCashAfter()<0){
                                        p1Label.setText("Player1:$" + player1.getCashAfter());
                                        p2Label.setText("Player2:$" + player2.getCashAfter());
                                        popLoserAndWinner(player2);
                                    }

                                }

                                int k=player2.getGoj()+1;
                                player2.setGoj(k);
                                p2GOJLabel.setText("GOJ Cards:"+k);
                                textArea2.append(player2.getName()+" paid $100 to the government for Get out of Jail card. \n");
                                p2Label.setText("Player2:$"+player2.getCashAfter());


                            }else{


                                int r[]=ah.payRentTaxFine(currAsset, player2);
                                p1Label.setText("Player1:$" + player1.getCashAfter());
                                p2Label.setText("Player2:$" + player2.getCashAfter());
                                if(r[0]<0){


                                    keyToBeRemoved=new ArrayList<>();
                                    sale(player2);
                                    for(JLabel l:keyToBeRemoved){

                                        player2.getAssets().remove(l);

                                    }
                                    if(player2.getCashAfter()<0){
                                        p1Label.setText("Player1:$" + player1.getCashAfter());
                                        p2Label.setText("Player2:$" + player2.getCashAfter());
                                        popLoserAndWinner(player2);
                                    }

                                }

                                textArea2.append(player2.getName()+" paid $20 to the orphanage. \n");
                                p2Label.setText("Player2:$"+player2.getCashAfter());


                            }
                        }

                    }else{
                        //you purchase and do not pay anything
                        //get the object
                        //currAsset

                        int i=ah.purchase(currAsset,player2);
                        p1Label.setText("Player1:$" + player1.getCashAfter());
                        p2Label.setText("Player2:$" + player2.getCashAfter());
                        if(i==0){
                            textArea2.append(player2.getName()+" did not have cash to buy "+currAsset.getAssetName()+". \n");
                        }else{
                            textArea2.append(player2.getName()+" bought "+currAsset.getAssetName()+". \n");
                            currPrivAsset.setOwner(player2);
                            player2.getAssets().put(jl, currPrivAsset);
                            p2Label.setText("Player2:$"+player2.getCashAfter());
                            String jltxt=jl.getText();
                            jl.setText(jltxt+"(player2)");

                        }


                    }

                    //check if start crossed and pay startup money
                    if(player2.getCurrPosition()<player2.getPrevPosition()){
                        Player[] p={player2};
                        ah.addCashStartCube(p);
                        p2Label.setText("Player2:$"+player2.getCashAfter());
                        textArea2.append(player2.getName()+" earned $250 for crossing start square. \n");
                    }


                    computerBuilds();

                    player2FinishTurn=true;
                }
            }
        });

        /**
         * <p>executes the actions when the quitButton is clicked<p/>
         * @param actionEvent ActionEvent value passed
         * @return void.
         */
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);

            }
        });


        /**
         * <p>executes the actions when the buildButton is clicked<p/>
         * @param actionEvent ActionEvent value passed
         * @return void.
         */
        buildButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //get the list of private assets for the player
                java.util.List<String> lpa= new ArrayList<>();
                for (Map.Entry<JLabel, PrivateAsset> entry : player1.getAssets().entrySet()){
                    lpa.add(entry.getValue().getAssetName());
                }

                Object strOpen[]={};
                if(!lpa.isEmpty()) {
                    Object str[]=lpa.toArray();
                    strOpen= str;

                }else{
                    return;
                }
                //put it in a dialog box choice array

                JFrame frameParent = new JFrame("Choose Asset to build upon");
                String assetParent = (String) JOptionPane.showInputDialog(frameParent,
                        "Which Asset do you wish to build upon?",
                        "Parent Asset choice",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        strOpen,
                        strOpen[0]);

                if(assetParent==null){
                    return;
                }

                //get child assets of parent
                PrivateAsset passet=getCorrespondingPrivateAssetFAname(assetParent);

                if(passet==null){
                    return;
                }
                if(passet instanceof Mall){


                    Mall passetMall=getCorrespondingMall(passet);

                    int i=ah.buildMall(passetMall, player1);

                    if(i==0){
                        textArea1.append(player1.getName()+" did not have cash to build mall at "+passetMall.getAssetName()+". \n");
                    }else if(i==1){
                        textArea1.append(player1.getName()+" built mall at  "+passetMall.getAssetName()+". \n");

                        passetMall.setBuilt(true);
                        //get the mall label and make it visible
                        JButton j=getCorrespondingMallButtons(passetMall);
                        j.setVisible(true);
                        p1Label.setText("Player1:$"+player1.getCashAfter());

                    }else{
                        textArea1.append(passetMall.getAssetName()+" is already built and cannot be built again . \n");
                    }

                }else{
                    //It is confirmed as an instance of a PrivateAsset

                    //get arent asset's chidren
                    House h1=passet.getH1();
                    House h2=passet.getH2();
                    House h3=passet.getH3();
                    House h4=passet.getH4();
                    House h5=passet.getH5();
                    Hotel hotel=passet.getHotel();
                    String[] obj={h1.getHouseId(),h2.getHouseId(),h3.getHouseId(),h4.getHouseId(),h5.getHouseId(),hotel.getHotelId()};
                    //get a pop up to choose house or hotel
                    JFrame frameChild = new JFrame("Choose House/Hotel to build ");
                    String assetChild = (String) JOptionPane.showInputDialog(frameChild,
                            "Which house/hotel do you wish to build ?",
                            "House/Hotel choice",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            obj,
                            obj[0]);

                    int i=0;
                    if(assetChild==null){
                        return;
                    }
                    if(assetChild.contains("Hotel")) {
                        i = ah.buildHotel(passet, hotel, player1);
                    }else if(assetChild.contains("H1")){
                        i = ah.buildHouse(passet, h1, player1);
                    }else if(assetChild.contains("H2")){
                        i = ah.buildHouse(passet, h2, player1);
                    }else if(assetChild.contains("H3")){
                        i = ah.buildHouse(passet, h3, player1);
                    }else if(assetChild.contains("H4")){
                        i = ah.buildHouse(passet, h4, player1);
                    }else if(assetChild.contains("H5")){
                        i = ah.buildHouse(passet, h5, player1);
                    }

                    if(i==0){
                        textArea1.append(player1.getName()+" did not have cash to build house/hotel at "+passet.getAssetName()+". \n");
                    }else if(i==1){
                        textArea1.append(player1.getName()+" built house/hotel at  "+passet.getAssetName()+". \n");


                        if(assetChild.contains("Hotel")) {
                            passet.setHotelbool(true);
                        }else if(assetChild.contains("H1")){
                            passet.setH1bool(true);
                        }else if(assetChild.contains("H2")){
                            passet.setH2bool(true);
                        }else if(assetChild.contains("H3")){
                            passet.setH3bool(true);
                        }else if(assetChild.contains("H4")){
                            passet.setH4bool(true);
                        }else if(assetChild.contains("H5")){
                            passet.setH5bool(true);
                        }

                        //get the house/hotel button and make it visible
                        JButton j=getCorrespondingHouseHotelButtons(assetChild,passet);
                        j.setVisible(true);
                        p1Label.setText("Player1:$"+player1.getCashAfter());
                    }else{
                        textArea1.append(assetChild+" is already built and cannot be built again . \n");
                    }

                }







            }
        });

        //All Buttons listeners end

    }

    /**
     * <p>declares the winner in a dialog box<p/>
     * @param p Player value passed
     * @return void.
     */
    private void popLoserAndWinner(Player p) {
        p1Label.setText("Player1:$" + player1.getCashAfter());
        p2Label.setText("Player2:$" + player2.getCashAfter());
        if(p.equals(player1)) {
            JOptionPane.showMessageDialog(null, player2.getName()+" is the winner!", "Winner!",
                    JOptionPane.INFORMATION_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null, player1.getName()+" is the winner!", "Winner!",
                    JOptionPane.INFORMATION_MESSAGE);

        }
        System.exit(0);
    }

    /**
     * <p>sells the player's assets when called to implement<p/>
     * @param p Player value passed
     * @return void.
     */
    private void sale(Player p) {
      
        for (Map.Entry<JLabel, PrivateAsset> set : p.getAssets().entrySet()) {

            Mall m=getCorrespondingMall(set.getValue());
            if(m!=null && m instanceof Mall){
                JButton jbm=getCorrespondingMallButtons(m);
                int a = ah.sell(m, p);

                m.setBuilt(false);
                jbm.setVisible(false);
                if(p.equals(player1)){
                	textArea1.append("System sold "+p.getName()+"'s mall at "+m.getAssetName()+" to keep the player's cash positive. \n");
                    p1Label.setText("Player1:$"+p.getCashAfter());
                }else{
                	textArea2.append("System sold "+p.getName()+"'s mall at "+m.getAssetName()+" to keep the player's cash positive. \n");
                    p2Label.setText("Player2:$"+p.getCashAfter());
                }
                if (p.getCashAfter() > 0) {
                    if(p.equals(player1)){
                        p1Label.setText("Player1:$"+p.getCashAfter());
                    }else{
                        p2Label.setText("Player2:$"+p.getCashAfter());
                    }
                    return;
                }else{


                    int ab = ah.sell(set.getValue(), p);
                    

                    JLabel j=getCorrespondingLabel(p.getAssets().get(set.getKey()));
                    keyToBeRemoved.add(set.getKey());

                    String sub=j.getText().replace("(player1)","");
                    sub=sub.replace("(player2)","");
                    j.setText(sub);

                    if(p.equals(player1)){
                        p1Label.setText("Player1:$"+p.getCashAfter());
                        textArea1.append("System sold "+p.getName()+"'s asset  "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");
                    }else{
                        p2Label.setText("Player2:$"+p.getCashAfter());
                        textArea2.append("System sold "+p.getName()+"'s asset  "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");
                    }
                    if (p.getCashAfter() > 0) {
                        if(p.equals(player1)){
                            p1Label.setText("Player1:$"+p.getCashAfter());
                        }else{
                            p2Label.setText("Player2:$"+p.getCashAfter());
                        }
                        return;
                    }

                }
            }else {


                if (set.getValue().isHotelbool()) {
                    int a = ah.sell(set.getValue().hotel, p);
                    
                    p.getAssets().get(set.getKey()).setHotelbool(false);
                    JButton jb=getCorrespondingHouseHotelButtons(set.getValue().hotel.getHotelId(),set.getValue());
                    jb.setVisible(false);
                    if(p.equals(player1)){
                    	textArea1.append("System sold "+p.getName()+"'s asset  "+set.getValue().hotel.getHotelId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");
                        p1Label.setText("Player1:$"+p.getCashAfter());
                    }else{
                    	textArea2.append("System sold "+p.getName()+"'s asset  "+set.getValue().hotel.getHotelId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");
                        p2Label.setText("Player2:$"+p.getCashAfter());
                    }
                    if (p.getCashAfter() > 0) {
                        if(p.equals(player1)){
                            p1Label.setText("Player1:$"+p.getCashAfter());
                        }else{
                            p2Label.setText("Player2:$"+p.getCashAfter());
                        }
                        return;
                    }
                }

                if (set.getValue().isH1bool()) {
                    int a = ah.sell(set.getValue().H1, p);
                    
                    p.getAssets().get(set.getKey()).setH1bool(false);
                    JButton jb=getCorrespondingHouseHotelButtons(set.getValue().H1.getHouseId(),set.getValue());
                    jb.setVisible(false);
                    if(p.equals(player1)){
                    	textArea1.append("System sold "+p.getName()+"'s asset  "+set.getValue().H1.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                        p1Label.setText("Player1:$"+p.getCashAfter());
                    }else{
                    	textArea2.append("System sold "+p.getName()+"'s asset  "+set.getValue().H1.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");
                        p2Label.setText("Player2:$"+p.getCashAfter());
                    }
                    if (p.getCashAfter() > 0) {
                        if(p.equals(player1)){
                            p1Label.setText("Player1:$"+p.getCashAfter());
                        }else{
                            p2Label.setText("Player2:$"+p.getCashAfter());
                        }
                        return;
                    }
                }

                if (set.getValue().isH2bool()) {
                    int a = ah.sell(set.getValue().H2, p);
                    
                    p.getAssets().get(set.getKey()).setH2bool(false);
                    JButton jb=getCorrespondingHouseHotelButtons(set.getValue().H2.getHouseId(),set.getValue());
                    jb.setVisible(false);
                    if(p.equals(player1)){
                        p1Label.setText("Player1:$"+p.getCashAfter());
                        textArea1.append("System sold "+p.getName()+"'s asset  "+set.getValue().H2.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                    }else{
                        p2Label.setText("Player2:$"+p.getCashAfter());
                        textArea2.append("System sold "+p.getName()+"'s asset  "+set.getValue().H2.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                    }
                    if (p.getCashAfter() > 0) {
                        if(p.equals(player1)){
                            p1Label.setText("Player1:$"+p.getCashAfter());
                        }else{
                            p2Label.setText("Player2:$"+p.getCashAfter());
                        }
                        return;
                    }
                }


                if (set.getValue().isH3bool()) {
                    int a = ah.sell(set.getValue().H3, p);
                    
                    p.getAssets().get(set.getKey()).setH3bool(false);
                    JButton jb=getCorrespondingHouseHotelButtons(set.getValue().H3.getHouseId(),set.getValue());
                    jb.setVisible(false);
                    if(p.equals(player1)){
                    	textArea1.append("System sold "+p.getName()+"'s asset  "+set.getValue().H3.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                        p1Label.setText("Player1:$"+p.getCashAfter());
                    }else{
                    	textArea2.append("System sold "+p.getName()+"'s asset  "+set.getValue().H3.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                        p2Label.setText("Player2:$"+p.getCashAfter());
                    }
                    if (p.getCashAfter() > 0) {
                        if(p.equals(player1)){
                            p1Label.setText("Player1:$"+p.getCashAfter());
                        }else{
                            p2Label.setText("Player2:$"+p.getCashAfter());
                        }
                        return;
                    }
                }

                if (set.getValue().isH4bool()) {
                    int a = ah.sell(set.getValue().H4, p);
                    
                    p.getAssets().get(set.getKey()).setH4bool(false);
                    JButton jb=getCorrespondingHouseHotelButtons(set.getValue().H4.getHouseId(),set.getValue());
                    jb.setVisible(false);
                    if(p.equals(player1)){
                    	textArea1.append("System sold "+p.getName()+"'s asset  "+set.getValue().H4.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                        p1Label.setText("Player1:$"+p.getCashAfter());
                    }else{
                    	textArea2.append("System sold "+p.getName()+"'s asset  "+set.getValue().H4.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                        p2Label.setText("Player2:$"+p.getCashAfter());
                    }
                    if (p.getCashAfter() > 0) {
                        if(p.equals(player1)){
                            p1Label.setText("Player1:$"+p.getCashAfter());
                        }else{
                            p2Label.setText("Player2:$"+p.getCashAfter());
                        }
                        return;
                    }
                }

                if (set.getValue().isH5bool()) {
                    int a = ah.sell(set.getValue().H5, p);
                    
                    p.getAssets().get(set.getKey()).setH5bool(false);
                    JButton jb=getCorrespondingHouseHotelButtons(set.getValue().H5.getHouseId(),set.getValue());
                    jb.setVisible(false);
                    if(p.equals(player1)){
                    	textArea1.append("System sold "+p.getName()+"'s asset  "+set.getValue().H5.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                        p1Label.setText("Player1:$"+p.getCashAfter());
                    }else{
                    	textArea2.append("System sold "+p.getName()+"'s asset  "+set.getValue().H5.getHouseId()+" at "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                        p2Label.setText("Player2:$"+p.getCashAfter());
                    }
                    if (p.getCashAfter() > 0) {
                        if(p.equals(player1)){
                            p1Label.setText("Player1:$"+p.getCashAfter());
                        }else{
                            p2Label.setText("Player2:$"+p.getCashAfter());
                        }
                        return;
                    }
                }



                int a = ah.sell(set.getValue(), p);
                
                JLabel j=getCorrespondingLabel(p.getAssets().get(set.getKey()));
                keyToBeRemoved.add(set.getKey());


                String sub=j.getText().replace("(player1)","");
                sub=sub.replace("(player2)","");
                j.setText(sub);

                if(p.equals(player1)){
                	textArea1.append("System sold "+p.getName()+"'s asset  "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                    p1Label.setText("Player1:$"+p.getCashAfter());
                }else{
                	textArea2.append("System sold "+p.getName()+"'s asset  "+set.getValue().getAssetName()+" to keep the player's cash positive. \n");

                    p2Label.setText("Player2:$"+p.getCashAfter());
                }
                if (p.getCashAfter() > 0) {
                    if(p.equals(player1)){
                        p1Label.setText("Player1:$"+p.getCashAfter());
                    }else{
                        p2Label.setText("Player2:$"+p.getCashAfter());
                    }
                    return;
                }

            }

        }


    }

    /**
     * <p>Player2(computer) builds the assets(Houses, Hotels and Malls) when called
     * ti implement<p/>
     * @return void.
     */
    public void computerBuilds(){

        //get the list of private assets for the player
        List<String> lpa= new ArrayList<>();
        for (Map.Entry<JLabel, PrivateAsset> entry : player2.getAssets().entrySet()){
            lpa.add(entry.getValue().getAssetName());
        }

        Object strOpen[]={};
        if(!lpa.isEmpty()) {
            Object str[]=lpa.toArray();
            strOpen= str;

        }else{
            return;
        }
        //put it in a dialog box choice array
        for(Object s :strOpen) {



            String assetParent= (String) s;

            //get child assets of parent
            PrivateAsset passet = getCorrespondingPrivateAssetFAname(assetParent);
            if (passet instanceof Mall) {


                Mall passetMall = getCorrespondingMall(passet);

                int i = ah.buildMall(passetMall, player2);

                if (i == 0) {
                    //uncomment the following line for more detailed activity log in textarea
                    /* textArea.append(player2.getName() + " did not have cash to build mall at " + passetMall.getAssetName() + ". \n");*/
                } else if (i == 1) {
                    textArea2.append(player2.getName() + " built mall at  " + passetMall.getAssetName() + ". \n");

                    passetMall.setBuilt(true);
                    //get the mall label and make it visible
                    JButton j = getCorrespondingMallButtons(passetMall);
                    j.setVisible(true);
                    p2Label.setText("Player2:$" + player2.getCashAfter());

                } else {
                    //uncomment the following line for more detailed activity log in textarea
                    /* textArea.append(passetMall.getAssetName() + " is already built and cannot be built again . \n");*/
                }

            } else {
              //It is confirmed as an instance of a PrivateAsset

                //get arent asset's chidren
                House h1 = passet.getH1();
                House h2 = passet.getH2();
                House h3 = passet.getH3();
                House h4 = passet.getH4();
                House h5 = passet.getH5();
                Hotel hotel = passet.getHotel();
                String[] obj = {h1.getHouseId(), h2.getHouseId(), h3.getHouseId(), h4.getHouseId(), h5.getHouseId(), hotel.getHotelId()};


                for(Object sr:obj) {

                    String assetChild = (String) sr;

                    int i = 0;
                    if (assetChild.contains("Hotel")) {
                        i = ah.buildHotel(passet, hotel, player2);
                    } else if (assetChild.contains("H1")) {
                        i = ah.buildHouse(passet, h1, player2);
                    } else if (assetChild.contains("H2")) {
                        i = ah.buildHouse(passet, h2, player2);
                    } else if (assetChild.contains("H3")) {
                        i = ah.buildHouse(passet, h3, player2);
                    } else if (assetChild.contains("H4")) {
                        i = ah.buildHouse(passet, h4, player2);
                    } else if (assetChild.contains("H5")) {
                        i = ah.buildHouse(passet, h5, player2);
                    }

                    if (i == 0) {
                        //uncomment the following line for more detailed activity log in textarea
                        /* textArea.append(player2.getName() + " did not have cash to build house/hotel at " + passet.getAssetName() + ". \n");*/
                    } else if (i == 1) {
                        textArea2.append(player2.getName() + " built house/hotel at  " + passet.getAssetName() + ". \n");


                        if (assetChild.contains("Hotel")) {
                            passet.setHotelbool(true);
                        } else if (assetChild.contains("H1")) {
                            passet.setH1bool(true);
                        } else if (assetChild.contains("H2")) {
                            passet.setH2bool(true);
                        } else if (assetChild.contains("H3")) {
                            passet.setH3bool(true);
                        } else if (assetChild.contains("H4")) {
                            passet.setH4bool(true);
                        } else if (assetChild.contains("H5")) {
                            passet.setH5bool(true);
                        }

                        //get the house/hotel button and make it visible
                        JButton j = getCorrespondingHouseHotelButtons(assetChild, passet);
                        j.setVisible(true);
                        p2Label.setText("Player2:$" + player2.getCashAfter());
                    } else {
                        //uncomment the following line for more detailed activity log in textarea
                        /* textArea.append(assetChild + " is already built and cannot be built again . \n");*/
                    }
                }

            }
        }

    }


    /**
     * <p>Returns the corresponding player's label with respect to the asset<p/>
     * @param jLabel JLabel value passed
     * @param player Player value passed
     * @return JLabel.
     */
    private JLabel getCorrespondingPlayer(JLabel jLabel,Player player) {


        if (jLabel.equals(startLabel) ) {
            if(player.equals(player1)){
                return p1startLabel;
            }else{
                return p2startLabel;
            }

        } else if (jLabel.equals(hollywoodLabel)){
            if(player.equals(player1)){
                return p1hollywoodLabel;
            }else{
                return p2hollywoodLabel;
            }
        }else if(jLabel.equals(nyLabel)){
            if(player.equals(player1)){
                return p1nyLabel;
            }else{
                return p2nyLabel;
            }
        }else if(jLabel.equals(cincinnatiLabel)){
            if(player.equals(player1)){
                return p1cincinnatiLabel;
            }else{
                return p2cincinnatiLabel;
            }
        }else if(jLabel.equals(orphanageLabel)){
            if(player.equals(player1)){
                return p1orphanageLabel;
            }else{
                return p2orphanageLabel;
            }
        }else if(jLabel.equals(jail1Label)){
            if(player.equals(player1)){
                return p1jail1Label;
            }else{
                return p2jail1Label;
            }
        }else if(jLabel.equals(moscowLabel)){
            if(player.equals(player1)){
                return p1moscowLabel;
            }else{
                return p2moscowLabel;
            }
        }else if(jLabel.equals(londonLabel)){
            if(player.equals(player1)){
                return p1londonLabel;
            }else{
                return p2londonLabel;
            }
        }else if(jLabel.equals(disneyLabel)){
            if(player.equals(player1)){
                return p1disneyLabel;
            }else{
                return p2disneyLabel;
            }
        }else if(jLabel.equals(propertyTaxLabel)){
            if(player.equals(player1)){
                return p1propertyTaxLabel;
            }else{
                return p2propertyTaxLabel;
            }
        }else if(jLabel.equals(jail2Label)){
            if(player.equals(player1)){
                return p1jail2Label;
            }else{
                return p2jail2Label;
            }
        }else if(jLabel.equals(suffolkLabel)){
            if(player.equals(player1)){
                return p1suffolkLabel;
            }else{
                return p2suffolkLabel;
            }
        }else if(jLabel.equals(marvelLabel)){
            if(player.equals(player1)){
                return p1marvelLabel;
            }else{
                return p2marvelLabel;
            }
        }else if(jLabel.equals(gojLabel)){
            if(player.equals(player1)){
                return p1gojLabel;
            }else{
                return p2gojLabel;
            }
        }else if(jLabel.equals(wccLabel)){
            if(player.equals(player1)){
                return p1wccLabel;
            }else{
                return p2wccLabel;
            }
        }else if(jLabel.equals(jail3Label)){
            if(player.equals(player1)){
                return p1jail3Label;
            }else{
                return p2jail3Label;
            }
        }else if(jLabel.equals(corporateTaxLabel)){
            if(player.equals(player1)){
                return p1corporateTaxLabel;
            }else{
                return p2corporateTaxLabel;
            }
        }else if(jLabel.equals(tokyoLabel)){
            if(player.equals(player1)){
                return p1tokyoLabel;
            }else{
                return p2tokyoLabel;
            }
        }else if(jLabel.equals(shanghaiLabel)){
            if(player.equals(player1)){
                return p1shanghaiLabel;
            }else{
                return p2shanghaiLabel;
            }
        }else if(jLabel.equals(hallmarkLabel)){
            if(player.equals(player1)){
                return p1hallmarkLabel;
            }else{
                return p2hallmarkLabel;
            }
        }else{

        }
        return null;

    }

    /**
     * <p>Returns the corresponding Asset with respect to the JLabel<p/>
     * @param jLabel JLabel value passed
     * @return Asset.
     */
    private Asset getCorrespondingAsset(JLabel jLabel) {

        try {
            if (jLabel.getName().equalsIgnoreCase("Start")) {

                return start;
            }
        }catch (Exception e){

        }

        if (jLabel.getText().contains("Hollywood")){

            return hollywood;

        }else if(jLabel.getText().contains("New")){

            return ny;

        }else if(jLabel.getText().contains("Cincinnati")){

            return cincinnati;

        }

        try {
            if (jLabel.getName().equalsIgnoreCase("Orphanage")) {

                return orphanage;

            }
        }catch(Exception e){

        }

        try {
            if(jLabel.getName().equalsIgnoreCase("Jail1")){

                return jail1;

            }
        }catch(Exception e){

        }

        if(jLabel.getText().contains("Moscow")){

            return moscow;

        }else if(jLabel.getText().contains("London")){

            return london;

        }else if(jLabel.getText().contains("Disney")){

            return disney;

        }

        try {
            if (jLabel.getName().equalsIgnoreCase("Property Tax")) {

                return propertyTax;

            }
        }catch(Exception e){

        }

        try {
            if(jLabel.getName().equalsIgnoreCase("Jail2")){

                return jail2;

            }
        }catch(Exception e){

        }

        if(jLabel.getText().contains("Suffolk")){

            return suffolk;

        }else if(jLabel.getText().contains("Marvel")){

            return marvel;

        }else if(jLabel.getText().contains("Get")){

            return goj;

        }else if(jLabel.getText().contains("Washington")){

            return wcc;

        }

        try {
            if(jLabel.getName().equalsIgnoreCase("Jail3")){

                return jail3;

            }
        }catch(Exception e){

        }

        try {
            if(jLabel.getName().equalsIgnoreCase("Corporate Tax")){

                return corporateTax;

            }
        }catch(Exception e){

        }

        if(jLabel.getText().contains("Tokyo")){

            return tokyo;

        }else if(jLabel.getText().contains("Shanghai")){

            return shanghai;

        }else if(jLabel.getText().contains("Hallmark")){

            return hallmark;

        }else{

        }
        return null;

    }

    /**
     * <p>Returns the corresponding PrivateAsset object with respect to the JLabel object<p/>
     * @param jLabel JLabel value passed
     * @return PrivateAsset.
     */
    private PrivateAsset getCorrespondingPrivateAsset(JLabel jLabel) {



        if (jLabel.getText().contains("Hollywood")){

            return hollywood;

        }else if(jLabel.getText().contains("New")){

            return ny;

        }else if(jLabel.getText().contains("Cincinnati")){

            return cincinnati;

        }


        if(jLabel.getText().contains("Moscow")){

            return moscow;

        }else if(jLabel.getText().contains("London")){

            return london;

        }else if(jLabel.getText().contains("Disney")){

            return disney;

        }


        if(jLabel.getText().contains("Suffolk")){

            return suffolk;

        }else if(jLabel.getText().contains("Marvel")){

            return marvel;

        }else if(jLabel.getText().contains("Washington")){

            return wcc;

        }


        if(jLabel.getText().contains("Tokyo")){

            return tokyo;

        }else if(jLabel.getText().contains("Shanghai")){

            return shanghai;

        }else if(jLabel.getText().contains("Hallmark")){

            return hallmark;

        }else{

        }
        return null;

    }


    /**
     * <p>Returns the corresponding PrivateAsset object with respect to the String object<p/>
     * @param str String value passed
     * @return PrivateAsset.
     */
    private PrivateAsset getCorrespondingPrivateAssetFAname(String str) {



        if (str.contains("hollywood")){

            return hollywood;

        }else if(str.contains("ny")){

            return ny;

        }else if(str.contains("cincinnati")){

            return cincinnati;

        }


        if(str.contains("moscow")){

            return moscow;

        }else if(str.contains("london")){

            return london;

        }else if(str.contains("disney")){

            return disney;

        }


        if(str.contains("suffolk")){

            return suffolk;

        }else if(str.contains("marvel")){

            return marvel;

        }else if(str.contains("wcc")){

            return wcc;

        }


        if(str.contains("tokyo")){

            return tokyo;

        }else if(str.contains("shanghai")){

            return shanghai;

        }else if(str.contains("hallmark")){

            return hallmark;

        }else{

        }
        return null;

    }

    /**
     * <p>Returns the corresponding PrivateAsset object with respect to the String object<p/>
     * @param str PrivateAsset value passed
     * @return Mall.
     */
    private Mall getCorrespondingMall(PrivateAsset str) {



        if (str.equals(hollywood)){

            return hollywood;

        }


        if(str.equals(disney)){

            return disney;

        }


        if(str.equals(marvel)){

            return marvel;

        }


        if(str.equals(hallmark)){

            return hallmark;

        }
        return null;

    }

    /**
     * <p>Returns the corresponding JButton object with respect to the Mall object<p/>
     * @param mall Mall value passed
     * @return JButton.
     */
    private JButton getCorrespondingMallButtons(Mall mall) {



        if (mall.equals(hollywood)){

            return hollywoodMall;

        }


        if(mall.equals(disney)){

            return disneyMall;

        }


        if(mall.equals(marvel)){

            return marvelMall;

        }


        if(mall.equals(hallmark)){

            return hallmarkMall;

        }
        return null;

    }

    /**
     * <p>Returns the corresponding JButton object with respect to the child asset and PrivateAsset(parent) object<p/>
     * @param assetChild String value passed
     * @param passet PrivateAsset value passed
     * @return JButton.
     */
    private JButton getCorrespondingHouseHotelButtons(String assetChild, PrivateAsset passet) {



        if (assetChild.contains("H1") && passet.getAssetName().equalsIgnoreCase("ny")){

            return nyH1;

        }
        if (assetChild.contains("H2") && passet.getAssetName().equalsIgnoreCase("ny")){

            return nyH2;

        }
        if (assetChild.contains("H3") && passet.getAssetName().equalsIgnoreCase("ny")){

            return nyH3;

        }
        if (assetChild.contains("H4") && passet.getAssetName().equalsIgnoreCase("ny")){

            return nyH4;

        }
        if (assetChild.contains("H5") && passet.getAssetName().equalsIgnoreCase("ny")){

            return nyH5;

        }
        if (assetChild.contains("Hotel") && passet.getAssetName().equalsIgnoreCase("ny")){

            return nyHotel;

        }

        if (assetChild.contains("H1") && passet.getAssetName().equalsIgnoreCase("suffolk")){

            return suffolkH1;

        }
        if (assetChild.contains("H2") && passet.getAssetName().equalsIgnoreCase("suffolk")){

            return suffolkH2;

        }
        if (assetChild.contains("H3") && passet.getAssetName().equalsIgnoreCase("suffolk")){

            return suffolkH3;

        }
        if (assetChild.contains("H4") && passet.getAssetName().equalsIgnoreCase("suffolk")){

            return suffolkH4;

        } if (assetChild.contains("H5") && passet.getAssetName().equalsIgnoreCase("suffolk")){

            return suffolkH5;

        }
        if (assetChild.contains("Hotel") && passet.getAssetName().equalsIgnoreCase("suffolk")){

            return suffolkHotel;

        }

        if (assetChild.contains("H1") && passet.getAssetName().equalsIgnoreCase("wcc")){

            return wccH1;

        }
        if (assetChild.contains("H2") && passet.getAssetName().equalsIgnoreCase("wcc")){

            return wccH2;

        }
        if (assetChild.contains("H3") && passet.getAssetName().equalsIgnoreCase("wcc")){

            return wccH3;

        }
        if (assetChild.contains("H4") && passet.getAssetName().equalsIgnoreCase("wcc")){

            return wccH4;

        }
        if (assetChild.contains("H5") && passet.getAssetName().equalsIgnoreCase("wcc")){

            return wccH5;

        }
        if (assetChild.contains("Hotel") && passet.getAssetName().equalsIgnoreCase("wcc")){

            return wccHotel;

        }

        if (assetChild.contains("H1") && passet.getAssetName().equalsIgnoreCase("cincinnati")){

            return cincinnatiH1;

        }
        if (assetChild.contains("H2") && passet.getAssetName().equalsIgnoreCase("cincinnati")){

            return cincinnatiH2;

        }
        if (assetChild.contains("H3") && passet.getAssetName().equalsIgnoreCase("cincinnati")){

            return cincinnatiH3;

        }
        if (assetChild.contains("H4") && passet.getAssetName().equalsIgnoreCase("cincinnati")){

            return cincinnatiH4;

        }
        if (assetChild.contains("H5") && passet.getAssetName().equalsIgnoreCase("cincinnati")){

            return cincinnatiH5;

        }
        if (assetChild.contains("Hotel") && passet.getAssetName().equalsIgnoreCase("cincinnati")){

            return cincinnatiHotel;

        }

        if (assetChild.contains("H1") && passet.getAssetName().equalsIgnoreCase("london")){

            return londonH1;

        }
        if (assetChild.contains("H2") && passet.getAssetName().equalsIgnoreCase("london")){

            return londonH2;

        }
        if (assetChild.contains("H3") && passet.getAssetName().equalsIgnoreCase("london")){

            return londonH3;

        }
        if (assetChild.contains("H4") && passet.getAssetName().equalsIgnoreCase("london")){

            return londonH4;

        }
        if (assetChild.contains("H5") && passet.getAssetName().equalsIgnoreCase("london")){

            return londonH5;

        }
        if (assetChild.contains("Hotel") && passet.getAssetName().equalsIgnoreCase("london")){

            return londonHotel;

        }

        if (assetChild.contains("H1") && passet.getAssetName().equalsIgnoreCase("moscow")){

            return moscowH1;

        }
        if (assetChild.contains("H2") && passet.getAssetName().equalsIgnoreCase("moscow")){

            return moscowH2;

        }
        if (assetChild.contains("H3") && passet.getAssetName().equalsIgnoreCase("moscow")){

            return moscowH3;

        }
        if (assetChild.contains("H4") && passet.getAssetName().equalsIgnoreCase("moscow")){

            return moscowH4;

        }
        if (assetChild.contains("H5") && passet.getAssetName().equalsIgnoreCase("moscow")){

            return moscowH5;

        }
        if (assetChild.contains("Hotel") && passet.getAssetName().equalsIgnoreCase("moscow")){

            return moscowHotel;

        }

        if (assetChild.contains("H1") && passet.getAssetName().equalsIgnoreCase("tokyo")){

            return tokyoH1;

        }
        if (assetChild.contains("H2") && passet.getAssetName().equalsIgnoreCase("tokyo")){

            return tokyoH2;

        }
        if (assetChild.contains("H3") && passet.getAssetName().equalsIgnoreCase("tokyo")){

            return tokyoH3;

        }
        if (assetChild.contains("H4") && passet.getAssetName().equalsIgnoreCase("tokyo")){

            return tokyoH4;

        }
        if (assetChild.contains("H5") && passet.getAssetName().equalsIgnoreCase("tokyo")){

            return tokyoH5;

        }
        if (assetChild.contains("Hotel") && passet.getAssetName().equalsIgnoreCase("tokyo")){

            return tokyoHotel;

        }

        if (assetChild.contains("H1") && passet.getAssetName().equalsIgnoreCase("shanghai")){

            return shanghaiH1;

        }
        if (assetChild.contains("H2") && passet.getAssetName().equalsIgnoreCase("shanghai")){

            return shanghaiH2;

        }
        if (assetChild.contains("H3") && passet.getAssetName().equalsIgnoreCase("shanghai")){

            return shanghaiH3;

        }
        if (assetChild.contains("H4") && passet.getAssetName().equalsIgnoreCase("shanghai")){

            return shanghaiH4;

        }
        if (assetChild.contains("H5") && passet.getAssetName().equalsIgnoreCase("shanghai")){

            return shanghaiH5;

        }
        if (assetChild.contains("Hotel") && passet.getAssetName().equalsIgnoreCase("shanghai")){

            return shanghaiHotel;

        }
        return null;
    }

    /**
     * <p>Returns the corresponding JLabel object with respect to the child asset and PrivateAsset(parent) object<p/>
     * @param asset PrivateAsset value passed
     * @return JLabel.
     */
    private JLabel getCorrespondingLabel(PrivateAsset asset) {


        if (asset.getAssetName().contains("start") ) {

            return startLabel;


        } else if (asset.getAssetName().contains("hollywood")){

            return hollywoodLabel;

        }else if(asset.getAssetName().contains("ny")){

            return nyLabel;

        }else if(asset.getAssetName().contains("cincinnati")){

            return cincinnatiLabel;

        }else if(asset.getAssetName().contains("orphanage")){

            return orphanageLabel;

        }else if(asset.getAssetName().contains("jail1")){

            return jail1Label;

        }else if(asset.getAssetName().contains("moscow")){

            return moscowLabel;

        }else if(asset.getAssetName().contains("london")){

            return londonLabel;

        }else if(asset.getAssetName().contains("disney")){


            return disneyLabel;

        }else if(asset.getAssetName().contains("property")){

            return propertyTaxLabel;

        }else if(asset.getAssetName().contains("jail2")){

            return jail2Label;

        }else if(asset.getAssetName().contains("suffolk")){

            return suffolkLabel;

        }else if(asset.getAssetName().contains("marvel")){

            return marvelLabel;

        }else if(asset.getAssetName().contains("goj")){

            return gojLabel;

        }else if(asset.getAssetName().contains("wcc")){

            return wccLabel;

        }else if(asset.getAssetName().contains("jail3")){

            return jail3Label;

        }else if(asset.getAssetName().contains("corporateTax")){

            return corporateTaxLabel;

        }else if(asset.getAssetName().contains("tokyo")){

            return tokyoLabel;

        }else if(asset.getAssetName().contains("shanghai")){

            return shanghaiLabel;

        }else if(asset.getAssetName().contains("hallmark")){

            return hallmarkLabel;

        }else{

        }
        return null;

    }

}

