package main.java.ru.gb.jcore.S5t1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWorks {
    public static String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

//    public static String readFile(String fileName) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader(fileName));
//        String line;
//        StringBuilder sb = new StringBuilder();
//        while ((line = reader.readLine()) != null) {
//            sb.append(line);
//        }
//        sb.deleteCharAt(sb.length() - 1);
//        return sb.toString();

    public static void writeFile(String fileName, String textFile) throws IOException {
        try{
            Files.writeString(Path.of(fileName), textFile, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IOException("Try again");
        }

    }
}
