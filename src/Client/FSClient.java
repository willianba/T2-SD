package src.Client;

import src.FSInterface;
import src.Services;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

public class FSClient {
    private static Map<String, Services> map = new HashMap<>();
    private static final int EXCEPT_WRITE_LENGTH = 3;

    public static void main(String[] argv) {
        try {
            populateMap(map);
            FSInterface fileService = (FSInterface) Naming.lookup(String.format("//%s/FileService", argv[0]));
            ResultPrinter.getInstance().showResult(execute(argv, fileService));
        } catch (Exception e) {
            System.out.println("FSClient failed.");
        }
    }

    private static <T> T execute(String[] arguments, FSInterface fileService) throws RemoteException {
        if (arguments.length == EXCEPT_WRITE_LENGTH) {
            return map.get(arguments[1]).execute(arguments[2], fileService);
        }
        return map.get(arguments[1]).execute(arguments[2].getBytes(), arguments[3], fileService);
    }

    private static void populateMap(Map<String, Services> map) {
        for (Services service : Services.values()) {
            map.put(service.getServiceName(), service);
        }
    }
}
