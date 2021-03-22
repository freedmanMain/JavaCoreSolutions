package exception.userscore.passwordvalidation;

import exception.userscore.passwordvalidation.validationexception.PasswordValidationException;

/**
 * Класс обслуживающий пользователя.
 */

public class UserService {

    /**
     * Метод регистрации пользователя.
     * В нем проверяется валлидность введного пароля.
     * Если пароль не валиден сгенерируется исключение PasswordValidationException()
     * Иначе пользователь будет сохранен.
     */

    public void registerUser(User user) {
        try {
            PasswordValidator validator = new PasswordValidator();
            if (!validator.validate(user.getPassword(), user.getRepeatPassword())) {
                throw new PasswordValidationException("Wrong password!");
            }
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод сохраняет пользователя.
     */

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
