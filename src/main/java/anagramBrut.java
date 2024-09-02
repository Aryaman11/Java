// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Anagrambrut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String X = scan.nextLine();
        String Y = scan.nextLine();
        String result = anagramCheck(X,Y);
        System.out.println(result);
    }

    public static String anagramCheck(String X , String Y){
        char arrA[] = X.toCharArray();
        char arrB[] = Y.toCharArray();
        int aLen = arrA.length;
        int bLen = arrB.length;
        if(aLen == bLen){
            for(int i=0;i<aLen;i++){
            if(arrA[i] != arrB[aLen-i-1]){
                return "No";
            }
        }
        }else{
            return "NO";
        }

        return "Yes";
    }
}