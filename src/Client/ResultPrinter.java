package src.Client;

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
        if (result instanceof String) {
            System.out.println("String");
            // need to print files when ls run
            // for (String file : files) {
            //     System.out.println(file);
            // }
        } else if (result instanceof Byte) {
            // need to test this
            System.out.println(new String((byte[]) result, StandardCharsets.UTF_8));
        } else {
            System.out.println("Done. Status: " + result);
        }
    }
}