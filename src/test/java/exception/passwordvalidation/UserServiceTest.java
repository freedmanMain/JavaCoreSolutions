package exception.passwordvalidation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    User user1 = new User(
            "test@gmail.com",
            "12345678910",
            "12345678910");

    User user2 = new User(
            "test@gmail.com",
            "1234567891011",
            "12345678910");

    UserService service = new UserService();
    PasswordValidator validator = new PasswordValidator();

    @Test
    public void test_user_service_valid_password() {
        assertTrue(validator.validate(user1.getPassword(), user1.getRepeatPassword()));
        assertFalse(validator.validate(user2.getPassword(), user2.getRepeatPassword()));
    }
}