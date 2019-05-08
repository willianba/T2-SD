import java.rmi.Naming;

public class FSClient {
    private static FSInterface fileService;

    public static void main(String[] argv) {
        try {
            fileService = (FSInterface) Naming.lookup ("//localhost/FileService");
            // need to implements methods calls here
        } catch (Exception e) {
            System.out.println ("FSClient failed:");
            e.printStackTrace();
        }
    }
}
