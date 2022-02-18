package com.WinstonStatue;
//imports for writing to a file
import java.io.PrintWriter;
import java.io.FileOutputStream;

//imports for reading a file
import java.util.Scanner;
import java.io.FileInputStream;

//IO exception, probably shouldn't matter on the competition
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
        //output variables
	    FileOutputStream outputStream = new FileOutputStream("gaming.txt");
        PrintWriter fileOut = new PrintWriter(outputStream);

        //prints a line to gaming.txt then closes it
        fileOut.println("Hello world");
        fileOut.close();

        //input variables
        FileInputStream inputStream = new FileInputStream("laming.txt");
        Scanner fileIn = new Scanner(inputStream);

        //while laming.txt has another line, it prints it out
        while(fileIn.hasNextLine()) {
            System.out.println(fileIn.nextLine());
        }
        //closes fileIn
        fileIn.close();

    }
}
