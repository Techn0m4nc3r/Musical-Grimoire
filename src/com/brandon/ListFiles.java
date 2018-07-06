package com.brandon;

import java.io.File;


public class ListFiles {

    public static void files() {
        File file = new File("./Album/");
        File[] files = file.listFiles();
        for (File album : files) {
            System.out.println(album.getName());
        }

    }
}
