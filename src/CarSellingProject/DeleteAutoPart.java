package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class DeleteAutoPart extends Container {

    public DeleteAutoPart() {

        setSize(500, 500);
        setVisible(false);
        setLayout(null);


        JLabel chooseNumberCar = new JLabel("Choose number of auto part to delete");
        chooseNumberCar.setBounds(70, 270, 50, 30);
        add(chooseNumberCar);

        JTextField chooseNumberAutoPartFeild = new JTextField();
        chooseNumberAutoPartFeild.setBounds(200, 270, 50, 30);
        add(chooseNumberAutoPartFeild);

        JButton deleteButton = new JButton("DELETE AUTOPART");
        deleteButton.setBounds(70, 300, 300, 30);
        add(deleteButton);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int chooseNumberAutoPart = Integer.parseInt(chooseNumberAutoPartFeild.getText());

                PackageData packageData = new PackageData("DELETE AUTOPART", chooseNumberAutoPart);
                Main.connect(packageData);

//                try {
//                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillAnoun.txt"));
//
//                    Main.announcements.remove(chooseNumberAutoPart);
//
//                    String s = "";
//
//                    for (int i = 0; i < Main.announcements.size(); i++) {
//                        s += Main.announcements.get(i) + "\n";
//                    }
//
//                    writer.write(s);
//                    writer.close();
//
//                } catch (Exception t) {
//                    t.printStackTrace();
//                }

            }
        });


        JButton backButton = new JButton("BACK");
        backButton.setBounds(70, 350, 300, 30);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.deleteAutoPart.setVisible(false);
                setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });


    }

}
