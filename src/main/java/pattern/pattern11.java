// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {

    public static void pattern(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=2*N;j++){
                if(i >= j){
                    System.out.print(j);
                }
                else if(j > N && 2*N -i < j ){
                    System.out.print(2*N-j+1);
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}