package io;

import java.io.*;

public class FileIO {

    public static void main(String[] args) {


        try {

            String[] name = {"Ishan","Elon","Spring Boot", "Java", "Docker","Jenkins","GitHub","AWS"};

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ACER\\Documents\\output.txt"));
            writer.write("Hello World");
            writer.write("\nI'm Ishan Nikeshala Nawarathna");
            writer.write("\nI'm Software Engineer");

            for (String na : name) {
                writer.write("\n "+na);
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ACER\\Documents\\output.txt"));

            String line;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
