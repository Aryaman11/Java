// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {

    public static void pattern(int N) {
       for(int i=N;i>0;i--){
          for(int k=i;k<N;k++){
              System.out.print(" ");
          }
           for(int j=0;j<2*i-1;j++){
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