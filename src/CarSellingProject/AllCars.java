package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllCars extends Container {


    public static JTextArea areaAllCars;

    public AllCars() {
        setSize(1000, 1000);
        setVisible(false);
        setLayout(null);

        areaAllCars = new JTextArea();
        areaAllCars.setBounds(70, 50, 300, 300);
        areaAllCars.setEditable(false);
        add(areaAllCars);


        JButton backButton = new JButton("BACK TO MENU");
        backButton.setBounds(70, 390, 300, 30);
        add(backButton);

        JButton showButton = new JButton("SHOW CAR");
        showButton.setBounds(70, 350, 300, 30);
        add(showButton);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaAllCars.setText(null);
                PackageData packageData = new PackageData("SHOW CAR");
                Main.connect(packageData);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.allCars.setVisible(false);
                setVisible(false);
                Main.frame.clientMenu.setVisible(true);
            }
        });
    }

}
