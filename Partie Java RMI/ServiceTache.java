import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceTache extends Remote {
    // publication de la signature de la méthode

    void ajoutTache(Tache task) throws RemoteException;

    void supprimerTache(int index) throws RemoteException;

    public void afficherTaches() throws RemoteException;

}