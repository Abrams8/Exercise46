package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String path = "C:\\Users\\Abrams\\IdeaProjects\\Ex46";
        File myFile = new File(path);

        System.out.println(myFile.getName());

        showDirectory(myFile);

    }

    private static void showDirectory(File directory) {
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                System.out.println(" " + file.getName());
            }
            if (file.isDirectory()) {
                System.out.println(" " + file.getName());
                System.out.print("  ");
                showDirectory(file);
            }
        }
    }
}
