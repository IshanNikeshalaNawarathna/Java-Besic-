package fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

    public static void main(String[] args) {

        String name = "Hello World, I'm Ishan Nikeshala Nawarathna";

        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\ACER\\Documents\\print.txt")){

            fos.write(name.getBytes());

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
