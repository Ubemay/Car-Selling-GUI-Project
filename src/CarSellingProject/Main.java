package CarSellingProject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;

public class Main implements Serializable {


    public static void connect(PackageData pd) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            if (pd.getOperationType().equals("SHOW CAR")) {
                outputStream.writeObject(pd);
                PackageData infoFromServer = (PackageData) inputStream.readObject();
                ArrayList<Car> carArrayList = infoFromServer.getCars();
                String s = "";

                for (int i = 0; i < carArrayList.size(); i++) {
                    s += carArrayList.get(i).toString() + '\n';
                }
                ShowAllCarAdmin.areaCarList.append(s);
                AllCars.areaAllCars.append(s);
            } else if (pd.getOperationType().equals("SHOW AUTOPART")) {
                outputStream.writeObject(pd);
                PackageData infoFromServer = (PackageData) inputStream.readObject();
                ArrayList<AutoParts> autoPartsArrayList = infoFromServer.getAutoParts();
                String s = "";

                for (int i = 0; i < autoPartsArrayList.size(); i++) {
                    s += autoPartsArrayList.get(i).toString() + "\n";
                }
                ShowAllAutoParts.areaAutoPartsList.append(s);
                AllAutoParts.areaAutoParts.append(s);
            } else if (pd.getOperationType().equals("ADD CAR")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("ADD ANOUN")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("ADD AUTOPART")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("EDIT CAR")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("EDIT AUTOPART")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("EDIT CLIENT")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("DELETE CAR")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("DELETE AUTOPART")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("DELETE CLIENT")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("ENTER")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("REGISTER")) {
                outputStream.writeObject(pd);
            }

            inputStream.close();
            outputStream.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static MainFrame frame;
    public static ArrayList<Car> CarList = new ArrayList<>();
    public static ArrayList<String> announcements = new ArrayList<>();
    public static ArrayList<Client> clients = new ArrayList<>();
    public static ArrayList<AutoParts> autoParts = new ArrayList<>();


    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}
