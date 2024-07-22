package Sort;

public class InsertionSort {
    public InsertionSort(int []arr){
        int size = arr.length;
        for(int i = 1; i < size; i++){
            int j=i-1;
            while(j>=0){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j] ;
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }else{
                    break;
                }
                j--;
            }
        }
        System.out.println("Printing Sorted Array");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
