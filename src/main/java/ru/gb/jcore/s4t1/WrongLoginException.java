package main.java.ru.gb.jcore.s4t1;

public class WrongLoginException extends Exception {
    public WrongLoginException(){

    }

    public WrongLoginException(String message) {
        super(message);
    }

}
