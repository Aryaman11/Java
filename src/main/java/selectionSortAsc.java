// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int[] selectionSort(int[] arr){
        int len = arr.length;
        for(int i =0 ; i<len-1; i++){
            int minIndex = i;
            for(int k=i+1;k<len;k++){
                if(arr[minIndex] > arr[k]){
                    minIndex = k;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int result[] = selectionSort(arr);
        for(int j=0 ; j<arr.length ; j++){
            System.out.println(result[j]);
        }

    }
}