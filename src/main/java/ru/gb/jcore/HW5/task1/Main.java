//Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup

package main.java.ru.gb.jcore.HW5.task1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        File folder = new File("D:\\Учеба\\GeekBrains\\15 Java Core\\Семинары\\1\\JCore\\src\\main\\java\\ru\\gb\\jcore\\HW5\\task1\\");
        File directory = new File("./backup");

        if (!directory.exists()) {
//            directory.mkdirs();
            Files.createDirectory(Paths.get(directory.getPath()));
            System.out.printf("Папка %s создана. \n", directory);
        } else {
            System.out.printf("Папка с именем %s уже существует. \n", directory);
        }

        for (File file : Objects.requireNonNull(folder.listFiles())) {
            System.out.printf("Файл: %s \n", file.getName());
            if (file.isFile()) {
                try {
                    Files.copy(Paths.get(file.getPath()), Paths.get(directory.getAbsolutePath() + "\\" + file.getName()), StandardCopyOption.REPLACE_EXISTING);
                    System.out.printf("Файл %s скопирован. \n", file.getName());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


