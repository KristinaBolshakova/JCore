package main.java.ru.gb.jcore.S5t1;

public class Cypher {
    public static String encrypt(String textFile, int shift) {
        textFile = textFile.toLowerCase();
        char[] temp = textFile.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (char) ((int)temp[i] + (shift));
        }
        return new String(temp);
    }

    public static String decrypt(String textFile, int shift) {
        textFile = textFile.toLowerCase();
        char[] temp = textFile.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (char) ((int)temp[i] - (shift));
        }
        return new String(temp);
    }

}
