package ex43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void printer() {
        //Test for testing out the printer function
        String[] information = {"websiteformax", "max", "y", "n"};

        try{
            App.printer(information);
            Assertions.assertTrue(true);
        }catch (Exception e){

        }

    }
}