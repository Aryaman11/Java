// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {

    public static void pattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 1; j<=N-i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}