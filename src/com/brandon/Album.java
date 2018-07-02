package com.brandon;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Album {

    public void saveAlbum(String albumName) {
        try {
            File file = new File(albumName);
            FileWriter fileWriter = new FileWriter(file);
//             fileWriter.write("");
//             fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Create a folder called Albums
// Repath it to write to the folder
// Approach 1: have a text doc that keeps track of all albums
// Approach 2: Read each file name inside of the Albums folder
//