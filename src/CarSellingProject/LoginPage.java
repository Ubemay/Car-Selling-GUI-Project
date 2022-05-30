package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginPage extends Container {

    public LoginPage() {
        setSize(500, 400);
        setLayout(null);

        JLabel loginLabel = new JLabel("LOGIN: ");
        loginLabel.setBounds(70, 50, 100, 30);
        add(loginLabel);

        JTextField loginField = new JTextField();
        loginField.setBounds(200, 50, 100, 30);
        add(loginField);

        JLabel passwordLabel = new JLabel("PASSWORD: ");
        passwordLabel.setBounds(70, 110, 100, 30);
        add(passwordLabel);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(200, 110, 100, 30);
        add(passwordField);

        JButton enterButton = new JButton("ENTER");
        enterButton.setBounds(200, 170, 100, 30);
        add(enterButton);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                String password = passwordField.getText();


                if (login.equals("admin") && password.equals("password")) {
                    Main.frame.loginPage.setVisible(false);
                    Main.frame.adminMenu.setVisible(true);
                }


                try {
                    DBManager result = new DBManager();
                    result.connect();

                    Statement statement = DBManager.connection.createStatement();

                    String query = "SELECT * FROM public.clients WHERE login = '" + loginField.getText() + "' AND password = '" + passwordField.getText() + "'";
                    ResultSet resultSet = statement.executeQuery(query);

                    PackageData packageData = new PackageData("ENTER", login);
                    Main.connect(packageData);

                    if(resultSet.next()) {
                        Main.frame.loginPage.setVisible(false);
                        Main.frame.clientMenu.setVisible(true);
                    }



                } catch (Exception t) {
                    t.printStackTrace();
                }

//                for (Client client : Database.clients) {
//                    if (client.getLogin().equals(login) && client.getPassword().equals(password)) {
//                        Main.frame.loginPage.setVisible(false);
//                        Main.frame.clientMenu.setVisible(true);
//                    }
//                }

            }
        });

        JButton backButton = new JButton("BACK");
        backButton.setBounds(200, 230, 100, 30);

        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.loginPage.setVisible(false);
                Main.frame.menu.setVisible(true);
            }
        });


    }
}


