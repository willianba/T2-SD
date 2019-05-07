import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FSInterface extends Remote {
    String[] ls(String path) throws RemoteException;
    int mkdir(String path) throws RemoteException;
    int create(String path) throws RemoteException;
    int unlink(String path) throws RemoteException;
    int write(byte[] data, String path) throws RemoteException;
    byte[] read(String path) throws RemoteException;
}
