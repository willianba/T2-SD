import java.rmi.Naming;

public class FSClient {
    private static FSInterface fileService;

    public static void main(String[] argv) {
        try {
            fileService = (FSInterface) Naming.lookup("//localhost/FileService");
            ServiceProperties result = new FSExecutor(fileService).execute(argv[0], argv);
            ResultPrinter printer = ResultPrinter.getInstance();
            printer.showResult(result);
        } catch (Exception e) {
            System.out.println("FSClient failed.");
        }
    }

}
