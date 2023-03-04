package streams_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pathy {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\.dean");
        System.out.println("isDirectory:: "+Files.isDirectory(path));
        try {
        System.out.println("isHidden:: "+Files.isHidden(path));
        System.out.println("isHidden2"+Files.isHidden(path));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("toString:: "+path.toString());
        System.out.println("getFileSystem:: "+path.getFileSystem()+" "+System.getProperty("file.separator"));

    }
}
