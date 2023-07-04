

package main.java.ru.gb.jcore.Lection5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LectionPractice {

    public LectionPractice() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\Учеба\\GeekBrains\\15 Java Core\\Семинары\\1\\JCore\\src\\main\\java\\ru\\gb\\jcore\\Lection5\\file1.txt");
        File f2 = new File("D:\\Учеба\\GeekBrains\\15 Java Core\\Семинары\\1\\JCore\\src\\main\\java\\ru\\gb\\jcore\\Lection5\\file2.txt");
        File f3 = new File("D:\\Учеба\\GeekBrains\\15 Java Core\\Семинары\\1\\JCore\\src\\main\\java\\ru\\gb\\jcore\\Lection5\\file3.txt");

        String line1 = readFile(f1);
        String line2 = readFile(f2);
        String line3 = line1 + line2;
        System.out.println(line3);

        writeFile(line3, f3);

        String w = "mr";

        findWord(w, f3);
    }

    public static String readFile(File f) throws IOException {
        return new String(Files.readAllBytes(Paths.get(f.getPath())));
    }

    public static void writeFile(String l1, File f) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(l1);
        bw.flush();
        bw.close();
    }

    public static void findWord(String word, File f) throws IOException {
        String l = readFile(f);
        if (l.contains(word)) {
            System.out.println("Word is found");

        } else {
            System.out.println("Word is not found");
        }
    }
}




