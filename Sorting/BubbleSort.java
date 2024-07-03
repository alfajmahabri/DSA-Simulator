import java.util.*;
public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements to Store");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr,n);
        System.out.println("Sorted Elements");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    static void bubbleSort(int[] arr, int n) {
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[i]>arr[j+1]){
                    temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}