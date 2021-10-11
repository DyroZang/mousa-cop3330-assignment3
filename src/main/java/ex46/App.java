/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Mousa
 */


package ex46;

import java.util.*;
import java.io.*;

public class App {


    static void printer(TreeMap<String, String> words) {
        ArrayList<String> asts = new ArrayList<>();

        for(String i : words.keySet()){
            asts.add(words.get(i));
        }
        Collections.sort(asts);
        Collections.reverse(asts);
        for(String i : asts){
            for(String x : words.keySet()){
                if(i == words.get(x)){
                    System.out.format("%-10s %s\n", x + ":", words.get(x));
                }
            }
        }

    }

    static TreeMap<String, String> readWords() {
        TreeMap<String, String> words = new TreeMap<>();

        try(Scanner input = new Scanner(new File("input/exercise46_input.txt"))){

            while(input.hasNext()){
                String next = input.next();
                try{
                    if(words.get(next) == null){
                        throw new Exception();
                    }
                    words.replace(next, words.get(next), words.get(next) + "*");
                }catch(Exception e){
                    words.put(next, "*");
                }
            }

        }catch(FileNotFoundException ignored){

        }


        return words;
    }

    public static void main(String[] args){
        TreeMap<String, String> words = readWords();

        printer(words);

    }
}
