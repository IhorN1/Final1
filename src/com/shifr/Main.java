package com.shifr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ.,\"\":- ?!;";
        char[] charsAlphabet = alphabet.toCharArray();
        System.out.println("Hi, friend! If you want encrypt press 1 and Enter \n" + "If you want crack for key press 2 and Enter \n" + "If you want crack text for method Brute force press 3 and Enter \n" + "If you want crack text for method Cryptostatistic press 4 and Enter");
        Scanner b = new Scanner(System.in);
        int programm = b.nextInt();
//        System.out.println("Friend! Please, choose your key and push Enter");
//        Scanner a = new Scanner(System.in);
//        int keyA = a.nextInt();

        if (programm == 1) {
            System.out.println("Friend! Please, choose your key and push Enter");
            Scanner a = new Scanner(System.in);
            int keyA = a.nextInt();
            int keyB = charsAlphabet.length + keyA;
            System.out.println("Friend! Please, input address your file and push Enter");
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            ArrayList<String> arrayList = new ArrayList<>(Files.readAllLines(Path.of(str)));
            char[] charsArrayList = arrayList.toString().toCharArray();
            char[] result = new char[charsArrayList.length];
            for (int i = 0; i < charsArrayList.length; i++) {
                char charsArray = charsArrayList[i];
                for (int j = 0; j < charsAlphabet.length; j++) {
                    char charsAlp = charsAlphabet[j];
                    if (charsArray == charsAlp) {
                        result[i] = charsAlphabet[(j + keyA) % charsAlphabet.length];
                    }
                }
            }
            System.out.println(new String(result));
            System.out.println("Please, input address your new file and push Enter");
            Scanner sc = new Scanner(System.in);
            String addressNewFile = sc.nextLine();
            Files.createFile(Path.of(addressNewFile));



        } else if (programm == 2) {


        } else ;

//
//        while (true){
//            System.out.println("If you want to encrypt? Please press - 1");
//            System.out.println("Enter the key - ");
//            System.out.println("If you want to decrypt? Please press - 2");
//            System.out.println("Enter the key - ");
//            if (1)

    }
}

