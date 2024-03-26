import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ListeTachesImpl extends UnicastRemoteObject implements ServiceTache {
    private List<Tache> taches;

    public ListeTachesImpl() throws RemoteException {
        this.taches = new ArrayList<>();
    }

    public void ajoutTache(Tache tache) throws RemoteException {
        taches.add(tache);
    }

    public void supprimerTache(int index) throws RemoteException {
        if (index >= 0 && index < taches.size()) {
            taches.remove(index);
        }
    }

    public void afficherTaches() throws RemoteException {
        System.out.println("List des taches :");

        for (Tache t : taches) {
            System.out.println(t.toString());
        }
    }

}