import java.io.*;

class code22 {

    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        file.read();
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }
    }
}
