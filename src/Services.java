package src;

import java.rmi.RemoteException;

public enum Services {
    LS {
        @Override
        public String[] execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.ls(path);
        }

        @Override
        public <T> T execute(String path, byte[] data, FSInterface fileService) {
            return null;
        }
    },
    MKDIR {
        @Override
        public Integer execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.mkdir(path);
        }

        @Override
        public <T> T execute(String path, byte[] data, FSInterface fileService) {
            return null;
        }
    },
    CREATE {
        @Override
        public Integer execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.create(path);
        }

        @Override
        public <T> T execute(String path, byte[] data, FSInterface fileService) {
            return null;
        }
    },
    UNLINK {
        @Override
        public Integer execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.unlink(path);
        }

        @Override
        public <T> T execute(String path, byte[] data, FSInterface fileService) {
            return null;
        }
    },
    WRITE {
        @Override
        public <T> T execute(String path, FSInterface fileService) {
            return null;
        }

        @Override
        public Integer execute(String path, byte[] data, FSInterface fileService) throws RemoteException {
            return fileService.write(path, data);
        }
    },
    READ {
        @Override
        public Byte[] execute(String path, FSInterface fileService) throws RemoteException {
            return fileService.read(path);
        }

        @Override
        public <T> T execute(String path, byte[] data, FSInterface fileService) {
            return null;
        }
    };

    public abstract <T> T execute(String path, FSInterface fileService) throws RemoteException;
    public abstract <T> T execute(String path, byte[] data, FSInterface fileService) throws RemoteException;
}
