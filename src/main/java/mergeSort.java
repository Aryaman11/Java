// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int arr[],int low,int high){
        if(low < high){
            int mid = (int)((low + high)/2);
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int arr[] , int low , int mid , int high){
        int n1 = mid - low + 1 ;
        int n2 = high - mid ; 
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int x = 0 ; x < n1 ; x++){
            lArr[x] = arr[low+x];
        }

        for(int y=0;y<n2; y++){
            rArr[y]= arr[mid+1+y];
        }

        int i = 0 ; 
        int j = 0 ;
        int k = low ;
        while(i < n1 && j < n2){
            if(lArr[i] < rArr[j]){
                arr[k]=lArr[i];
                i++;
            }else{
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k]=lArr[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k]=arr[j];
            j++;
            k++;
        }
     }
}