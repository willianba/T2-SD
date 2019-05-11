package src.Client;

import src.Helpers.ByteArrayConverter;
import java.nio.charset.StandardCharsets;

class ResultPrinter {
    private static ResultPrinter instance;

    private ResultPrinter() {
    }

    static ResultPrinter getInstance() {
        if (instance == null) {
            instance = new ResultPrinter();
        }
        return instance;
    }

    <T> void showResult(T result) {
        if (result instanceof String[]) {
             for (String file : (String[]) result) {
                 System.out.println(file);
             }
        } else if (result instanceof Byte[]) {
            byte[] bytesData = ByteArrayConverter.getInstance().convertToPrimitive((Byte[]) result);
            System.out.println(new String(bytesData, StandardCharsets.UTF_8));
        } else {
            System.out.println("Done. Status: " + result);
        }
    }
}