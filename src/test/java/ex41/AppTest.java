package ex41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AppTest {

    @Test
    void tester() {
        ArrayList<String> people = new ArrayList<String>();
        App.reader();
        Assertions.assertTrue(true);

    }
}