package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class AddCar extends Container {

    public AddCar() {

        setSize(500, 500);
        setVisible(false);
        setLayout(null);

        JLabel nameLabel = new JLabel("NAME: ");
        nameLabel.setBounds(70, 50, 70, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(160, 50, 150, 30);
        add(nameField);

        JLabel modelLabel = new JLabel("MODEL: ");
        modelLabel.setBounds(70, 100, 70, 30);
        add(modelLabel);

        JTextField modelField = new JTextField();
        modelField.setBounds(160, 100, 150, 30);
        add(modelField);

        JLabel countryLabel = new JLabel("COUNTRY: ");
        countryLabel.setBounds(70, 150, 70, 30);
        add(countryLabel);

        JTextField countryField = new JTextField();
        countryField.setBounds(160, 150, 150, 30);
        add(countryField);

        JLabel priceLabel = new JLabel("PRICE: ");
        priceLabel.setBounds(70, 200, 70, 30);
        add(priceLabel);

        JTextField priceField = new JTextField();
        priceField.setBounds(160, 200, 150, 30);
        add(priceField);

        JButton addButton = new JButton("ADD CAR");
        addButton.setBounds(70, 250, 100, 30);
        add(addButton);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(70, 300, 100, 30);
        add(backButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String model = modelField.getText();
                String country = countryField.getText();
                int price = Integer.parseInt(priceField.getText());

                Car car = new Car(0, name, model, country, price);

                PackageData packageData = new PackageData("ADD CAR", car);
                Main.connect(packageData);

                car.setBrand(name);
                car.setModel(model);
                car.setCountry(country);
                car.setPrice(price);


//                try {
//                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillCars.txt", true));
//                    Car car1 = new Car(name, model, country, price);
//                    Database.cars.add(car1);
//
//                    String s = " ";
//
//                    for (int i = 0; i < Database.cars.size(); i++) {
//                        s += Database.cars.get(i) + "\n";
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
                Main.frame.addCar.setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addCar.setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });


    }

}
