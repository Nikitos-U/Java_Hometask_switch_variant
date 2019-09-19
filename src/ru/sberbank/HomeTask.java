package ru.sberbank;

import java.io.*;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner (System.in);
        String filename = scanner.nextLine();
        Parser input = new Parser();
        String [] inputdata = new String[7];
        inputdata = input.parser(filename);
        String Tradetype = inputdata[2].split("=")[1];
        Double price = Double.parseDouble(inputdata[4].split("=")[1]);
        switch (Tradetype){
            case "BOND" :
                BOND trade1 = new BOND(price);
                System.out.println(Tradetype);
                trade1.print();
                break;
            case "COMMODITY_SPOT" :
                COMMODITY_SPOT trade2 = new COMMODITY_SPOT(price);
                System.out.println(Tradetype);
                trade2.print();
                break;
            case "FX_SPOT" :
                FX_SPOT trade3 = new FX_SPOT(price);
                System.out.println(Tradetype);
                trade3.print();
                break;
            case "IR_SWAP" :
                IR_SWAP trade4 = new IR_SWAP(price);
                System.out.println(Tradetype);
                trade4.print();
                break;
        }
    }
}
