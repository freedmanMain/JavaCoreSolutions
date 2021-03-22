package exception.userscore;

/**
 * Пользовательское исключение, генерируется,
 * если пользователь не найден в БД или другом хранилище (массиве или списке).
 * */

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
