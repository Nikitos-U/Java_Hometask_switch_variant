package ru.sberbank;

import java.io.*;
import java.util.Scanner;

public class Parser {
    private String filename;
    private double price;
    private static String[] data;

    public static String[] parser(String filename) {
        if (!filename.equals("console")) {
            try (FileReader reader = new FileReader(filename)) {
                BufferedReader bufferedReader = new BufferedReader(reader);
                String c;
                int i = 0;
                data = new String[8];
                while (!((data[i] = bufferedReader.readLine()).equals("}"))) {
                    i++;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (data);
        } else {
            try (InputStreamReader input = new InputStreamReader(System.in)) {
                BufferedReader bufferedReader = new BufferedReader(input);
                String c;
                data = new String[8];
                int i = 0;
                while (!((data[i] = bufferedReader.readLine()).equals("}"))) {
                    i++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (data);
        }
    }
}

