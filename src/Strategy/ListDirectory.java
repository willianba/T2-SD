package src.Strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListDirectory implements Strategy<String[]> {
    @Override
    public String[] execute(String path) {
        String[] files;
        try {
            File directory = new File(path);
            files = getFilesNames(directory);
        } catch (Exception e) {
            return null;
        }
        return files;
    }

    @Override
    public String[] execute(byte[] data, String path) {
        return null;
    }

    private String[] getFilesNames(File directory) {
        File[] files = directory.listFiles();
        List<String> filesNames = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                filesNames.add(file.getName());
            }
        }
        return filesNames.toArray(new String[0]);
    }
}
