class HelloWorld {

    public static void pattern(int N){

        for(int i=65;i<65+N;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)j);

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}