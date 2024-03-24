import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            // recupèration du registery
            Registry registry = LocateRegistry.getRegistry(null);
            // recupération de l'objet distrubue qui s'appelle " Service des Taches "
            ServiceTache stub = (ServiceTache) registry.lookup(" Service des Taches ");

            stub.afficherTaches();

            // Ajouter une tâche
            stub.ajoutTache(new Tache("Faire les courses", 1));
            stub.ajoutTache(new Tache("Ranger les courses", 2));

            // Supprimer une tâche terminée
            stub.supprimerTache(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}