package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //System.out.print(args[1]);
        System.out.println(args[0]);

        ReadWithScanner parser = new ReadWithScanner(args[0]);
        parser.processLineByLine();

        Subset sample = new Subset();

        System.out.println("Done.");


    }






}
