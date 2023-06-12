//Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.

package main.java.ru.gb.jcore.HW2;

public class T2_DefElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println("Разница между самым большим и самым маленьким элементами =  " + defEvens(array));
    }

    private static int defEvens(int[] array) {
        int min = array[0];
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            else if (array[i] > max){
                max = array[i];
            }
        }
        return max - min;
    }
}
