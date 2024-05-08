class BSearch {

    public static void BinarySearch(int Arr[], int target) {
        int start = 0;
        int end = Arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (Arr[middle] == target) {
                System.out.println("Index" + middle);
                return;
            } else if (Arr[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        System.out.println("Element not found ---> ");
    }

    public static void main(String[] args) {
        int Arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        BinarySearch(Arr, 10);
    }
}
