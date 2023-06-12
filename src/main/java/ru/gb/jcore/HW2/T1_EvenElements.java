//Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

package main.java.ru.gb.jcore.HW2;

public class T1_EvenElements {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4};
        System.out.println("CountEvens: " + сountEvens(array));
    }

    private static int сountEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                count++;
            }
        }
        return count;
    }
}


//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите длину массива: ");
//        int masSize = input.nextInt();
//        LinkedList<Integer> masList = new LinkedList<>();
//        System.out.print("Введите элементы массива: \n");
//        for(int i = 0; i < masSize; i++){
//            int numElements = input.nextInt();
//            masList.add(numElements);
//        }
//
//        LinkedList<Integer> newList = new LinkedList<>();
//        int count = 0;
//
//        for (int i = 0; i < masList.size(); i++) {
//            if ((i % 2) == 0){
//                newList.add(i);
//                count++;
//            }
//        }
//
//        System.out.println("Количество четных элементов массива: " + count  + "\n" + "Новый массив: " + newList);
//    }
//}
