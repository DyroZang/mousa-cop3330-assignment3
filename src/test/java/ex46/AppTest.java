package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.io.*;


class AppTest {

    @Test
    void printer() {
        TreeMap<String, String> tests = new TreeMap<String, String>();

        tests.put("banan", "****");
        tests.put("acos", "*************");
        tests.put("dileb", "*");
        tests.put("Gargas", "*******");
        App.printer(tests);

    }
}