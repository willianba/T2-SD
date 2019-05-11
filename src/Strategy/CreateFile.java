package src.Strategy;

import src.Helpers.ReturnType;

import java.io.File;
import java.io.IOException;

public class CreateFile implements Strategy<Integer> {
    @Override
    public Integer execute(String path) {
        try {
            if (new File(path).createNewFile()) {
                return ReturnType.SUCCESS;
            }
            return ReturnType.ERROR;
        } catch (IOException e) {
            return ReturnType.EXCEPTION;
        }
    }

    @Override
    public Integer execute(byte[] data, String path) {
        return null;
    }
}
