class Main {

   static void pattern17(int N)
{
    for(int i=0;i<2*N;i++){
        int count =i;

        if(i > N){
            count = 2*N-i;
        }

        for(int j=0;j<2*N;j++){
            if(j<count || 2*N-j <=count){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }

        System.out.println("");
    }
}

    public static void main(String[] args) {

        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 5;
        pattern17(N);
    }
}