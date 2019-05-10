package src.Strategy;

import java.io.File;

public class CreateDirectory implements Strategy<Integer> {
    @Override
    public Integer execute(String path) {
        if (new File(path).mkdirs()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Integer execute(byte[] data, String path) {
        return null;
    }
}