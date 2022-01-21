package com.shifr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int key = 7;
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ.,\"\":- ?!;";
        Path path = Path.of("C:\\Users\\Ihor Nikolaiev\\Text for project.txt");
        List<String> list = Files.readAllLines(path);
        for (String s : list) {
            System.out.println(s);
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

