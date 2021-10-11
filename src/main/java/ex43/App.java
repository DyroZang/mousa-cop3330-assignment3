/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Mousa
 */


package ex43;
import java.io.*;
import java.util.*;


public class App {

    static void printer(String[] info) {

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.format("Created ./website/%s", info[0]);
        System.out.format("\nCreated ./website/%s/index.html", info[0]);
        if(info[2].equals("y")){
            System.out.format("\nCreated ./website/%s/js", info[0]);
        }
        if(info[3].equals("y")){
            System.out.format("\nCreated ./website/%s/css", info[0]);
        }
    }

    static void establishFiles(String[] info){

        new File("website/" + info[0]).mkdir();
        try(PrintStream file = new PrintStream("website/" + info[0] + "/index.html")){
            System.setOut(file);
            System.out.format("<!DOCTYPE html>\n<html>\n<head>\n<title>%s</title>\n<meta name=\"author\" content=\"%s\">\n</head>\n<body>\n</body>\n</html>",info[0], info[1]);

        }catch(Exception e){

        }

        if(info[2].equals("y")){
            new File("website/" + info[0] + "/js").mkdir();
        }
        if(info[3].equals("y")){
            new File("website/" + info[0] + "/css").mkdir();
        }

        printer(info);
    }

    static String[] prompter(String[] info){

        Scanner input = new Scanner(System.in);
        System.out.format("Site Name: ");
        info[0] = input.nextLine();
        System.out.format("Author: ");
        info[1] = input.nextLine();
        System.out.format("Do you want a folder for JavaScript? ");
        info[2] = input.nextLine();
        System.out.format("Do you want a folder for CSS? ");
        info[3] = input.nextLine();

        input.close();
        return info;
    }


    public static void main(String[] args){
        new File("website").mkdir();

        String[] info = new String[4];
        info = prompter(info);

        establishFiles(info);
    }
}
