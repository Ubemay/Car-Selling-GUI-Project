package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class DeleteClient extends Container {

    public DeleteClient() {

        setSize(500, 500);
        setVisible(false);
        setLayout(null);

        JLabel chooseNumberCar = new JLabel("Choose number of client to delete");
        chooseNumberCar.setBounds(70, 270, 50, 30);
        add(chooseNumberCar);

        JTextField chooseNumberClientFeild = new JTextField();
        chooseNumberClientFeild.setBounds(200, 270, 50, 30);
        add(chooseNumberClientFeild);

        JButton deleteButton = new JButton("DELETE CLIENT");
        deleteButton.setBounds(70, 300, 300, 30);
        add(deleteButton);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int chooseNumberClient = Integer.parseInt(chooseNumberClientFeild.getText());

                PackageData packageData = new PackageData("DELETE CLIENT", chooseNumberClient);
                Main.connect(packageData);

//                try {
//                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillCars.txt"));
//
//                    Main.clients.remove(chooseNumberClient);
//
//                    String s = "";
//
//                    for (int i = 0; i < Main.clients.size(); i++) {
//                        s += Main.clients.get(i) + "\n";
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
                Main.frame.deleteClient.setVisible(false);
                setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });


    }

}
