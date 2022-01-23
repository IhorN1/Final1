package com.shifr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Hi, friend! Please, etner your key and push Enter");
        Scanner a = new Scanner(System.in);
        int key = a.nextInt();
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ.,\"\":- ?!;";
        System.out.println("Friend! Please, input address your file and push Enter");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Path path = Path.of(str);
        List<String> list = Files.readAllLines(path);
        for (String c : list) {
            System.out.println(c);
        }

//
//        while (true){
//            System.out.println("If you want to encrypt? Please press - 1");
//            System.out.println("Enter the key - ");
//            System.out.println("If you want to decrypt? Please press - 2");
//            System.out.println("Enter the key - ");
//            if (1)

        }
    }

