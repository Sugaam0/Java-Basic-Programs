// package ExceptionHandling;
// import java.util.*;

// class SemesterException extends Exception   
//     {
//             public SemesterException(String msg)
//                 {
//                     super(msg);
//                 }
//     }
// class Student 
//     {
//         String name;
//         int sem;

//         public Student(String name, int sem) throws SemesterException
//             {
//                 if(sem < 1 || sem >8)
//                     {
//                         throw new SemesterException("Invalid semester");
//                     }
//                 this.name = name;
//                 this.sem=sem;
//             }
//     }



// public class customException {
//         public static void main(String[] args) {
//             try 
//                 {
//                     Student s = new Student("ABC", 5);
//                 }
//             catch(SemesterException e)
//                 {
//                     System.out.println(e.getMessage());
//                 }
//         }
// }


