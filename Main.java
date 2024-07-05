import Recursion.*;
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
            System.out.println("3. Stack");
            System.out.println("4. Recursion");
            System.out.println("5. Exit");

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

                    // END OF CASE 1 SEARCHING ALGORITHM
                
                case 2:
                    System.out.println("SORTING ALGORITHM");
                    break;
            
                    // END OF CASE 2 SORTING ALGORITHM

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

   