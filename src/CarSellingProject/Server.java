package CarSellingProject;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);

            while(true) {
                System.out.println("Waiting!");
                Socket socket = serverSocket.accept();
                System.out.println("Successful connecting");

                ServerThread st = new ServerThread(socket);
                st.start();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
