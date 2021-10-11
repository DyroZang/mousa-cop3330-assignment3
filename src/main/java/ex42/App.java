/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Mousa
 */



package ex42;

import java.util.*;
import java.io.*;


public class App {

    static void printer(ArrayList<String> info){

        System.out.println("Last      First     Salary\n--------------------------");

        for(String x : info){
            System.out.format("%-10s", x);
            char[] y = x.toCharArray();

            if(Character.isDigit(y[0])){
                System.out.println();
            }
        }
    }

    static void reader(){
        ArrayList<String> info = new ArrayList<String>();

        try(Scanner input = new Scanner(new File("input/exercise42_input.txt")).useDelimiter(",|\\n")){
            while(input.hasNext()){
                info.add(input.next().trim());
            }
        } catch(Exception e){}

        printer(info);
    }


    public static void main(String[] args){
        reader();
    }


}
