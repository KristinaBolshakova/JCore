package main.java.ru.gb.jcore.seminar3;

import java.util.ArrayList;

public class Director extends Employee {
    public Director(String name, String surname, String patronymic, String position, String phone, int salary, int age) {
        super(name, surname, patronymic, position, phone, salary, age);
    }

    public static void salaryUp(ArrayList<Employee> employees) {
        salaryUp(employees, 45, 5000);
    }

    public static void salaryUp(ArrayList<Employee> employees, int age, int addSalary) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() > age && !(employees.get(i) instanceof Director)) {
                employees.get(i).setSalary(employees.get(i).getSalary() + addSalary);
            }
        }
    }


}
