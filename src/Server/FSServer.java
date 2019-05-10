package src.Server;

import src.FSInterfaceImpl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class FSServer {
    public static void main (String[] argv) {
        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("RMI registry ready.");
        } catch (RemoteException e) {
            System.out.println("RMI registry already running.");
        }
        try {
            Naming.rebind ("FileService", new FSInterfaceImpl());
            System.out.println ("Server.FSServer is ready.");
        } catch (Exception e) {
            System.out.println ("Server.FSServer failed.");
        }
    }
}
