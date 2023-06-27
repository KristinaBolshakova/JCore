package main.java.ru.gb.jcore.s4t1;

public class WrongPasswordException extends Throwable {

    public WrongPasswordException(){

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
