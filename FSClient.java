import java.rmi.Naming;

public class FSClient {
    private static FSInterface fileService;

    public static void main(String[] argv) {
        try {
            fileService = (FSInterface) Naming.lookup(String.format("//%s/FileService", argv[0]));
            ServiceProperties result = new FSExecutor(fileService).execute(argv[1], argv);
            ResultPrinter printer = ResultPrinter.getInstance();
            printer.showResult(result);
        } catch (Exception e) {
            System.out.println("FSClient failed.");
        }
    }

}
