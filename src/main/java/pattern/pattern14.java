class HelloWorld {

    public static void pattern(int N){
        int count = 65;
        for(int i=N;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}