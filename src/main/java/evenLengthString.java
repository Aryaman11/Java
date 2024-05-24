// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String test = scan.nextLine();
       for(String s : test.split(" ")){
           if(s.length() % 2 == 0){
               System.out.println(s);
           }
       }

    }
}