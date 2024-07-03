import java.util.*;
public class Insertion {
    static void insertionSort(int[] arr,int n){
        int temp;
        for(int i=0;i<n;i++)
        {
            temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
