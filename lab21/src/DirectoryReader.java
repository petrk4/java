import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryReader {
    public static List<String> readDirectory(String path) {
        File directory = new File(path);
        String[] files = directory.list();
        if (files != null) {
            return Arrays.asList(files);
        } else {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\Darya Starikova\\IdeaProjects\\catalog";
        List<String> fileList = readDirectory(directoryPath);

        System.out.println("First 5 elements in the directory:");
        for (int i = 0; i < Math.min(5, fileList.size()); i++) {
            System.out.println(fileList.get(i));
        }
    }
}
