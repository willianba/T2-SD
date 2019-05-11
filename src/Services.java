package src;

import java.rmi.RemoteException;

@SuppressWarnings("unchecked")
public enum Services {
    LS("ls") {
        @Override
        public String[] execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.ls(path);
        }

        @Override
        public <T> T execute(byte[] data, String path, FSInterface fileService) {
            return null;
        }
    },
    MKDIR("mkdir") {
        @Override
        public Integer execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.mkdir(path);
        }

        @Override
        public <T> T execute(byte[] data, String path, FSInterface fileService) {
            return null;
        }
    },
    CREATE("create") {
        @Override
        public Integer execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.create(path);
        }

        @Override
        public <T> T execute(byte[] data, String path, FSInterface fileService) {
            return null;
        }
    },
    UNLINK("unlink") {
        @Override
        public Integer execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.unlink(path);
        }

        @Override
        public <T> T execute(byte[] data, String path, FSInterface fileService) {
            return null;
        }
    },
    WRITE("write") {
        @Override
        public <T> T execute(String path, FSInterface fileService) {
            return null;
        }

        @Override
        public Integer execute(byte[] data, String path, FSInterface fileService) throws RemoteException {
            return fileService.write(data, path);
        }
    },
    READ("read") {
        @Override
        public Byte[] execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.read(path);
        }

        @Override
        public <T> T execute(byte[] data, String path, FSInterface fileService) {
            return null;
        }
    };

    private String serviceName;

    Services(String value) {
        this.serviceName = value;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public abstract <T> T execute(String path, FSInterface fileService) throws RemoteException;
    public abstract <T> T execute(byte[] data, String path, FSInterface fileService) throws RemoteException;
}
