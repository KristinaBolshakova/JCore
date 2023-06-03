package main.java.ru.gb.jcore.regular;

import java.util.ArrayList;

public class OtherClass {


    public static int opCalc(ArrayList<Object> arrayList) {
        /*
         * Функция обработки действий (* / + -)
         * @param num1 первое число, введенное пользователем
         * @param num2 первое число, введенное пользователем
         * @param result переменная, куда будет записываться результат действий
         */


        int num1 = Integer.parseInt((String) arrayList.get(0));
        int num2 = Integer.parseInt((String) arrayList.get(2));
        int result = 0;
        switch ((String) arrayList.get(1)) {
            case "*":
                result = mul(num1, num2);
                arrayList.add(result);
                break;

            case "/":
                result = div(num1, num2);
                arrayList.add(result);
                break;

            case "+":
                result = sum(num1, num2);
                arrayList.add(result);
                break;

            case "-":
                result = sub(num1, num2);
                arrayList.add(result);
                break;

        }
        return result;
    }

    /**
     * Функция суммирования двух целых чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b, без проверки на переполнение переменной.
     */
    public static int sum(int a, int b) {
        return a + b;
    }
    /**
     * Функция вычитания двух целых чисел
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b, без проверки на переполнение переменной.
     * */
    public static int sub(int a, int b) {
        return a - b;
    }
    /**
     * Функция произведения двух целых чисел
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b, без проверки на переполнение переменной.
     * */
    public static int mul(int a, int b) {
        return a * b;

    }
    /**
     * Функция деления двух целых чисел
     *
     * @param a делимое
     * @param b делитель
     * @return частное a и b, с проверкой деления на 0.
     * */
    public static int div(int a, int b) {
        if (b != 0) {
            return a / b;

        } else {
            System.out.println("На ноль делить нельзя!");
        }

        return a;
    }
}
