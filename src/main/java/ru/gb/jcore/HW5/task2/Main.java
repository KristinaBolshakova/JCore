//Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
// и представляют собой, например, состояния ячеек поля для игры в крестики-нолики,
// где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
// Такое предположение позволит хранить в одном числе типа int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.

package main.java.ru.gb.jcore.HW5.task2;

import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {


        int[] arr = {111, 222, 333};
        int[] array = new int[3];
        byte[] barr = new byte[3];

        for (int i = 0; i < arr.length; i++) {
            array[i] = convInt(arr[i]);
        }
        for (int j = 0; j < array.length; j++) {
            barr[j] = (byte) array[j];
        }
        try (FileOutputStream fos = new FileOutputStream("HW5T2.txt")){
            fos.write(barr);
        }
        File file = new File("HW5T2.txt");
        System.out.println(file.length());
    }
    public static int convInt(int num){
        return Integer.parseInt(String.valueOf((int) (num / 100 * Math.pow(4, 2) + num / 10 % 10 * Math.pow(4, 1) + num % 10 * Math.pow(4, 0))));
    }
}



