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
2. garbage collection
3.security sandbox











         */
    }
}
