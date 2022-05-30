package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowAllCarAdmin extends Container {

    public static JTextArea areaCarList;

    public ShowAllCarAdmin() {

        setSize(500, 500);
        setVisible(false);
        setLayout(null);

        areaCarList = new JTextArea();
        areaCarList.setBounds(70, 50, 300, 200);
        areaCarList.setEditable(false);
        add(areaCarList);


        JButton showButton = new JButton("SHOW CAR");
        showButton.setBounds(70, 300, 300, 30);
        add(showButton);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaCarList.setText(null);
                PackageData packageData = new PackageData("SHOW CAR");
                Main.connect(packageData);


            }
        });



        JButton backButton = new JButton("BACK");
        backButton.setBounds(70, 350, 300, 30);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showAllCarAdmin.setVisible(false);
                setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });


    }

}
