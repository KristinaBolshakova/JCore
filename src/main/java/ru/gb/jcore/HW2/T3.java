//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

package main.java.ru.gb.jcore.HW2;

public class T3 {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4, 0, 0};
        System.out.println(trueNullElem(array));
    }

    public static boolean trueNullElem(int[] array) {
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] == 0) && (array[i + 1] == 0)) {
                flag = true;
            }
        }

        return flag;
    }
}
