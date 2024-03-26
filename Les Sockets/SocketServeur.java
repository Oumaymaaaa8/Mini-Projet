import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServeur {
    public static List<ClientHandler> clientsList = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("Serveur en marche...");

            while (true) {

                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientsList.add(clientHandler);

                Thread clientThread = new Thread(clientHandler);
                clientThread.start();

            }

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public static void broadcast(String message) {
        for (ClientHandler client : clientsList) {
            client.sendMessage("client " + client.toString() + "said  : " + message);
        }
    }

    public static void removeClient(ClientHandler client) {
        clientsList.remove(client);
    }
}
