import java.nio.charset.StandardCharsets;

public class ResultPrinter {
    private static ResultPrinter instance;

    private ResultPrinter() {
    }

    public static ResultPrinter getInstance() {
        if (instance == null) {
            instance = new ResultPrinter();
        }
        return instance;
    }

    public void showResult(ServiceProperties result) {
        String[] files = result.getFiles();
        int status = result.getStatus();
        byte[] text = result.getText();

        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else if (text != null) {
            System.out.println(new String(text, StandardCharsets.UTF_8));
        } else {
            System.out.println("Done. Status: " + status);
        }
    }
}