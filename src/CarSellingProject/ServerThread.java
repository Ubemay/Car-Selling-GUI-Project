package CarSellingProject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

public class ServerThread extends Thread implements Serializable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DBManager manager = new DBManager();
            manager.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData packageData = null;
            while ((packageData = (PackageData) inputStream.readObject()) != null) {
                if (packageData.getOperationType().equals("SHOW CAR")) {
                    ArrayList<Car> carArrayList = manager.getAllCars();
                    PackageData toCars = new PackageData();
                    toCars.setCars(carArrayList);
                    outputStream.writeObject(toCars);
                    break;
                } else if (packageData.getOperationType().equals("SHOW AUTOPART")) {
                    ArrayList<AutoParts> autoPartsArrayList = manager.getAllAutoParts();
                    PackageData toAutoParts = new PackageData();
                    toAutoParts.setAutoParts(autoPartsArrayList);
                    outputStream.writeObject(toAutoParts);
                    outputStream.flush();
                    break;
                }


                ///////////////////////// ADD

                else if (packageData.getOperationType().equals("ADD CAR")) {
                    Car car = packageData.getCar();
                    manager.addCar(car);
                    break;
                } else if (packageData.getOperationType().equals("ADD ANOUN")) {
                    Car car = packageData.getCar();
                    manager.addCar(car);
                    break;
                } else if (packageData.getOperationType().equals("ADD AUTOPART")) {
                    AutoParts autoParts = packageData.getAutoPart();
                    manager.addAutoPart(autoParts);
                    break;
                }

                /////////////////////////EDIT

                else if (packageData.getOperationType().equals("EDIT CAR")) {
                    Car car = packageData.getCar();
                    manager.editCar(car);
                    break;
                } else if (packageData.getOperationType().equals("EDIT AUTOPART")) {
                    AutoParts autoParts = packageData.getAutoPart();
                    manager.editAutoPart(autoParts);
                    break;
                }  else if (packageData.getOperationType().equals("DELETE CAR")) {
                    int idCar = packageData.getId();
                    manager.deleteCar(idCar);
                    break;
                } else if (packageData.getOperationType().equals("DELETE AUTOPART")) {
                    int idAutoPart = packageData.getId();
                    manager.deleteAutoPart(idAutoPart);
                    break;
                } else if (packageData.getOperationType().equals("DELETE CLIENT")) {
                    int idClient = packageData.getId();
                    manager.deleteClient(idClient);
                    break;
                }


                /////////////////// CHECK LOG

                else if (packageData.getOperationType().equals("ENTER")) {
                    Boolean check = manager.checker(packageData.getLogin(), packageData.getPassword());
                    PackageData check1 = new PackageData(check);
                    outputStream.writeObject(check1);
                    break;
                } else if (packageData.getOperationType().equals("REGISTER")) {
                    Client client = packageData.getClient();
                    manager.register(client);
                    break;
                }
            }

            inputStream.close();
            outputStream.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
