package CarSellingProject;

import java.io.*;
import java.util.ArrayList;

public class Database {

    public static ArrayList<Database> DB = new ArrayList();

    public static ArrayList<Client> clients = new ArrayList<>();
    public static ArrayList<Car> cars = new ArrayList<>();
    public static ArrayList<AutoParts> autoParts = new ArrayList<>();

    static {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("fillClients.txt"));

            clients.add(new Client("Josh", "Smith", "joshsmith@gmail.com", "password"));
            clients.add(new Client("Kitagawa", "Sedze", "potomoro@mail.com", "iLikeDogs"));
            clients.add(new Client("Zhangir", "Kuanyshev", "kazakhmen@yandex.ru", "beshparmak"));
            clients.add(new Client("Lozlo", "Ranimger", "lozlo@gmail.com", "qwerty"));
            String s = " ";

            for (int i = 0; i < clients.size(); i++) {
                s += clients.get(i) + "\n";
            }


            writer.write(s);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("fillCars.txt"));

            cars.add(new Car("Toyota", " Camry", "Japan", 30000));
            cars.add(new Car("Lexus", " RX 300", "Japan", 35000));
            cars.add(new Car("Mercedes-Benz", " S 500", "Germany", 35000));
            cars.add(new Car("BMW", " X7", "Germany", 50000));
            cars.add(new Car("Kia", " Rio", "South Korea", 20000));
            String s = "";

            for (int i = 0; i < cars.size(); i++) {
                s += cars.get(i) + "\n";
            }

            writer.write(s);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            var writer = new BufferedWriter(new FileWriter("fillAutoParts.txt"));
            autoParts.add(new AutoParts("Winter tires", "New Japanese winter tires with minimal wear.", 150000));
            autoParts.add(new AutoParts("Subaru legacy engine",
                    "Subaru legacy turbo engine from Japan. " +
                            "Warranty. Mileage up to a hundred thousand. It is possible to install. Sending to regions.", 250000));

            autoParts.add(new AutoParts("Car headlight", "On sale the original headlight (under xenon) on the infiniti FX35 2003-2007.", 130000));
            String s = " ";

            for (int i = 0; i < autoParts.size(); i++) {
                s += autoParts.get(i) + "\n";
            }

            writer.write(s);
            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("fillClients.txt"));
            ArrayList<String> clients = new ArrayList<>();
            String s = "";
            while ((s = reader.readLine()) != null) {
                clients.add(s);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("fillCars.txt"));
            ArrayList<String> cars = new ArrayList<>();
            String s = "";
            while ((s = reader.readLine()) != null) {
                cars.add(s);
            }

            reader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("fillAutoParts.txt"));
            ArrayList<String> autoParts = new ArrayList<>();
            String s = " ";
            while ((s = reader.readLine()) != null) {
                autoParts.add(s);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
