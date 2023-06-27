//Класс «Эмуляция интернет-магазина».
//1. Написать классы покупатель (ФИО, возраст, телефон), товар (название, цена) и
//заказ (объект покупатель, объект товар, целочисленное количество).
//2. Создать массив покупателей (инициализировать 2 элемента), массив товаров
//(инициализировать 5 элементов) и массив заказов (пустой на 5 элементов).
//3. Создать статический метод «совершить покупку» со строковыми параметрами,
//соответствующими полям объекта заказа. Метод должен вернуть объект заказа.
//4. Если в метод передан несуществующий покупатель – метод должен выбросить
//исключение CustomerException, если передан несуществующий товар, метод
//
//должен выбросить исключение ProductException, если было передано отри-
//цательное или слишком больше значение количества (например, 100), метод
//
//должен выбросить исключение AmountException.
//
//5. Вызвать метод совершения покупки несколько раз таким образом, чтобы запол-
//нить массив покупок возвращаемыми значениями. Обработать исключения сле-
//дующим образом (в заданном порядке):
//
//– если был передан неверный товар – вывести в консоль сообщение об ошиб-
//ке, не совершать данную покупку;
//
//– если было передано неверное количество – купить товар в количестве 1;
//– если был передан неверный пользователь – завершить работу приложения
//с исключением.
//
//6. Вывести в консоль итоговое количество совершённых покупок после выполне-
//ния основного кода приложения.

package main.java.ru.gb.jcore.s4t2;

public class Main {

    static Customer[] customers = null;
    static Product[] products = null;

    public static void main(String[] args) {


        customers = new Customer[]{
                new Customer("Ivan", "Semenov", 25, "+79604564444"),
                new Customer("Petr", "Kolosov", 32, "+796045654232")
        };

        products = new Product[]{
                new Product("Milk", 100.5f),
                new Product("Bread", 70.8f),
                new Product("Meat", 1000),
                new Product("Chocolate", 225.6f),
                new Product("Tea", 300),

        };

        Order[] orders = new Order[5];

        String[] phones = {"+79604564444", "+796045654232", "+734556555", "+796045654232", "+79604564444"};
        String[] productTitles = {"Milk", "Water", "Meat", "Tea", "Chocolate"};
        int[] amounts = {4, 5, 101, 0, -1};

        int count =0;
        for (int i = 0; i < 5; i++) {
            try {
                orders[i] = makePurchase(phones[i], productTitles[i], amounts[i]);
                count++;
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            } catch (AmountException e) {
                orders[i] = makePurchase(phones[i], productTitles[i], 1);
                System.out.println("Изменили на 1");
                count++;

            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Количество совершенных покупок: " + count);
    }

    public static Order makePurchase(String phone, String title, int amount) throws CustomerException, ProductException, AmountException {
        Customer customer = null;
        Product product = null;
        for (Customer c : customers) {
            if (c.getPhone().equals(phone)) {
                customer = c;
            }
        }

        for (Product p : products) {
            if (p.getTitle().equals(title)) {
                product = p;
            }
        }
        if (customer == null) {
            throw new CustomerException("Customer not found");
        }

        if (product == null) {
            throw new ProductException("Product not found");
        }

        if ((amount > 100) || (amount < 1)) {
            throw new AmountException("Amount is not correct");
        }
        return new Order(customer, product, amount);
    }
}
