import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ListeTachesImpl extends UnicastRemoteObject implements ServiceTache {
    private List<Tache> taches;

    public ListeTachesImpl() throws RemoteException {
        this.taches = new ArrayList<>();
    }

    public void ajoutTache(Tache tache) {
        taches.add(tache);
    }

    public void supprimerTache(int index) {
        if (index >= 0 && index < taches.size()) {
            taches.remove(index);
        }
    }

    public void afficherTaches() {
        System.out.println("List des taches :");
        for (int i = 0; i < taches.size(); i++) {
            System.out.println((i + 1) + ". " + taches.get(i));
        }
    }

}