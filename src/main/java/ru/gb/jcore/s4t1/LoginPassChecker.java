

package main.java.ru.gb.jcore.s4t1;

public class LoginPassChecker {

    private static boolean checker(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() < 20) {
            throw new WrongLoginException("login length is more then 20 symbols");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("password length is more then 20 symbols");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("password and confirmPasswork are not equels");
        }
        return false;
    }
}
