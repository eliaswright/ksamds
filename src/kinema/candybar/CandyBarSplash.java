package kinema.candybar;

import javax.swing.*;
import java.awt.*;


public class CandyBarSplash extends JFrame{
    private JButton returnButton;
    private JButton suppliersButton;
    private JButton itemsButton;
    private JButton stocktakeButton;
    private JButton inventoryButton;

    public CandyBarSplash(){
        setLayout(new BorderLayout());
        JFrame menuFrame = new JFrame();



        returnButton = new JButton("Return");
        JLabel returnLabel = new JLabel("Return to Main menu");
        suppliersButton = new JButton("Suppliers");
        JLabel suppliersLabel = new JLabel("Manage supplier information");
        itemsButton = new JButton("Items");

        stocktakeButton = new JButton("StockTake");
        inventoryButton = new JButton("Inventory");

        add(suppliersButton);
        add(suppliersLabel);
        add(itemsButton);
        add(stocktakeButton);
        add(inventoryButton);
        add(returnButton);
        add(returnLabel);


    }
}
