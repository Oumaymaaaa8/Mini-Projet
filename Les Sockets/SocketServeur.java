import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServeur {
    public static List<PrintWriter> clientWriters = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("Serveur en marche...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Nouveau client connecté");

                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // reception des messages des clients

                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                // stocker les messages envoyés

                clientWriters.add(writer);
                // un thread s'occupe de chaque client

                Thread clientHandler = new Thread(new ClientHandler(clientSocket));
                clientHandler.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}