package src.Strategy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile implements Strategy<Byte[]> {
    @Override
    public Byte[] execute(String path) {
        try {
            Path newPath = Paths.get(path);
            return getObject(Files.readAllBytes(newPath));
        } catch (IOException | SecurityException | OutOfMemoryError e) {
            return null;
        }
    }

    @Override
    public Byte[] execute(byte[] data, String path) {
        return null;
    }

    private Byte[] getObject(byte[] data) {
        int index = 0;
        Byte[] objectData = new Byte[data.length];
        for (byte dataValue : data) {
            objectData[index++] = dataValue;
        }
        return objectData;
    }
}
