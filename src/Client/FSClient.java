package src.Client;

import src.FSInterface;

import java.rmi.Naming;
import java.util.HashMap;
import java.util.Map;

public class FSClient {

    public static void main(String[] argv) {
        Map<String, Object> map = new HashMap<>();

        try {
            FSInterface fileService = (FSInterface) Naming.lookup(String.format("//%s/FileService", argv[0]));
            map.put("ls", fileService.ls(path));
            mediator.execute('ls', 'path');
            ResultPrinter printer = ResultPrinter.getInstance();
            printer.showResult(result);
        } catch (Exception e) {
            System.out.println("Client.FSClient failed.");
        }
    }
}
