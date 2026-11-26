package p0_JAVA_BASICS.step1_Java_fundamentals.variable_Datatypes;

public class Variable {
    public static void main(String[] args) {
        //1.
        variableBasics();

    }
    //1. declare variables , data types
    static void variableBasics(){
        // declare variables
        int a = 20; // assign 20 on variable a
        int b = 30;
        System.out.println(a+b);

        //Reassignment
        int age = 43;
        age = 49;
        System.out.println("the new age is :" +age);
        // some examples of datatypes
        // int , long , double , float , char , boolean
        // int : value range -2,147,483,648 to 2,147,483,647 , it is most commonly used variables
        System.out.println("int max value : " +Integer.MAX_VALUE);// 2147483647
        System.out.println("int min value : "+Integer.MIN_VALUE ); //  -2147483648
        int marks = 45;
        int counter = 0;
        int flag = 1;

        // long : it is used when value of integers may exceed the range of int
        long population = 5636462634535L; // L add at the end
//        int population1 = 343300;
//        int population2 = 123500;
//        int totalPopulation = population1 * population2; // here the multiplication exceeds it's int range, use long
//        System.out.println("total population is : " +totalPopulation);
        long population1 = 453645L;
        long population2 = 143500L;
        long totalPopulation = population1 * population2;
        System.out.println(("the total population is : " +totalPopulation)); //  65098057500
    }
}
