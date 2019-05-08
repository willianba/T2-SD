import java.rmi.Naming;

public class FSClient {
    private static FSInterface fileService;

    public static void main(String[] argv) {
        try {
            fileService = (FSInterface) Naming.lookup ("//localhost/FileService");
        } catch (Exception e) {
            System.out.println ("FSClient failed.");
        }
    }
}
