package src;

import src.Client.ServiceCreatorFactory;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FSInterfaceImpl extends UnicastRemoteObject implements FSInterface {
    private static final long serialVersionUID = -7643804566280949654L;

    public FSInterfaceImpl() throws RemoteException {
    }

    @Override
    public String[] ls(String path) {
        return (String[]) ServiceCreatorFactory.getServiceInstance(Services.LS).execute(path);
    }

    @Override
    public Integer mkdir(String path) {
        return (Integer) ServiceCreatorFactory.getServiceInstance(Services.MKDIR).execute(path);
    }

    @Override
    public Integer create(String path) {
        return (Integer) ServiceCreatorFactory.getServiceInstance(Services.CREATE).execute(path);
    }

    @Override
    public Integer unlink(String path) {
        return (Integer) ServiceCreatorFactory.getServiceInstance(Services.UNLINK).execute(path);
    }

    @Override
    public Integer write(byte[] data, String path) {
        return (Integer) ServiceCreatorFactory.getServiceInstance(Services.WRITE).execute(data, path);
    }

    @Override
    public Byte[] read(String path) {
        return (Byte[]) ServiceCreatorFactory.getServiceInstance(Services.READ).execute(path);
    }
}
