package CarSellingProject;

import javax.swing.*;

public class MainFrame extends JFrame {

    public static MainMenu menu;
    public static LoginPage loginPage;
    public static RegisterPage registerPage;
    public static ClientMenu clientMenu;
    public static AllCars allCars;
    public static AllAutoParts autoParts;
    public static AnounMenu anounMenu;
    public static AddAnoun addAnoun;
    public static AdminMenu adminMenu;
    public static AddCar addCar;
    public static EditCar editCar;
    public static DeleteCar deleteCar;
    public static AddAutoPart addAutoPart;
    public static EditAutoPart editAutoPart;
    public static DeleteAutoPart deleteAutoPart;
    public static DeleteClient deleteClient;
    public static ShowAllCarAdmin showAllCarAdmin;
    public static ShowAllAutoParts showAllAutoParts;

    public MainFrame() {

        setSize(600, 600);
        setTitle("Cars selling");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        menu = new MainMenu();
        menu.setLocation(0, 0);
        add(menu);

        loginPage = new LoginPage();
        loginPage.setLocation(0, 0);
        loginPage.setVisible(false);
        add(loginPage);

        registerPage = new RegisterPage();
        registerPage.setLocation(0, 0);
        registerPage.setVisible(false);
        add(registerPage);

        clientMenu = new ClientMenu();
        clientMenu.setLocation(0, 0);
        clientMenu.setVisible(false);
        add(clientMenu);

        allCars = new AllCars();
        allCars.setLocation(0, 0);
        allCars.setVisible(false);
        add(allCars);

        autoParts = new AllAutoParts();
        autoParts.setLocation(0, 0);
        autoParts.setVisible(false);
        add(autoParts);


        anounMenu = new AnounMenu();
        anounMenu.setLocation(0, 0);
        anounMenu.setVisible(false);
        add(anounMenu);

        addAnoun = new AddAnoun();
        addAnoun.setLocation(0, 0);
        addAnoun.setVisible(false);
        add(addAnoun);


        adminMenu = new AdminMenu();
        adminMenu.setLocation(0, 0);
        adminMenu.setVisible(false);
        add(adminMenu);

        addCar = new AddCar();
        addCar.setLocation(0, 0);
        addCar.setVisible(false);
        add(addCar);

        editCar = new EditCar();
        editCar.setLocation(0, 0);
        editCar.setVisible(false);
        add(editCar);

        deleteCar = new DeleteCar();
        deleteCar.setLocation(0, 0);
        deleteCar.setVisible(false);
        add(deleteCar);

        addAutoPart = new AddAutoPart();
        addAutoPart.setLocation(0, 0);
        addAutoPart.setVisible(false);
        add(addAutoPart);

        editAutoPart = new EditAutoPart();
        editAutoPart.setLocation(0, 0);
        editAutoPart.setVisible(false);
        add(editAutoPart);

        deleteAutoPart = new DeleteAutoPart();
        deleteAutoPart.setLocation(0, 0);
        deleteAutoPart.setVisible(false);
        add(deleteAutoPart);


        deleteClient = new DeleteClient();
        deleteClient.setLocation(0, 0);
        deleteClient.setVisible(false);
        add(deleteClient);

        showAllCarAdmin = new ShowAllCarAdmin();
        showAllCarAdmin.setLocation(0, 0);
        showAllCarAdmin.setVisible(false);
        add(showAllCarAdmin);

        showAllAutoParts = new ShowAllAutoParts();
        showAllAutoParts.setLocation(0, 0);
        showAllAutoParts.setVisible(false);
        add(showAllAutoParts);

    }


}
