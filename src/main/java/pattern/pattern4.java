// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {

    public static void pattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}