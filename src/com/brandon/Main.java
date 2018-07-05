package com.brandon;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Musical Grimoire!\n");

        while(true) {
            Scanner reader = new Scanner(System.in);
            menu();
            String selection = reader.nextLine();
            if (selection.equals("1")) {
                addAnAlbum();
            } else if (selection.equals("2")) {
                chooseAnAlbum();
            } else if (selection.equals("3")) {
                quit();
            }
        }
    }

    public static void addAnAlbum() {
        System.out.println("Name of album: ");
        Scanner reader = new Scanner(System.in);
        String album = reader.nextLine();
        System.out.println(album);
        saveAlbum(album);
    }

    public static void chooseAnAlbum() {
        System.out.println("Choose an album from the list");
    }

    public static void quit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    public static void menu() {
        System.out.println("============================");
        System.out.println("|   Musical Grimoire       |");
        System.out.println("============================");
        System.out.println("|What would you like to do?|");
        System.out.println("|     1. Add an album      |");
        System.out.println("|     2. Choose an album   |");
        System.out.println("|     3. Exit              |");
        System.out.println("============================");
    }



    public static void saveAlbum(String album) {
      Album test = new Album();
      test.saveAlbum(album);
      System.out.println("Album saved!\n");
   }
}