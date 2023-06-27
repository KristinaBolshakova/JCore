//Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//В основном классе программы необходимо по-разному обработать исключения.
//Метод возвращает true, если значения верны или false в другом случае.

package main.java.ru.gb.jcore.s4t1;

import java.util.Scanner;

public class Logic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter login: ");
        String login = input.nextLine();
        System.out.println("Enter password: ");
        String  password = input.nextLine();
        System.out.println("Enter confirmPassword: ");
        String confirmPassword = input.nextLine();



    }
}
