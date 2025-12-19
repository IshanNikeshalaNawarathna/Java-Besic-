package fileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {


    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("C:\\Users\\ACER\\Documents\\output.txt")){

            FileOutputStream fos = new FileOutputStream("C:\\Users\\ACER\\Documents\\print.txt");

            int c;

            while ((c=fis.read())!=-1){
                System.out.print((char)c); // Convert the byte to a character and print it to the console
                fos.write(c); // write the raw byte to the new file
            }
            System.out.println("File copied successfully.");

        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
