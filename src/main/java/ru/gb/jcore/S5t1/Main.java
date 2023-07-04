package main.java.ru.gb.jcore.S5t1;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String file1 = "D:\\Учеба\\GeekBrains\\15 Java Core\\Семинары\\1\\JCore\\src\\main\\java\\ru\\gb\\jcore\\S5t1\\file1.txt";
        String file2 = "D:\\Учеба\\GeekBrains\\15 Java Core\\Семинары\\1\\JCore\\src\\main\\java\\ru\\gb\\jcore\\S5t1\\Encryptor.txt";
        String file3 = "D:\\Учеба\\GeekBrains\\15 Java Core\\Семинары\\1\\JCore\\src\\main\\java\\ru\\gb\\jcore\\S5t1\\Decryptor.txt";

        String contents = FileWorks.readFile(file1);
        System.out.println("Source text: " + contents);

        String encryptText = Cypher.encrypt(contents, 3);

        FileWorks.writeFile(file2, encryptText);
        System.out.println("Encrypted text: " + encryptText);
        System.out.println("The text is written to a file Encryptor.txt");

        String decryptText = Cypher.decrypt(encryptText, 3);
        FileWorks.writeFile(file3, decryptText);
        System.out.println("Decrypt text: " + decryptText);
        System.out.println("The text is written to a file Decryptor.txt");
    }
}

