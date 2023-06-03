package main.java.ru.gb.jcore.sample;

import main.java.ru.gb.jcore.regular.Decorator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static main.java.ru.gb.jcore.regular.OtherClass.opCalc;


/**
 * Основной класс приложения.
 */
public class Main {
    /**
     * Точка входа в приложение
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        /**
         * @param arrayCalc массив, принимающий в себя значения
         * @param newOp измененное действие в примере
         *
         */

        /*
        Ввод данных с клавиатуры и запись в массив, с дальнейшим запросом на изменение действия и расчетом
         */

        ArrayList<Object> arrayCalc = new ArrayList<Object>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        arrayCalc.add(input.nextLine());
        System.out.print("Выберите действие: ");
        arrayCalc.add(input.nextLine());
        System.out.print("Введите второе число: ");
        arrayCalc.add(input.nextLine());


        System.out.println("Желаете изменить действие? y/n");
        String newOp = input.nextLine();
        if(Objects.equals(newOp, "y")){
            System.out.println("Введите другое действие: ");
            arrayCalc.set(1, input.nextLine());

            System.out.println(Decorator.decorate(opCalc(arrayCalc)));
        }
        else {
            System.out.println(Decorator.decorate(opCalc(arrayCalc)));
        }


    }

}
