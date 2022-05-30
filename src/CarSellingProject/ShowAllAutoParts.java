package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowAllAutoParts extends Container {

    public static JTextArea areaAutoPartsList;

    public ShowAllAutoParts() {

        setSize(500, 500);
        setVisible(false);
        setLayout(null);

        areaAutoPartsList = new JTextArea();
        areaAutoPartsList.setBounds(70, 50, 300, 200);
        areaAutoPartsList.setEditable(false);
        add(areaAutoPartsList);


        JButton showButton = new JButton("SHOW AUTOPART");
        showButton.setBounds(70, 300, 300, 30);
        add(showButton);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaAutoPartsList.setText(null);
                PackageData packageData = new PackageData("SHOW AUTOPART");
                Main.connect(packageData);
            }
        });



        JButton backButton = new JButton("BACK");
        backButton.setBounds(70, 350, 300, 30);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showAllAutoParts.setVisible(false);
                setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });

    }

}
