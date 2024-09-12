class Main {

   static void pattern17(int N)
{
    for(int i=0;i<N;i++){
        for(int j=1;j<=2*N ; j++){
            if(j > N-i && j <= N+i){
               System.out.print(" "); 
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
    for(int i=0;i<N;i++){
        for(int j=1;j<=2*N ; j++){
            if(i+1 >= j || j >= 2*N-i){
               System.out.print("*"); 
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {

        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 5;
        pattern17(N);
    }
}