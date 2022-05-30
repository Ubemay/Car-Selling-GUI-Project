package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class RegisterPage extends Container {

    public RegisterPage() {
        setSize(1000, 1000);
        setLayout(null);

        JLabel nameLabel = new JLabel("NAME: ");
        nameLabel.setBounds(70, 50, 100, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 50, 100, 30);
        add(nameField);

        JLabel surnameLabel = new JLabel("SURNAME: ");
        surnameLabel.setBounds(70, 110, 100, 30);
        add(surnameLabel);

        JTextField surnameField = new JTextField();
        surnameField.setBounds(200, 110, 100, 30);
        add(surnameField);

        JLabel loginLabel = new JLabel("LOGIN: ");
        loginLabel.setBounds(70, 170, 100, 30);
        add(loginLabel);

        JTextField loginField = new JTextField();
        loginField.setBounds(200, 170, 100, 30);
        add(loginField);

        JLabel passwordLabel = new JLabel("PASSWORD: ");
        passwordLabel.setBounds(70, 230, 100, 30);
        add(passwordLabel);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(200, 230, 100, 30);
        add(passwordField);

        JButton REGISTERButton = new JButton("REGISTER");
        REGISTERButton.setBounds(200, 280, 100, 30);
        add(REGISTERButton);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(200, 320, 100, 30);
        add(backButton);



        REGISTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String surname = surnameField.getText();
                String login = loginField.getText();
                String password = passwordField.getText();


                Client client = new Client(null, name, surname, login, password);

                client.setName(name);
                client.setSurname(surname);
                client.setLogin(login);
                client.setPassword(password);

                PackageData packageData = new PackageData("REGISTER", client);
                Main.connect(packageData);


//                try {
//                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillClinets.txt", true));
//                    Client newClient = new Client(name, surname, login, password);
//                    Database.clients.add(newClient);
//
//                    String s = "";
//
//                    for (int i = 0; i < Database.clients.size(); i++) {
//                        s += Database.clients.get(i) + "\n";
//                    }
//
//                    writer.write(s);
//                    writer.close();
//                } catch (Exception p) {
//                    p.printStackTrace();
//                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.registerPage.setVisible(false);
                Main.frame.menu.setVisible(true);
            }
        });

    }
}


