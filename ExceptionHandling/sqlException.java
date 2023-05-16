package ExceptionHandling;


 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
// Class
public class sqlException {
   
    public static void main(String[] args)
    {
        Connection con=getConnection("javabase","jhon","passMine");
 
    }
   
    public static Connection getConnection(String dbname,String user,String pass)
    {
        Connection con_obj = null;
        String url="jdbc:jhonql://localhost:5432/";
       
      // Try block t ocheck for exceptions
      try {
            con_obj= DriverManager.getConnection(url+dbname,user,pass);
             
        if(con_obj!=null)
            {
                System.out.println("Connection established successfully !");
            }
            else
            {
                System.out.println("Connection failed !!");
            }
        }
            catch(SQLException e)
                {
                    System.out.println(e.getMessage());
                }
        finally
            {
                System.out.println("The try-catch is finished");
            }
       
       
       
        return con_obj;
 
    }
}