package src;

import src.Server.ServiceCreatorFactory;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FSInterfaceImpl extends UnicastRemoteObject implements FSInterface {
    private static final long serialVersionUID = -7643804566280949654L;

    public FSInterfaceImpl() throws RemoteException {}

    @Override
    public String[] ls(String path) throws RemoteException {
        return (String[]) ServiceCreatorFactory.getInstance(Services.LS).execute(path);
    }

    @Override
    public Integer mkdir(String path) throws RemoteException {
        return null;
    }

    @Override
    public Integer create(String path) throws RemoteException {
        return null;
    }

    @Override
    public Integer unlink(String path) throws RemoteException {
        return null;
    }

    @Override
    public Integer write(byte[] data, String path) throws RemoteException {
        return null;
    }

    @Override
    public Byte[] read(String path) throws RemoteException {
        return new Byte[0];
    }
}
