/*
package CarSellingProject;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CarSellingManegementSystem extends Container implements RegisterAndLoginInterface {

    Scanner in = new Scanner(System.in);

    public CarSellingManegementSystem() {
    }

    public void main() {
        ArrayList<Database> db = Database.DB;
        loginPage();
    }

    private void loginPage() {
        while (true) {

            System.out.println("Welcome! Please log in or sign up");
            System.out.println("1) Log in");
            System.out.println("2) Sign up");
            System.out.println("0) EXIT");

            int choiceLiginPage = in.nextInt();

            if (choiceLiginPage == 0) {
                break;
            }

            if (choiceLiginPage == 1) {
                Login();
            }

            if (choiceLiginPage == 2) {
                Register();
            }

        }
    }

    @Override
    public void Login() {
        System.out.println("Enter your login and password");
        String login = in.next();
        String password = in.next();
        boolean isLogged = false;

        if (login.equals("admin") && password.equals("password")) {
            adminMenu();
            isLogged = true;
        }

        for (Client client : Database.clients) {
            if (client.getLogin().equals(login) && client.getPassword().equals(password)) {
                clientMenu(client);
                isLogged = true;
            }
        }
        if (!isLogged) {
            System.out.println("Wrong login or password");
        }
    }

    @Override
    public void Register() {
        System.out.println("Enter your name");
        String name = in.next();

        System.out.println("Enter your surname");
        String surname = in.next();

        System.out.println("Enter your login");
        String login = in.next();

        System.out.println("Enter your password");
        String password = in.next();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("fillClinets.txt"));
            Client newClient = new Client(name, surname, login, password);
            Database.clients.add(newClient);

            String s = "";

            for (int i = 0; i < Database.clients.size(); i++) {
                s += Database.clients.get(i) + "\n";
            }

            writer.write(s);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void clientMenu(Client client) {
        while (true) {
            System.out.println("Hello, " + client.getName() + "!");
            System.out.println("Choose option:");
            System.out.println("1) Show all cars");
            System.out.println("2) Show all auto parts");
            System.out.println("3) Your favourite list");
            System.out.println("4) Your announcements");
            System.out.println("5) My profile");
            System.out.println("6) Balance");
            System.out.println("0) EXIT");

            int choiceClientMenu = in.nextInt();
            if (choiceClientMenu == 0) {
                break;
            }

            if (choiceClientMenu == 1) {
                int i = 0;
                for (Car car : Database.cars) {
                    System.out.print(i++ + ") " + car.toString());
                }
            }

            if (choiceClientMenu == 2) {
                int i = 0;
                for (AutoParts autoParts : Database.autoParts) {
                    System.out.print(i++ + ") " + autoParts.toString());
                }
            }

            if (choiceClientMenu == 3) {
                while (true) {
                    System.out.println("Hello, " + client.getName() + "! Now you are in yours favourite list");
                    System.out.println("Choose option:");
                    System.out.println("1) Show favourite list");
                    System.out.println("2) Add car in favourite list");
                    System.out.println("3) Delete car from favourite list");
                    System.out.println("0) Exit");

                    int choiceFavouriteList = in.nextInt();
                    if (choiceFavouriteList == 0) {
                        break;
                    }

                    if (choiceFavouriteList == 1) {
                        System.out.println(client.getCarList());
                    }

                    if (choiceFavouriteList == 2) {
                        System.out.println(Database.cars);
                        System.out.println("Please, choose number of car, which you want to add");

                        try {
                            BufferedWriter writer = new BufferedWriter(new FileWriter("fillFavList.txt"));

                            int chooseAddCar = in.nextInt();
                            Car add = Database.cars.get(chooseAddCar);
                            client.getCarList().add(add);

                            String s = "";

                            for (int i = 0; i < client.getCarList().size(); i++) {
                                s += client.getCarList().get(i) + "\n";
                            }

                            writer.write(s);
                            writer.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println(client.getCarList());


                    }

                    if (choiceFavouriteList == 3) {
                        System.out.println(client.getCarList());
                        System.out.println("Please, choose number of car, which you want to delete");

                        try {
                            BufferedWriter writer = new BufferedWriter(new FileWriter("fillFavList.txt"));
                            int chooseDeleteCar = in.nextInt();
                            client.getCarList().remove(chooseDeleteCar);

                            String s = "";

                            for (int i = 0; i < client.getCarList().size(); i++) {
                                s += client.getCarList().get(i) + "\n";
                            }

                            writer.write(s);
                            writer.close();


                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        System.out.println(client.getCarList());
                    }
                }
            }

            if (choiceClientMenu == 4) {
                ArrayList<String> announcements = new ArrayList<>();
                while (true) {
                    System.out.println("Hello, " + client.getName() + "! Now you are in yours announcements");
                    System.out.println("Choose option:");
                    System.out.println("1) Show your announcements");
                    System.out.println("2) Add new announcement");
                    System.out.println("3) Delete announcement");
                    System.out.println("0) Exit");

                    int choiceAnoun = in.nextInt();
                    if (choiceAnoun == 0) {
                        break;
                    }

                    if (choiceAnoun == 1) {
                        int i = 0;
                        for (String announcement : announcements) {
                            System.out.println(i++ + ") " + announcement);
                        }
                    }
                    if (choiceAnoun == 2) {

                        System.out.println("Enter car brand:");
                        String brand = in.next();
                        System.out.println("Enter car model:");
                        String model = in.next();
                        System.out.println("Enter car country:");
                        String country = in.next();
                        System.out.println("Enter price of car");
                        int price = in.nextInt();

                        try {
                            BufferedWriter writer = new BufferedWriter(new FileWriter("fillAnoun.txt"));

                            Car car = new Car(brand, model, country, price);
                            announcements.add(String.valueOf(car));

                            String s = "";

                            for (int i = 0; i < announcements.size(); i++) {
                                s += announcements.get(i) + "\n";
                            }

                            writer.write(s);
                            writer.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                        System.out.println("New announcement was added successfully");
                    }

                    if (choiceAnoun == 3) {
                        System.out.println(announcements);
                        System.out.println("Please, choose announcement, which you want to delete");

                        try {
                            BufferedWriter writer = new BufferedWriter(new FileWriter("fillAnoun.txt"));

                            int chooseDeleteAnoun = in.nextInt();
                            announcements.remove(chooseDeleteAnoun);

                            String s = "";

                            for (int i = 0; i < announcements.size(); i++) {
                                s += announcements.get(i) + "\n";
                            }

                            writer.write(s);
                            writer.close();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        int chooseDeleteAnoun = in.nextInt();
                        announcements.remove(chooseDeleteAnoun);
                        System.out.println("New announcement was deleted successfully");
                        System.out.println(announcements);
                    }
                }
            }

            if (choiceClientMenu == 5) {
                System.out.println(client.accountData());
            }

            if (choiceClientMenu == 6) {
                while (true) {
                    System.out.println("Choose option:");
                    System.out.println("1) Show balance");
                    System.out.println("2) Add balance");
                    System.out.println("0) Exit");

                    int choiceBalance = in.nextInt();
                    if (choiceBalance == 0) {
                        break;
                    }


                }
            }


        }
    }

    public void adminMenu() {
        while (true) {
            System.out.println("Choose option:");
            System.out.println("1) Add car");
            System.out.println("2) Edit car");
            System.out.println("3) Delete car");
            System.out.println("4) Add auto part");
            System.out.println("5) Edit auto part");
            System.out.println("6) Delete auto part");
            System.out.println("7) Edit client");
            System.out.println("8) Delete client");
            System.out.println("9) Show all car");
            System.out.println("10) Show all clients");
            System.out.println("11) Show all auto parts");
            System.out.println("0) EXIT");

            int choiceAdminMenu = in.nextInt();
            if (choiceAdminMenu == 0) {
                break;
            }

            if (choiceAdminMenu == 1) {
                System.out.println("Enter car brand:");
                String brand = in.next();
                System.out.println("Enter car model:");
                String model = in.next();
                System.out.println("Enter car country:");
                String country = in.next();
                System.out.println("Enter price of car");
                int price = in.nextInt();

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillCars.txt"));
                    Car car = new Car(brand, model, country, price);
                    Database.cars.add(car);

                    String s = " ";

                    for (int i = 0; i < Database.cars.size(); i++) {
                        s += Database.cars.get(i) + "\n";
                    }

                    writer.write(s);
                    writer.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("New car was added");
            }

            if (choiceAdminMenu == 2) {
                System.out.println(Database.cars);

                int idCar = in.nextInt();

                System.out.println("Enter car brand: ");
                String brand = in.next();
                System.out.println("Enter car model: ");
                String model = in.next();
                System.out.println("Enter car country:");
                String country = in.next();
                System.out.println("Enter price of car:");
                int price = in.nextInt();

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillCars.txt"));
                    Car car = new Car(brand, model, country, price);
                    Database.cars.set(idCar, car);

                    String s = " ";

                    for (int i = 0; i < Database.cars.size(); i++) {
                        s += Database.cars.get(i) + "\n";
                    }

                    writer.write(s);
                    writer.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Car was added!");

            }

            if (choiceAdminMenu == 3) {
                System.out.println(Database.cars);
                System.out.println("Choice number of car, which you want to delete");

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillCars.txt"));

                    int choiceDeleteCar = in.nextInt();
                    Database.cars.remove(choiceDeleteCar);

                    String s = "";

                    for (int i = 0; i < Database.cars.size(); i++) {
                        s += Database.cars.get(i) + "\n";
                    }

                    writer.write(s);
                    writer.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Car was deleted");
            }

            if (choiceAdminMenu == 4) {
                System.out.println("Enter name of auto part: ");
                String nameAutoPart = in.next();
                System.out.println("Enter description: ");
                String description = in.next();
                System.out.println("Enter price of auto part");
                int price = in.nextInt();

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillAutoParts.txt"));
                    AutoParts autoParts = new AutoParts(nameAutoPart, description, price);
                    Database.autoParts.add(autoParts);

                    String s = " ";

                    for (int i = 0; i < Database.autoParts.size(); i++) {
                        s += Database.autoParts.get(i) + "\n";
                    }

                    writer.write(s);
                    writer.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("New auto parts was added");
            }

            if (choiceAdminMenu == 5) {
                System.out.println(Database.autoParts);

                int idAutoParts = in.nextInt();

                System.out.println("Enter name of auto part: ");
                String nameAutoPart = in.next();
                System.out.println("Enter description: ");
                String description = in.next();
                System.out.println("Enter price of auto part");
                int price = in.nextInt();

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillAutoParts.txt"));
                    AutoParts autoParts = new AutoParts(nameAutoPart, description, price);
                    Database.autoParts.set(idAutoParts, autoParts);

                    String s = " ";

                    for (int i = 0; i < Database.autoParts.size(); i++) {
                        s += Database.autoParts.get(i) + "\n";
                    }

                    writer.write(s);
                    writer.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Auto part was added!");
            }

            if (choiceAdminMenu == 6) {
                System.out.println(Database.autoParts);
                System.out.println("Choice number of auto part, which you want to delete");

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillAutoParts.txt"));

                    int choiceDeleteAutoParts = in.nextInt();
                    Database.autoParts.remove(choiceDeleteAutoParts);

                    String s = "";

                    for (int i = 0; i < Database.autoParts.size(); i++) {
                        s += Database.autoParts.get(i) + "\n";
                    }

                    writer.write(s);
                    writer.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Car was deleted");
            }

            if (choiceAdminMenu == 7) {
                System.out.println(Database.clients);

                int idClient = in.nextInt();

                System.out.println("Enter client name: ");
                String name = in.next();

                System.out.println("Enter client surname: ");
                String surname = in.next();

                System.out.println("Enter client login: ");
                String login = in.next();

                System.out.println("Enter client password: ");
                String password = in.next();

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillClients.txt"));
                    Client editedClient = new Client(name, surname, login, password);
                    Database.clients.set(idClient, editedClient);

                    String s = " ";

                    for (int i = 0; i < Database.cars.size(); i++) {
                        s += Database.cars.get(i) + "\n";
                    }

                    writer.write(s);
                    writer.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Client was edited");
            }

            if (choiceAdminMenu == 8) {
                System.out.println(Database.clients);
                int idDeleteClient = in.nextInt();
                System.out.println("Choose client, which you want to delete");

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("fillClients"));
                    Database.clients.remove(idDeleteClient);

                    String s = "";

                    for (int i = 0; i < Database.clients.size(); i++) {
                        s += Database.clients.get(i) + "\n";
                    }

                    writer.write(s);
                    writer.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                Database.clients.remove(idDeleteClient);
                System.out.println("Client was deleted from database");
            }

            if (choiceAdminMenu == 9) {
                int i = 0;
                for (Car car : Database.cars) {
                    System.out.print(i++ + ") " + car.toString());
                }
            }
            if (choiceAdminMenu == 10) {
                int i = 0;
                for (Client client : Database.clients) {
                    System.out.println(i++ + ") " + client.toString());
                }
            }
            if (choiceAdminMenu == 11) {
                int i = 0;
                for (AutoParts autoParts : Database.autoParts) {
                    System.out.println((i++ + ") ") + autoParts.toString());
                }
            }
        }
    }

}*/
