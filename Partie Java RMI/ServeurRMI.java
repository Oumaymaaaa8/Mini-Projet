import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.Skeleton;
import java.rmi.server.UnicastRemoteObject;

public class ServeurRMI {
    public static void main(String[] args) {
        try {
            // instanciation de la calsse d'implementation
            ListeTachesImpl serviceTache = new ListeTachesImpl();

            ServiceTache skeleton = (ServiceTache) UnicastRemoteObject.exportObject(serviceTache, 0);

            Registry registry = LocateRegistry.getRegistry();

            // publier le skeleton qu'on a créé
            Naming.rebind(" Service des Taches ", skeleton);
            System.out.println("Server is running...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
