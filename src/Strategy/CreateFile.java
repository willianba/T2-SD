package src.Strategy;

import java.io.File;
import java.io.IOException;

public class CreateFile implements Strategy<Integer> {
    @Override
    public Integer execute(String path) {
        try {
            if (new File(path).createNewFile()) {
                return 0;
            }
            return -1;
        } catch (IOException e) {
            return -2;
        }
    }
}
