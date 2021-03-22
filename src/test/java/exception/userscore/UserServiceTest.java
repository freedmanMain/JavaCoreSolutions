package exception.userscore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService obj = new UserService();

    String[] records = new String[]{
            "testEmail@gmail.com:100",
            "user@yahoo.com:1",
            "second-user@gmail.com:20",
            "alice@mail.us:0"
    };

    String correctEmail = "testEmail@gmail.com";
    String incorrectEmail = "alice@mail.us:0_+";

    @Test
    public void test_user_score_if_user_is_found() {
        try {
            assertEquals(100, obj.getUserScore(records,incorrectEmail));
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}