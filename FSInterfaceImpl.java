import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FSInterfaceImpl extends UnicastRemoteObject implements FSInterface {
    private static final long serialVersionUID = -7643804566280949654L;

    public FSInterfaceImpl() throws RemoteException {
    }

    @Override
    public String[] ls(String path) throws RemoteException {
        return new String[0];
    }

    @Override
    public int mkdir(String path) throws RemoteException {
        return 0;
    }

    @Override
    public int create(String path) throws RemoteException {
        return 0;
    }

    @Override
    public int unlink(String path) throws RemoteException {
        return 0;
    }

    @Override
    public int write(byte[] data, String path) throws RemoteException {
        return 0;
    }

    @Override
    public byte[] read(String path) throws RemoteException {
        return new byte[0];
    }
}
