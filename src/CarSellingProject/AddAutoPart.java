package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class AddAutoPart extends Container {

    public AddAutoPart() {

        setSize(500, 500);
        setVisible(false);
        setLayout(null);

        JLabel nameLabel = new JLabel("NAME: ");
        nameLabel.setBounds(70, 50, 70, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(160, 50, 150, 30);
        add(nameField);

        JLabel descriptionLabel = new JLabel("DESCRIPTION: ");
        descriptionLabel.setBounds(70, 100, 70, 30);
        add(descriptionLabel);

        JTextField descriptionField = new JTextField();
        descriptionField.setBounds(160, 100, 150, 30);
        add(descriptionField);

        JLabel priceLabel = new JLabel("PRICE: ");
        priceLabel.setBounds(70, 150, 70, 30);
        add(priceLabel);

        JTextField priceField = new JTextField();
        priceField.setBounds(160, 150, 150, 30);
        add(priceField);


        JButton addButton = new JButton("ADD AUTOPART");
        addButton.setBounds(70, 250, 100, 30);
        add(addButton);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(70, 300, 100, 30);
        add(backButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String description = descriptionField.getText();
                int price = Integer.parseInt(priceField.getText());

                AutoParts autoParts = new AutoParts(name, description, price);




                autoParts.setAutoPartsName(name);
                autoParts.setDescription(description);
                autoParts.setPrice(price);

                PackageData packageData = new PackageData("ADD AUTOPART", autoParts);
                Main.connect(packageData);

//                try {
//                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillAutoParts.txt"));
//                    AutoParts autoParts1 = new AutoParts(name, description, price);
//                    Database.autoParts.add(autoParts1);
//
//                    String s = " ";
//
//                    for (int i = 0; i < Database.autoParts.size(); i++) {
//                        s += Database.autoParts.get(i) + "\n";
//                    }
//
//                    writer.write(s);
//                    writer.close();
//
//                } catch (Exception p) {
//                    p.printStackTrace();
//                }


            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addAutoPart.setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addAutoPart.setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });

    }

}
