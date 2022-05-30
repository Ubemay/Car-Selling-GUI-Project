package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnounMenu extends Container {

    public AnounMenu() {
        setSize(500, 500);
        setLayout(null);


        JButton ANA = new JButton("Add new announcement");
        ANA.setBounds(70, 100, 300, 30);
        add(ANA);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(70, 150, 300, 30);
        add(backButton);



        ANA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addAnoun.setVisible(true);
                Main.frame.anounMenu.setVisible(false);
            }
        });



        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.anounMenu.setVisible(false);
                Main.frame.clientMenu.setVisible(true);
            }
        });


    }
}
