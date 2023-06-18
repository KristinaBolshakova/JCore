//1. Создать класс ”Сотрудник” с полями: ФИО, должность, телефон, зарплата, возраст;
//2.  Написать функцию выводящую всю доступную информацию об объекте или вывод с форматированием

package main.java.ru.gb.jcore.seminar3;

public class Employee implements Comparable<Employee>{

    String name;
    String surname;
    String patronymic;
    String position;
    String phone;
    int salary;
    int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String surname, String patronymic, String position, String phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(
                "Имя: " + name + "\n" +
                "Фамилия: " + surname + "\n" +
                "Отчество: " + patronymic + "\n" +
                "Должность: " + position + "\n" +
                "Телефон: " + phone + "\n" +
                "Зарплата: " + salary + "\n" +
                "Возраст: " + age + "\n"); ;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getSalary() - o.getSalary();
    }
}
