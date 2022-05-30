package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditAutoPart extends Container {

    public EditAutoPart() {

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

        JLabel idCarLabel = new JLabel("ID AUTO PART: ");
        idCarLabel.setBounds(70, 200, 70, 30);
        add(idCarLabel);

        JTextField idCarField = new JTextField();
        idCarField.setBounds(160, 200, 150, 30);
        add(idCarField);

        JButton editButton = new JButton("EDIT AUTOPART");
        editButton.setBounds(70, 250, 100, 30);
        add(editButton);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(70, 300, 100, 30);
        add(backButton);

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idAutoPart= Integer.parseInt(idCarField.getText());
                String name = nameField.getText();
                String description = descriptionField.getText();
                int price = Integer.parseInt(priceField.getText());

                AutoParts autoParts = new AutoParts(idAutoPart, name, description, price);

                PackageData packageData = new PackageData("EDIT AUTOPART", autoParts);
                Main.connect(packageData);

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
                Main.frame.editAutoPart.setVisible(false);
                Main.frame.adminMenu.setVisible(true);
            }
        });

    }

}
