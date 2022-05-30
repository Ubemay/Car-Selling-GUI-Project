package CarSellingProject;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
    private Car car;
    private ArrayList<Car> cars;

    private Client client;
    private ArrayList<Client> clients;

    private AutoParts autoPart;
    private ArrayList<AutoParts> autoParts;

    private int id;

    private String check;
    private String login;
    private String password;

    private Boolean checker;




    public PackageData() {
    }

    public PackageData(String operationType, Car car) {
        this.operationType = operationType;
        this.car = car;
    }


    public PackageData(String operationType) {
        this.operationType = operationType;
    }

    public PackageData(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public PackageData(String operationType, Client client) {
        this.operationType = operationType;
        this.client = client;
    }

    public PackageData(Boolean checker) {
        this.checker = checker;
    }

    public PackageData(String operationType, AutoParts autoPart) {
        this.operationType = operationType;
        this.autoPart = autoPart;
    }

    public PackageData(String operationType, int id) {
        this.operationType = operationType;
        this.id = id;
    }

    public PackageData(String operationType, String check) {
        this.operationType = operationType;
        this.check = check;
    }



    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public AutoParts getAutoPart() {
        return autoPart;
    }

    public void setAutoPart(AutoParts autoPart) {
        this.autoPart = autoPart;
    }

    public ArrayList<AutoParts> getAutoParts() {
        return autoParts;
    }

    public void setAutoParts(ArrayList<AutoParts> autoParts) {
        this.autoParts = autoParts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
