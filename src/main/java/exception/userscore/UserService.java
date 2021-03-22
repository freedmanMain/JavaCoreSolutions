package exception.userscore;

/**
 * Класс обработчик пользователя.
 */

public class UserService {

    /**
     * Метод, который ищет пользователя в БД.
     * Бросает исключение UserNotFoundException(), если такой пользователь не найден.
     */

    public int getUserScore(String[] records, String email) {
        int id = searchEmail(records, email);
        if (id < 0) {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        return parse(records[id]);
    }

    /**
     * Простой линейный поиск по-почте в БД.
     */

    private int searchEmail(String[] source, String key) {
        for (int i = 0; i < source.length; i++) {
            if (source[i].substring(0, source[i].indexOf(":")).equals(key)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Метод парсит цифру в строке в тип Integer.
     */

    private int parse(String parsed) {
        return Integer.parseInt(parsed.substring(parsed.indexOf(":") + 1));
    }
}
