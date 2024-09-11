class Main {

   static void pattern17(int N)
{
    for(int i=0;i<N;i++){
        int count = 65;
        for(int k=N-i-1;k>0 ; k--){
            System.out.print(" ");
        }
        for(int j=0;j<i || count >=65;j++){
            if(j<i){
                System.out.print((char)count);
                ++count;
            }else{

                System.out.print((char)count);
                --count;
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