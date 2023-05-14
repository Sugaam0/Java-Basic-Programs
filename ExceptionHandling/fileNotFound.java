package ExceptionHandling;

import java.io.FileInputStream;
import java.io.*;

public class fileNotFound {
    public static void main(String[] args) {

        //check if file is present at desired location or not
        try 
            {
                FileInputStream fileNotFound = new FileInputStream("C:/myfile.txt");
                fileNotFound.close();
            }
        catch(IOException e)
            {
                System.out.println("File not found");
            }
    }
}
