/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.io.File;
import java.util.Arrays;

import com.fasterxml.jackson.databind.*;

public class App {

    final static String PATH = "C:\\Users\\lukes\\Downloads\\package\\messages";

    public static void main(String[] args) {

        File[] directories = new File(PATH).listFiles(File::isDirectory);

        String[] dirnames = new String[directories.length];

        for (int i = 0; i < directories.length; i++) {
            dirnames[i] = directories[i].getAbsolutePath().replace(PATH  + "\\", "");
        }

        

    }
}