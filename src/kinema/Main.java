package kinema;

import kinema.candybar.CandyBarSplash;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {
    Integer width, height;
    JPanel background;
    JLabel header;
    JFrame frame;
    JLayeredPane pane;

    Main(){
        setWidth(650);
        setHeight(500);
        setupFrame();

        setMenu("candybar");

    }


    public static void main(String[] args) {
        new Main();
    }

    public void setWidth(Integer w){width = w;}

    public void setHeight(Integer h){height = h;}

    public void setupFrame(){
        //Creates frame (window)
        frame = new JFrame();
        frame.setSize(width, height);//400 width and 500 height
        frame.setVisible(true);//making the frame visible



        //Creates and adds the pane (menu)
        pane = new JLayeredPane();
        pane.setLayout(new BorderLayout());
        frame.add(pane);

        //Creates the header for the menu
        header = new JLabel("Narooma Kinema");
        header.setBackground(Color.BLUE);
        pane.add(header, BorderLayout.NORTH);

        //creates the background layer
        background = new JPanel();
        background.setSize(width,height/2);
        background.setBackground(Color.RED);
        pane.add(background,1);


    }

    private void setMenu(String menu){
        switch("login"){


        }

        switch("main"){

        }

        switch("candybar"){

        }

    }
}

