class Main {

    static void pattern(int N) {
        for (int i = 0; i < 2 * N; i++) {
            int star = i;
            if (i > N) {
                star = 2 * N - i;
            }
            for (int j = 0; j <= star - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}