// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Bubleasc {
    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 2, 3, 1 };

        int result[] = bubbleSort(arr);
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

    }
}