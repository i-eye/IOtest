package com.WinstonStatue;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;
import java.io.FileInputStream;
public class Main {

    public static void main(String[] args) throws IOException {
	    FileOutputStream outputStream;
        PrintWriter fileOut;
        outputStream = new FileOutputStream("gaming.txt");
        fileOut = new PrintWriter(outputStream);

        fileOut.println("Hello world");
        fileOut.close();

        FileInputStream inputStream = new FileInputStream("laming.txt");

        Scanner fileIn = new Scanner(inputStream);
        while(fileIn.hasNextLine()) {
            System.out.println(fileIn.nextLine());
        }

    }
}
