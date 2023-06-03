package main.java.ru.gb.jcore.regular;



public class Decorator {
    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки с преамбулой 'Результат: '
     * @param res - число, требующее декорации
     * @return Отформатированная строка
     */
    public static String decorate (int res){

        /*
         * Метод декорирует число, добавляя к нему строку
         * при помощи функции форматирования строк
         */
        return String.format("Результат: %d.", res);
    }

}
