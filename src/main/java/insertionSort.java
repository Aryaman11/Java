class HelloWorld {

    public static int[] insertionSort(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j] > key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr; // This line was added to return the sorted array
    }

    public static void main(String[] args) {
        int arr[] = {0,9,8,7,6,5,4,3,2,1};
        int result[] = insertionSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(result[i]);
        }
    }
}
