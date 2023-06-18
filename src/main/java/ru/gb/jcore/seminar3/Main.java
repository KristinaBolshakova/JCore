//Опишите класс руководителя, наследник от сотрудника.
//Перенесите статический метод повышения зарплаты (сделать статическим) в класс руководителя,
// модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
// В основной программе создайте руководителя и поместите его в общий массив сотрудников.
// Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
//
// Сделать компараторы для Сотрудников на основе ЗП и Возраста

package main.java.ru.gb.jcore.seminar3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Employee employee1 = new Director("Andrew", "Andreev","Andreevich", "Director", "2222222", 50000, 32);
        Employee employee2 = new Employee("Dmitriy", "Dmitriev","Dmitrievich", "Manager", "3333333", 40000, 46);
        Employee employee3 = new Employee("Artem", "Ertemov","Artemovich", "Manager", "5555555", 40000, 52);
        Employee employee4 = new Employee("Ivan", "Ivanov","Ivanovich", "Manager", "4444444", 40000, 30);
        Employee employee5 = new Employee("Oleg", "Olgov","Olegovich", "Secretary", "8888888", 30000, 35);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        Director.salaryUp(employees);

        EmployeeComparator myEmployeeComporator = new EmployeeComparator();
        employees.sort(myEmployeeComporator);

        for (Employee employee : employees){
            employee.printInfo();
        }

    }




}
