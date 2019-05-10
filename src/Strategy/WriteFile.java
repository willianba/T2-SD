package src.Strategy;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile implements Strategy<Integer> {
    @Override
    public Integer execute(String path) {
        return null;
    }

    @Override
    public Integer execute(byte[] data, String path) {
        try (FileOutputStream stream = new FileOutputStream(path)) {
            stream.write(data);
            return 0;
        } catch (IOException e) {
            return -2;
        }
    }
}
