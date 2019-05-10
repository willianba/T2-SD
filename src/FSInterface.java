package src;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FSInterface extends Remote {
    String[] ls(String path) throws RemoteException;
    Integer mkdir(String path) throws RemoteException;
    Integer create(String path) throws RemoteException;
    Integer unlink(String path) throws RemoteException;
    Integer write(String path, byte[] data) throws RemoteException;
    Byte[] read(String path) throws RemoteException;
}
