import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRMI {
    public static void main(String[] args) {
        try {
            // instanciation de la calsse d'implementation
            ListeTachesImpl serviceTache = new ListeTachesImpl();
            Registry registry = LocateRegistry.createRegistry(9090);

            registry.rebind("Service des Taches", serviceTache);

            // publier le skeleton qu'on a créé
            System.out.println("Server is running...");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
