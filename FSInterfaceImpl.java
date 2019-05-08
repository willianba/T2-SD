import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class FSInterfaceImpl extends UnicastRemoteObject implements FSInterface {
    private static final long serialVersionUID = -7643804566280949654L;

    public FSInterfaceImpl() throws RemoteException {}

    @Override
    public String[] ls(String path) throws RemoteException {
        String[] files = new String[0];
        try {
            File directory = new File(path);
            files = getFilesNames(directory);
        } catch(Exception e) {
            System.out.println("Error reading directory.");
            System.exit(-1);
        }
        return files;
    }

    @Override
    public int mkdir(String path) throws RemoteException {
        if (new File(path).mkdirs()) {
            return 0;
        };
        return -1;
    }

    @Override
    public int create(String path) throws RemoteException {
        try {
            if (new File(path).createNewFile()) {
                return 0;
            }
            return -1;
        } catch(IOException e) {
            return -2;
        }
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

    private String[] getFilesNames(File directory) {
        File[] files = directory.listFiles();
        List<String> filesNames = new ArrayList<>();
        for (File file : files) {
            if (file.isFile()) {
                filesNames.add(file.getName());
            }
        }
        return filesNames.toArray(new String[0]);
    }
}
