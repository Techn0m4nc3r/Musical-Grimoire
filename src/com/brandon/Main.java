package com.brandon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Musical Grimoire!\n");
    //   Ask for input until the user selects quit
            while (true) {
            Scanner reader = new Scanner(System.in);
            menu();
            String selection = reader.nextLine();
            if (selection.equals("1")) {
                addanAlbum();
            } else if (selection.equals("2")) {
                chooseanAlbum();
            }
            else if (selection.equals("3")) {
                quit();
            }

            }
}
    public static void addanAlbum () {
        System.out.println("Name of album: ");
        Scanner reader = new Scanner(System.in);
        String album = reader.nextLine();
        System.out.println(album);
        saveAlbum(album);

    }

    public static void chooseanAlbum () {
        System.out.println("Choose an album from the list");
    }

    public static void quit () {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    public static void menu () {
        // Menu Graphics
        System.out.println("============================");
        System.out.println("|   Music Grimoire         |");
        System.out.println("============================");
        System.out.println("|What would you like to do?|");
        System.out.println("|     1. Add an album      |");
        System.out.println("|     2. Choose an album   |");
        System.out.println("|        3. Exit           |");
        System.out.println("============================");
    }

    public static void saveAlbum(String album) {
        System.out.println("Album saved!\n");

    }

}

