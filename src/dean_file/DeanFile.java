package dean_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeanFile {
    private final String fileName;
    private final String filePath;
    private static DeanFile instanceOf;
    List<String> contents;

    private DeanFile(String fileName) {
        this.fileName = fileName;
        this.filePath = String.format("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\dean_file\\%s", fileName);
        contents = new ArrayList<>();
    }


    public static DeanFile of(String fileName) {
        if (instanceOf == null) {
            instanceOf = new DeanFile(fileName);
        }
        return instanceOf;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    private void writeToFile(String... words) {
        if (readFromFile().size() < 1) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                for (String line : words) {
                    writer.write(line + "\n");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void updateFile() {
        Scanner input = new Scanner(System.in);
        List<String> lists = new ArrayList<>(1000);

        System.out.println("Enter words and press 'ctrl + D' when done");
            while (input.hasNext()) {
                lists.add(input.nextLine());
            }
        String[] words = lists.toArray(String[] :: new);
        List<String> read = readFromFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String word : words) {
                if (read.contains(word)) {
                    continue;
                }
                read.add(word);
            }
            for (String line : read) {
                writer.write(line + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<String> readFromFile() {
        List<String> wordLines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordLines.add(line);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return wordLines;
    }
    // TODO: 19-Jan-23 write delete method for file,

    public void writeToFile() {
        Scanner input = new Scanner(System.in);
        List<String> lists = new ArrayList<>(1000);
        if (readFromFile().size() < 1) {
            System.out.println("Enter words and press 'ctrl + D' when done");
            while (input.hasNext()) {
                lists.add(input.nextLine());
            }
            String[] words = lists.toArray(String[] :: new);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                for (String line : words) {
                    writer.write(line + "\n");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }



//    public Object[] getInputs() {
//    }
}
