package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllAutoParts extends Container {

    public static JTextArea areaAutoParts;

    public AllAutoParts() {
        setSize(500, 500);
        setVisible(false);
        setLayout(null);

        areaAutoParts = new JTextArea();
        areaAutoParts.setBounds(70, 50, 300, 270);
        areaAutoParts.setEditable(false);
        add(areaAutoParts);
        String result = " ";


        JButton backButton = new JButton("BACK TO MENU");
        backButton.setBounds(70, 400, 300, 30);
        add(backButton);

        JButton showButton = new JButton("SHOW AUTOPART");
        showButton.setBounds(70, 350, 300, 30);
        add(showButton);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaAutoParts.setText(null);
                PackageData packageData = new PackageData("SHOW AUTOPART");
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
