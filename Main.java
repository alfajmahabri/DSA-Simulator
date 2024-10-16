import Recursion.*;
import Searching.*;
import Sort.*;
import Queue.*;
import Stack.StackArr;
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
            System.out.println("5. Linked List");
            System.out.println("6. Queue");
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
                    System.out.println("4. Quick Sort");
                    System.out.println("5. Merge Sort");
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
                        case 4:
                            System.out.println("Quick Sort");
                            arr= FillArray();
                            QuickSort.QuickSort(arr, 0, arr.length-1);
                            QuickSort.printArray(arr);
                            break;
                        case 5:
                            System.out.println("Merge sort");
                            arr= FillArray();
                            MergeSort.mergeSort(arr, 0, arr.length - 1);
                            MergeSort.printArray(arr);
                    }
                    break;
            
                    // END OF CASE 2 SORTING ALGORITHM
                    // START OF CASE 3 STACK OPERATION

                    case 3:
                    System.out.println("Stack Operations");
                    System.out.println("Enter size of stack:");
                    int stackSize = sc.nextInt();
                    StackArr stack = new StackArr(stackSize); // Create stack object
                    boolean stackConditions = true;
                    
                    while (stackConditions) {
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Peek");
                        System.out.println("4. Size");
                        System.out.println("5. Display");
                        System.out.println("6. Back to Main Menu");
                        int stackOption = sc.nextInt();
                        
                        switch (stackOption) {
                            case 1:
                                System.out.println("Enter number to push:");
                                int numToPush = sc.nextInt();
                                stack.push(numToPush);
                                break;
                            case 2:
                                int poppedValue = stack.pop();
                                if (poppedValue != -1) {
                                    System.out.println("Popped: " + poppedValue);
                                }
                                break;
                            case 3:
                                int peekValue = stack.peek();
                                if (peekValue != -1) {
                                    System.out.println("Top element: " + peekValue);
                                }
                                break;
                            case 4:
                                System.out.println("Stack size: " + stack.size());
                                break;
                            case 5:
                                stack.display();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                                break;
                            case 6:
                                stackConditions = false; // Exit stack operations
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                    }
                    break;
                
                    
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
                
                case 5:
                    System.out.println("Linked List");
                    System.out.println("1. Singly Linked List");
                    System.out.println("2. Doubly Linked List");
                    option1 =sc.nextInt();
                    switch (option1) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        default:
                            break;
                    }
                    break;
                    // END OF CASE 5 
                    case 6:
                    System.out.println("Queue");
                    System.out.println("Stack Operations");
                    System.out.println("Enter size of stack:");
                    stackSize = sc.nextInt();
                    stackConditions = true;
                    Queue queue = new Queue();
                    while (stackConditions) {
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Peek");
                        System.out.println("4. Size");
                        System.out.println("5. Display");
                        System.out.println("6. Back to Main Menu");
                        int stackOption = sc.nextInt();
                        
                        switch (stackOption) {
                            case 1:
                                System.out.println("Enter number to push:");
                                int numToPush = sc.nextInt();
                                queue.push(numToPush);
                                break;
                            case 2:
                                int poppedValue = queue.pop();
                                if (poppedValue != -1) {
                                    System.out.println("Popped: " + poppedValue);
                                }
                                break;
                            case 3:
                                int peekValue = queue.peek();
                                if (peekValue != -1) {
                                    System.out.println("Top element: " + peekValue);
                                }
                                break;
                            case 4:
                                System.out.println("Stack size: " + queue.size());
                                break;
                            case 5:
                                queue.display();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                                break;
                            case 6:
                                stackConditions = false; // Exit stack operations
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                    }
                    break;
                    // END OF CASE 6
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

   