class Main {

    static void pattern11(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j % 2);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern11(N);
    }
}