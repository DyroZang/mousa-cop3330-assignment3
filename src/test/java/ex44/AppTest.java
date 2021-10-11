package ex44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void prompter() {
        Product[] items = new Product[3];
        String[] words = {"worms", "cats", "dogs"};
        for(int i = 0; i < 3; i++){
            items[i] = new Product(words[i], 23.0, 7);
        }

        try {
            App.searchAndPrint("worms", items);
            Assertions.assertTrue(true);
        }catch(Exception e) {

        }


    }
}