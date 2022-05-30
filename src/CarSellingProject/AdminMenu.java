package CarSellingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenu extends Container {

    public AdminMenu() {
        setSize(1000, 1000);
        setVisible(false);
        setLayout(null);

        JButton AllCars = new JButton("Add car");
        AllCars.setBounds(70, 100, 300, 30);
        add(AllCars);


        AllCars.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.addCar.setVisible(true);
            }
        });

        JButton editCar = new JButton("Edit car");
        editCar.setBounds(70, 150, 300, 30);
        add(editCar);

        editCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.editCar.setVisible(true);
            }
        });

        JButton deleteCar = new JButton("Delete car");
        deleteCar.setBounds(70, 200, 300, 30);
        add(deleteCar);

        deleteCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.deleteCar.setVisible(true);
            }
        });

        JButton addAutoPart = new JButton("Add auto part");
        addAutoPart.setBounds(70, 250, 300, 30);
        add(addAutoPart);

        addAutoPart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.addAutoPart.setVisible(true);
            }
        });

        JButton editAutoPart = new JButton("Edit auto part");
        editAutoPart.setBounds(70, 300, 300, 30);
        add(editAutoPart);

        editAutoPart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.editAutoPart.setVisible(true);
            }
        });

        JButton deleteAutoPart = new JButton("Delete auto part");
        deleteAutoPart.setBounds(70, 350, 300, 30);
        add(deleteAutoPart);

        deleteAutoPart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.deleteAutoPart.setVisible(true);
            }
        });



        JButton deleteClient = new JButton("Delete client");
        deleteClient.setBounds(70, 400, 300, 30);
        add(deleteClient);

        deleteClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.deleteClient.setVisible(true);
            }
        });

        JButton showAllCar = new JButton("Show all car");
        showAllCar.setBounds(70, 450, 300, 30);
        add(showAllCar);

        showAllCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.showAllCarAdmin.setVisible(true);
            }
        });

        JButton showAllAutoParts = new JButton("Show all auto parts");
        showAllAutoParts.setBounds(70, 500, 300, 30);
        add(showAllAutoParts);

        showAllAutoParts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.showAllAutoParts.setVisible(true);
            }
        });



        JButton backButton = new JButton("EXIT");
        backButton.setBounds(70, 550, 300, 30);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.adminMenu.setVisible(false);
                Main.frame.menu.setVisible(true);
            }
        });


    }

}
