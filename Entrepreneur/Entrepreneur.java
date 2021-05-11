

/**
 * This application demonstrates a number of things in the implementation of an
 * Entrepreneur game. The objective of the the game is to make a fortune
 * with seed money while handling real life business problems
 * and in the process, bankrupt the opposing player.
 * @author John Doe
 * @version 1.0
 */

import javax.swing.*;

/**
 * <p>The Entrepreneur class commences the new version of the project</p>
 * @author John Doe
 * @version 1.0
 */
public class Entrepreneur {

    /**
     * <p>This is the driver method<p/>
     * @param args String array  passed
     * @return void.
     */
    public static void main(String args[]){

        SetGUI setGui=new SetGUI("Entrepreneur");
        setGui.setSize(1200,1200);
        setGui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setGui.setVisible(true);

    }
}

