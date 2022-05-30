package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMenu extends Container {

    public ClientMenu() {

        setSize(500, 500);
        JButton showAllCars = new JButton("Show all cars");
        showAllCars.setBounds(70, 50, 300, 30);
        add(showAllCars);

        showAllCars.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.clientMenu.setVisible(false);
                Main.frame.allCars.setVisible(true);

            }
        });

        JButton showAllAutoParts = new JButton("Show all auto parts");
        showAllAutoParts.setBounds(70, 100, 300, 30);
        add(showAllAutoParts);

        showAllAutoParts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.clientMenu.setVisible(false);
                Main.frame.autoParts.setVisible(true);

            }
        });

        JButton  yourAnnouncement = new JButton("Announcement");
        yourAnnouncement.setBounds(70, 150, 300, 30);
        add(yourAnnouncement);

        yourAnnouncement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.clientMenu.setVisible(false);
                Main.frame.anounMenu.setVisible(true);
            }
        });



        JButton backButton = new JButton("EXIT");
        backButton.setBounds(70, 250, 300, 30);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.clientMenu.setVisible(false);
                Main.frame.menu.setVisible(true);
            }
        });















    }


}
