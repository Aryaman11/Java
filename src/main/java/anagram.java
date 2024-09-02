// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();
        String result = anagram(A,B);
        System.out.println(result);

    }
    public static String anagram(String A , String B){
        int demo[] = new int[256];
        for(int i=0;i<A.length();i++){
            demo[A.charAt(i)]++;
            demo[B.charAt(i)]--;
        }
        for(int j=0;j<demo.length;j++){
            if(demo[j] != 0){
                return "NO";
            }
        }
        return "Yes";
    }
}