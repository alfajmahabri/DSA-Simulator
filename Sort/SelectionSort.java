package Sort;
public class SelectionSort {
    public SelectionSort(int []arr){
        int size= arr.length;
        for(int i=0;i<size;i++){
            int min_index = i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Printing Selection Sort");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
