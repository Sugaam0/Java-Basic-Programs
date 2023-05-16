package FileHandling;
import java.io.*;
// import java.util.*;

public class writeIntoFile {
        public static void main(String[] args) {
            try 
                {
                
            String msg = "My Name is sugam";
        FileOutputStream fos= new FileOutputStream("sample.txt");
            byte[] b = msg.getBytes();

           fos.write(b);
            fos.close();
                }
                catch(IOException e)
                    {
                        System.out.println(e.getMessage());
                    }

        }
}
