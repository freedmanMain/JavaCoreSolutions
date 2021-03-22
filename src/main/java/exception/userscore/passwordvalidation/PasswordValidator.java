package exception.userscore.passwordvalidation;

/**
 * Класс валидатор паролей.
 */

public class PasswordValidator {

    /**
     * Метод проверяет длину введеных паролей,
     * а также сравнивает их по символам.
     */

    public boolean validate(String password, String repeatPassword) {
        if (password.length() < 10 && repeatPassword.length() < 10
                || !password.equals(repeatPassword)) {
            return false;
        }
        return true;
    }
}
