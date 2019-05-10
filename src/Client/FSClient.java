package src.Client;

import src.FSInterface;
import src.Services;

import java.rmi.Naming;
import java.util.HashMap;
import java.util.Map;

public class FSClient {

    public static <T> void main(String[] argv) {
        Map<String, Services> map = new HashMap<>();
        populateMap(map);
        try {
            FSInterface fileService = (FSInterface) Naming.lookup(String.format("//%s/FileService", argv[0]));
            // need to fix this if client calls write. need to pass argv[3]
            T result = map.get(argv[1]).execute(argv[2], fileService);
            ResultPrinter printer = ResultPrinter.getInstance();
            printer.showResult(result);
        } catch (Exception e) {
            System.out.println("Client.FSClient failed.");
            e.printStackTrace();
        }
    }

    private static void populateMap(Map<String, Services> map) {
        map.put("ls", Services.LS);
        map.put("mkdir", Services.MKDIR);
        map.put("create", Services.CREATE);
        map.put("unlink", Services.UNLINK);
        map.put("write", Services.WRITE);
        map.put("read", Services.READ);
    }
}
