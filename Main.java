import Searching.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to My DSA Library");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Searching Algorithm");
            System.out.println("2. Sorting Algorithm");
            System.out.println("3. Exit");

            int option=sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Searching Algorithm");
                    System.out.println("1. Linear Search");
                    System.out.println("2. Binary Search");
                    System.out.println("3. Back");
                    int option1=sc.nextInt();
                    switch (option1) {
                        case 1:
                            int [] arr = FillArray();
                            Linear l=new Linear();
                            System.out.println("Enter element to search");
                            int search = sc.nextInt();
                            l.LinearSearch(arr, search);
                            break;
                        case 2:
                            arr = FillArray();
                            Binary b=new Binary();
                            System.out.println("Enter element to search");
                            search = sc.nextInt();
                            b.BinarySearch(arr,search);
                            break;
                        case 3:
                            //Back to Main Menu
                        break;
                    }
                    break;
            
                case 2:

                    break;
                
                default:
                    break;
            }

        } 
    }
    private static int[] FillArray() {
        System.out.println("Enter Size of Array");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}

   