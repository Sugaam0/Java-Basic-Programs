package FileHandling;


import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class createFIle {
    public static void main(String[] args) {
        createFIle file = new createFIle();
        file.newFile();
    }
    //function to make a new file 
public void newFile()
    {
        String strpath = "";
        String strName = "";

        try 
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the file name : ");
                strName = br.readLine();

                System.out.println("ENter the file path ");
                strpath = br.readLine();

                File file1 = new File(strpath + " " + strName + ".txt");
                file1.createNewFile();
            }
        catch(Exception e)
            {
                System.out.println("Exception encountered");
            }
    }
}
