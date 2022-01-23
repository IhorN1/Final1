package com.shifr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ.,\"\":- ?!;";
        System.out.println("Hi, friend! If you want encrypt press 1 and Enter \n" + "If you want crack for key press 2 and Enter \n" + "If you want crack text for method Brute force press 3 and Enter \n" + "If you want crack text for method Cryptostatistic press 4 and Enter");
        Scanner b = new Scanner(System.in);
        int programm = b.nextInt();
        System.out.println("Friend! Please, choose your key and push Enter");
        Scanner a = new Scanner(System.in);
        int key = a.nextInt();
        System.out.println("Friend! Please, input address your file and push Enter");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
//        Path path = Path.of(str);
        ArrayList<String> arrayList = new ArrayList<>(Files.readAllLines(Path.of(str)));
        for (String c : arrayList) {
            System.out.println(c);
        }
        if (programm == 1){
            System.out.println();



        } else if (programm == 2){




        } else;

//
//        while (true){
//            System.out.println("If you want to encrypt? Please press - 1");
//            System.out.println("Enter the key - ");
//            System.out.println("If you want to decrypt? Please press - 2");
//            System.out.println("Enter the key - ");
//            if (1)

        }
    }

