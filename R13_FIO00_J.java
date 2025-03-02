import java.io.*;

public class R13_FIO00_J {
    public static void main(String[] args) {
        String filename = "example.txt";
        writeFileNonCompliant(filename, "Hello, World!");
        writeFile(filename, "Hello, Secure World!");
    }

    public static void writeFileNonCompliant(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            //  writer.close();
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }

    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }
}
