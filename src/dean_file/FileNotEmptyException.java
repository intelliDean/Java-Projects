package dean_file;

import java.io.IOException;

public class FileNotEmptyException extends IOException {
    public FileNotEmptyException() {
        super("File Not Empty");
    }
}
