class HelloWorld {

    public static void pattern(int N){
        int count = 1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}