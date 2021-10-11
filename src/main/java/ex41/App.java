/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Mousa
 */


package ex41;

import java.util.*;
import java.io.*;

public class App {


    static ArrayList<String> sorter(ArrayList<String> people){
        Collections.sort(people);
        printer(people);
        return people;
    }

    static void reader(){
        ArrayList<String> people = new ArrayList<String>();

        try(Scanner input = new Scanner(new File("input/exercise41_input.txt"))){
            while(input.hasNextLine()){
                people.add(input.nextLine());
            }
        } catch(Exception e){

        }
        sorter(people);
    }


    static void printer(ArrayList<String> people){
        try(PrintStream output = new PrintStream(new File("output/exercise41_output.txt"))){
            System.setOut(output);
            System.out.format("Total of %d names\n", people.size());
            System.out.format("-------------------------\n");
            for(String x : people){
                System.out.println(x);
            }
        }catch(Exception e){}

    }

    public static void main(String[] args){
        reader();
    }

}
