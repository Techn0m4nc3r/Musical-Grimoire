package com.brandon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter an album: ");

            String album = reader.nextLine();
            if (album.equals("1")) {
                functionone();
            } else if (album.equals("2")) {
                functiontwo();
            }

            }


        }

    public static void functionone () {
        System.out.println("called function one");
    }

    public static void functiontwo () {
        System.out.println("called function two");
    }

}

