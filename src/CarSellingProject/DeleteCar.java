package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class DeleteCar extends Container {

    public DeleteCar() {

        setSize(500, 500);
        setVisible(false);
        setLayout(null);


        JLabel chooseNumberCar = new JLabel("Choose number of car to delete");
        chooseNumberCar.setBounds(70, 270, 50, 30);
        add(chooseNumberCar);

        JTextField chooseNumberCarFeild = new JTextField();
        chooseNumberCarFeild.setBounds(200, 270, 50, 30);
        add(chooseNumberCarFeild);

        JButton deleteButton = new JButton("DELETE CAR");
        deleteButton.setBounds(70, 300, 300, 30);
        add(deleteButton);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int chooseNumberCar = Integer.parseInt(chooseNumberCarFeild.getText());

                PackageData packageData = new PackageData("DELETE CAR", chooseNumberCar);
                Main.connect(packageData);


//                try {
//                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillCars.txt"));
//
//                    Main.announcements.remove(chooseNumberCar);
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


        JButton backButton = new JButton("BACK TO MENU");
        backButton.setBounds(70, 350, 300, 30);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.deleteCar.setVisible(false);
                setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });

    }

}
