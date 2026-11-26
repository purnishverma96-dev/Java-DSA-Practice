// we will understand some basic of java program structures

//1. always mention the package, by default IntelliJ provides automatically
package p0_JAVA_BASICS.step1_Java_fundamentals.UnderstandJavaProgStructure;

//2. import statement->
import java.util.Scanner;
import  java.util.Arrays;

//3 class declaration
//RULE :if the class name is public declared, then it's name  must be same as the java file name
// a single .java file can contain multiples classes , except of one public declared class
public class Demo {

    //4. The Entry Point
    public static void main(String[] args) {
        System.out.println("write our first program");
        /*
         public static void main(String[] args)
         public(access modifier) : jvm can access this main method to stat the program , that's why it is initialized with public
         static(memory binding) : jvm can call this method main without creating an object of the class Demo
         void(return type) : this main method does not return anything
         main(): this is the name of the method
         String[] args(command line argument) : An array of strings used to receive command-line arguments.


      */
    }
}
