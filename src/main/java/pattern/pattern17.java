class Main {

   static void pattern17(int N)
{
    for(int i=1;i<=N;i++){
        int count = 64+N;
        for(int j=1;j<=i;j++){
            System.out.print((char)(count+j-i) + " ");
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