package app.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import app.main.User;

public class UserTest {
    @Test
    public void userInitialValueZero() {
        User user = new User("Артём", 185, 78);
        assertEquals(0, user.getValue());
    }
}
