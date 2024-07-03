package Searching;

public class Linear{
    public void LinearSearch(int[] arr,int search){
        int count =0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                count++;
                index=i;
                break;
            }
        }
        if(count==1){
            System.out.println("Element is present at index "+index);
        }else{
            System.out.println("Element not found");
        }
    }
}