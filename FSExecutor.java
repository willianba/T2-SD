import java.rmi.RemoteException;

public class FSExecutor {
    private FSInterface fileService;
    private Semaphore mutex;
    private final int NO_EXECUTION_VALUE = -3;

    public FSExecutor(FSInterface fileService) {
        this.mutex = new Semaphore(1);
        this.fileService = fileService;
    }

    public ServiceProperties execute(String method, String[] arguments) throws RemoteException {
        this.mutex.acquire();
        ServiceProperties result = this.selectService(method, arguments);
        this.mutex.release();
        return result;
    }

    private ServiceProperties selectService(String method, String[] arguments) throws RemoteException {
        ServiceProperties returnValue = new ServiceProperties();
        switch (method) {
            case "ls":
                returnValue.setFiles(fileService.ls(arguments[1]));
                break;
            case "mkdir":
                returnValue.setStatus(fileService.mkdir(arguments[1]));
                break;
            case "create":
                returnValue.setStatus(fileService.create(arguments[1]));
                break;
            case "unlink":
                returnValue.setStatus(fileService.unlink(arguments[1]));
                break;
            case "write":
                returnValue.setStatus(fileService.write(arguments[1].getBytes(), arguments[2]));
                break;
            case "read":
                returnValue.setText(fileService.read(arguments[1]));
                break;
            default:
                returnValue.setStatus(NO_EXECUTION_VALUE);
                break;
        }
        return returnValue;
    }
}