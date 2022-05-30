package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {

    public MainMenu() {
        setSize(500, 500);
        setLayout(null);

        JButton loginButton = new JButton("LOG IN");
        loginButton.setBounds(70, 50, 300, 30);
        add(loginButton);

        JButton registerButton = new JButton("REGISTER");
        registerButton.setBounds(70, 110, 300, 30);
        add(registerButton);

        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(70, 170, 300, 30);
        add(exitButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.loginPage.setVisible(true);
                Main.frame.menu.setVisible(false);

            }
        });


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.registerPage.setVisible(true);
                Main.frame.menu.setVisible(false);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
