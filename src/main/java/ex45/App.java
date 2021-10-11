/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Mousa
 */


package ex45;
import java.util.*;
import java.io.*;

public class App {

    static void newFiler(String text){
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to name the new file?");
        String outputFile = input.next();

        try(PrintStream out = new PrintStream(new File("output/" + outputFile + ".txt"))){
            System.setOut(out);
            System.out.format(text);
        }catch(Exception e){

        }
    }

    static String readFile(){
        String paragraph = ""; 
        
        try(Scanner input = new Scanner(new File("input/exercise45_input.txt"))){
            while(input.hasNextLine()){
                paragraph = paragraph + input.nextLine() + "\n";
            }
        }catch(Exception e){
            
        }

        return paragraph;
    }

    static String replacer(String text, String replacing, String replacer){
        return text.replace(replacing, replacer);
    }
    
    public static void main(String[] args){
        
        String text = readFile();

        text = replacer(text, "utilize", "use");

        newFiler(text);
    }
}
