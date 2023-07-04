package main.java.ru.gb.jcore.Lection4;

public class LectionExample {
    public static void main(String[] args){
       long timeStart = System.nanoTime();

       String s = "Example";
       for (int i = 0; i < 200_000; i++) {
           s = s + i;
       }
       double deltaTime = (System.nanoTime() - timeStart) * 0.000000001;
       System.out.println("Delta time (sec): " + deltaTime);

        timeStart = System.nanoTime();
        StringBuilder sb = new StringBuilder("Example");
        for (int i = 0; i < 200_000; i++) {
            sb.append(i);
        }

        deltaTime = (System.nanoTime() - timeStart) * 0.000000001;
        System.out.println("Delta time (sec): " + deltaTime);

        System.out.println(s.equals(sb.toString()));

    }
}
