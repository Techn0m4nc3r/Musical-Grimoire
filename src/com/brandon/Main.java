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

    public static void menu () {
        System.out.println("What would you like to do?\n");
        System.out.println("1. Add an album");
        System.out.println("2. Choose an album");
        System.out.println("3. Quit");
    }

    public static void saveAlbum(String album) {
        System.out.println("Album saved!\n");
    }

}

