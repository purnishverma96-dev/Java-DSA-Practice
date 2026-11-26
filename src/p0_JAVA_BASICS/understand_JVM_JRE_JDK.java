package p0_JAVA_BASICS;

public class understand_JVM_JRE_JDK {
    public static void main(String[] args) {
        /*
 Q1. UNDERSTAND COMPILER AND INTERPRETER
 ANS-->  a compiler is just a software , that converts source code(code which written by programmers or high level language)
 into a low level languages(like bytecode , machine code , assembly) so that computer can execute, similarly INTERPRETER
 do the same work as compiler do , BOTH HAVE DIFFERENT WAY OF COMPILATION PROCESS
 // COMPILER -> compiler reads the entire source code file and convert into machine code , so firstly read entire source.
 examples: c and c++
 then converts
 // INTERPRETER -> it convert the source code into machine code line by line , reads the code line by line , translates it
 and run immediately before moving to the next line. examples - python

 COOL FACT : java uses the both process COMPILATION + INTERPRETATION(but with the time it becomes very close to cpp compilation speed )
 //Q2.  Why Java Uses BOTH (Hybrid Model)
 java is not purely compiled nor purely interpreted language, it uses both process
step 1 : when javac compiler compiles the entire source code file(.JAVA FILE) and converts into bytecode --compilation process
step 2 : HERE JVM PLAYS BIG ROLE : JVM USES A HYBRID ENGINE MODEL FOR CONVERTING THESE BYTECODE INTO MACHINE CODE
->it uses both an interpreter and a JIT COMPILER(just in time compiler)
->INTERPRETER : It interprets less frequent used codes line by line and convert into machine code
->JIT COMPILER : it compiles the entire most frequent used codes(likes loops , methods) into machine code that saves
reused execution
//NOTES :EVEN JVM PROVIDES SOME MORE FUNCTIONALITIES LIKE
1. interpreter + jit compiler
2. manage memory and garbage collection
3.security(using sandbox model)

//Q3. UNDERSTAND JVM(JAVA VIRTUAL MACHINE) , JRE(JAVA RUNTIME ENVIRONMENT) , JDK(JAVA DEVELOPMENT KIT)
// JVM -> SO , it is basically converts bytecode into machine code and provides some more functionalities like Interpreter+
jit compiler , garbage collection , security etc. FACT : REMEMBER jvm is platform dependent ,and java bytecode is platform
independent
// JRE --> JRE BASICALLY  provides an environments for running a java application
              JRE = JVM + Java Class Libraries
here ,class Libraries : it means there are some pre-written internal function provided by java eg:  System.out.print() or I/O
operations--> in real world java applications developments it rely on internal java libraries
// JDK --> it  provides Development Tools required to develop , compile and run java programs
          JDK = JRE + Development Tools (Compiler, Debugger, Javadocs)
it contains : JRE , javac compiler , debugging and other development tools that required to build and run java applications
so for running java programs we had to install jdk in our computer







         */
    }
}
