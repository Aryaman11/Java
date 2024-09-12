// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {

    public static void isPrimeCheck(int N){
        Boolean[] isPrime = new Boolean[N+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1]= false;
        for(int i=2;i*i<=N;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=N;j+=i){
                    isPrime[j]=false;
                }
            }
        }

        for(int k=0;k<N;k++){
            if(isPrime[k]){
                System.out.print(k +" ");
            }

        }
    }

    public static void main(String[] args) {
        int N=100;
        isPrimeCheck(N);

    }
}