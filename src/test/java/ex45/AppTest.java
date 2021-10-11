package ex45;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
        String comparing = "dxvxsxbxlxty";

        String toCompare = "divisibility";

        Assertions.assertEquals(comparing, App.replacer(toCompare, "i","x"));
    }
}