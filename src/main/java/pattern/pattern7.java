// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {

    public static void pattern(int N) {
       for(int i=0;i<N;i++){
           for(int k=N-i-1;k>0;k--){
               System.out.print(" ");
           }
           for(int j=2*i+1;j>0;j--){
               System.out.print("*");
       }
       System.out.println("");
       }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}