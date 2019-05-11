package src.Strategy;

import src.Helpers.ReturnType;

import java.io.File;

public class CreateDirectory implements Strategy<Integer> {
    @Override
    public Integer execute(String path) {
        if (new File(path).mkdirs()) {
            return ReturnType.SUCCESS;
        }
        return ReturnType.ERROR;
    }

    @Override
    public Integer execute(byte[] data, String path) {
        return null;
    }
}