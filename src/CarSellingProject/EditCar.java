package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditCar extends Container {

    public EditCar() {

        setSize(1000, 1000);
        setVisible(false);
        setLayout(null);

        JLabel nameLabel = new JLabel("NAME: ");
        nameLabel.setBounds(70, 300, 70, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(160, 300, 150, 30);
        add(nameField);

        JLabel modelLabel = new JLabel("MODEL: ");
        modelLabel.setBounds(70, 350, 70, 30);
        add(modelLabel);

        JTextField modelField = new JTextField();
        modelField.setBounds(160, 350, 150, 30);
        add(modelField);

        JLabel countryLabel = new JLabel("COUNTRY: ");
        countryLabel.setBounds(70, 400, 70, 30);
        add(countryLabel);

        JTextField countryField = new JTextField();
        countryField.setBounds(160, 400, 150, 30);
        add(countryField);

        JLabel priceLabel = new JLabel("PRICE: ");
        priceLabel.setBounds(70, 450, 70, 30);
        add(priceLabel);

        JTextField priceField = new JTextField();
        priceField.setBounds(160, 450, 150, 30);
        add(priceField);

        JLabel idCarLabel = new JLabel("ID CAR: ");
        idCarLabel.setBounds(70, 500, 150,30);
        add(idCarLabel);

        JTextField idCarField = new JTextField();
        idCarField.setBounds(160, 500, 150, 30);
        add(idCarField);


        JButton editButton = new JButton("EDIT CAR");
        editButton.setBounds(320, 350, 100, 30);
        add(editButton);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(320, 400, 100, 30);
        add(backButton);



        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idCar = Integer.parseInt(idCarField.getText());
                String name = nameField.getText();
                String model = modelField.getText();
                String country = countryField.getText();
                int price = Integer.parseInt(priceField.getText());

                Car car = new Car(idCar, name, model, country, price);

                PackageData packageData = new PackageData("EDIT CAR", car);
                Main.connect(packageData);

//                Database.cars.set(idCar, car);
//
//                String s = " ";
//
//                for (int i = 0; i < Database.cars.size(); i++) {
//                    s += Database.cars.get(i) + "\n";
//                }
            }
        });


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.editCar.setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });


    }

}
