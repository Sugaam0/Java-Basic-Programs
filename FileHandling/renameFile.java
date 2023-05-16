package FileHandling;


import java.io.*;

public class renameFile {
        public static void main(String[] args) {
            File name = new File("path/hello.txt");

            File rename = new File ("path/metroNames.txt");

            boolean flag = name.renameTo(rename);

            if(flag == true)
                {
                    System.out.println("File renamed Succesfully");
                }
            else    
                {
                    System.out.println("Error Occured");
                }
        }
}
