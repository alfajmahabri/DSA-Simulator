import Recursion.*;
import Searching.*;
import Sort.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to My DSA Library");
        Scanner sc = new Scanner(System.in);
        boolean conditions=true;
        while (conditions) {
            System.out.println("Main Menu");
            System.out.println("1. Searching Algorithm");
            System.out.println("2. Sorting Algorithm");
            System.out.println("3. Stack");
            System.out.println("4. Recursion");
            System.out.println("0. Exit");
            int [] arr ;
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
                            arr = FillArray();
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

                    // END OF CASE 1 SEARCHING ALGORITHM
                
                case 2:
                    System.out.println("SORTING ALGORITHM");
                    System.out.println("1. Bubble Sort");
                    System.out.println("2. Selection Sort");
                    System.out.println("3. Insertion Sort");
                    option1 =sc.nextInt();
                    switch (option1) {
                        case 1:
                            System.out.println("Bubble Sort");
                            arr = FillArray();
                            System.out.println("Sorting elements");
                            BubbleSort b1=new BubbleSort(arr);
                            break;
                        case 2:
                            System.out.println("Selection Sort");
                            arr = FillArray();
                            SelectionSort s = new SelectionSort(arr);
                            break;
                        case 3:
                            System.out.println("Insertion Sort");
                            arr = FillArray();
                            InsertionSort i = new InsertionSort(arr);
                            break;
                    }
                    break;
            
                    // END OF CASE 2 SORTING ALGORITHM

                case 3:
                    System.out.println("Stack Operations");
                    arr=FillArray();
                    System.out.println("1. Push");
                    System.out.println("2. Pop");
                    System.out.println("3. Size");
                    System.out.println("4. Display");
                    option1 = sc.nextInt();
                    switch (option1) {
                        case 1:
                            System.out.println("Push Operation");
                            break;
                        default:
                            throw new AssertionError();
                    }
                    
                case 4:
                    System.out.println("Recursion");
                    System.out.println("1. Factorial");
                    System.out.println("2. Fibonacci");
                    option1 =sc.nextInt();
                    switch (option1) {
                        case 1:
                            System.out.println("Enter Number to find Factorial");
                            int num = sc.nextInt();
                            System.out.println(Recursion.factorial(num));
                            break;
                        case 2:
                            System.out.println("Enter Number to find Fibonacci");
                            num = sc.nextInt();
                            System.out.println(Recursion.fibonacci(num));
                            break;
                        default:
                            break;
                    }
                    break;
                    // END OF CASE 4 RECURSION
                
                    // EXIT
                case 0:
                    conditions=false;
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

   