package CarSellingProject;

import java.sql.*;
import java.util.ArrayList;

public class DBManager {
    public static Connection connection;
    public static final String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String username = "postgres";
    public static final String password = "Aa1234";


    public void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Car> getAllCars() {
        ArrayList<Car> cars = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("" + "SELECT * FROM public.cars");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                String country = resultSet.getString("country");
                int price = resultSet.getInt("price");
                cars.add(new Car(id, brand, model, country, price));

            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cars;
    }


    public ArrayList<AutoParts> getAllAutoParts() {
        ArrayList<AutoParts> autoParts = new ArrayList<>();
        try {

            PreparedStatement statement = connection.prepareStatement("" + "SELECT * FROM public.autoparts");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String autoPartsName = resultSet.getString("autopartname");
                String description = resultSet.getString("description");
                int price = resultSet.getInt("price");
                autoParts.add(new AutoParts(id, autoPartsName, description, price));
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return autoParts;
    }


    ////////////////////// ADD

    public void addCar(Car car) {
        try {

            PreparedStatement statement = connection.prepareStatement("" + "INSERT INTO public.cars (brand, model, country, price)"
                    + "VALUES (?, ?, ?, ?)");

            statement.setString(1, car.getBrand());
            statement.setString(2, car.getModel());
            statement.setString(3, car.getCountry());
            statement.setInt(4, car.getPrice());

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addAutoPart(AutoParts autoParts) {
        try {
            PreparedStatement statement = connection.prepareStatement("" + "INSERT INTO public.autoparts(autopartname, description, price)"
                    + "VALUES (?, ?, ?)");

            statement.setString(1, autoParts.getAutoPartsName());
            statement.setString(2, autoParts.getDescription());
            statement.setInt(3, autoParts.getPrice());

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    ////////////////// EDIT

    public void editCar(Car car) {
        try {
            PreparedStatement statement = connection.prepareStatement(""
                    + "UPDATE public.cars SET\n"
                    + "brand = ?, model = ?, country = ?, price = ?"
                    + "WHERE id = ?;");

            statement.setString(1, car.getBrand());
            statement.setString(2, car.getModel());
            statement.setString(3, car.getCountry());
            statement.setInt(4, car.getPrice());
            statement.setInt(5, car.getId());

            statement.executeUpdate();

            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editAutoPart(AutoParts autoParts) {
        try {
            PreparedStatement statement = connection.prepareStatement(""
                    + "UPDATE public.autoparts SET\n"
                    + "autopartname = ?, description = ?, price = ?"
                    + "WHERE id = ?;");

            statement.setString(1, autoParts.getAutoPartsName());
            statement.setString(2, autoParts.getDescription());
            statement.setInt(3, autoParts.getPrice());
            statement.setInt(4, autoParts.getId());

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void deleteCar(Integer id) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "delete from public.cars\n"
                    + "where id =? ");

            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAutoPart(Integer id) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "delete from public.autoparts\n" +
                    "where id = ?");

            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteClient(Integer id) {
        try {

            PreparedStatement statement = connection.prepareStatement("" +
                    "delete from public.clients\n" +
                    "where id = ?");

            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean checker(String login, String password) {
        Boolean isLogged = false;
        try {

            PreparedStatement statement = connection.prepareStatement("SELECT  * FROM public.clients WHERE login = '" + login
                    + "' AND password = '" + password + "'");
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                isLogged = true;
            } else {
                isLogged = false;
            }

            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isLogged;
    }

    public void register(Client client) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO public.clients(name, surname, login , password)"
                    + "VALUES (?, ?, ?,?)");

            statement.setString(1, client.getName());
            statement.setString(2, client.getSurname());
            statement.setString(3, client.getLogin());
            statement.setString(4, client.getPassword());

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

