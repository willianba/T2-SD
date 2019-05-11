package src.Strategy;

import src.Helpers.ReturnType;

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
            return ReturnType.SUCCESS;
        } catch (IOException e) {
            return ReturnType.EXCEPTION;
        }
    }
}
