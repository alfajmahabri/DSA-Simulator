import java.util.*;

public class StackArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int top = -1;
        System.out.println("Enter Size of Stack");
        int n = sc.nextInt();
        int arr[] = new int[n];
        while (true) {
            System.out.println("Select from the following");
            System.out.println("1. To Display Size of Stack \n2. To Push element \n3. To POP element \n4. Display Stack \n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    DisplaySize(n);
                    break;
                case 2:
                    System.out.println("Enter element");
                    int item = sc.nextInt();
                    top = Push(item, top, arr);
                    break;
                case 3:
                    top = Pop(top);
                    break;
                case 4:
                    DisplayStack(arr, top);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    static int Pop(int top) {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            System.out.println("Popping Out element at " + top);
            top--;
        }
        return top;
    }

    static void DisplayStack(int arr[], int top) {
        System.out.println("Displaying Stack");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    static void DisplaySize(int n) {
        System.out.println("Displaying Size");
        System.out.println(n);
    }

    static int Push(int item, int top, int arr[]) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow. Cannot push.");
        } else {
            top++;
            System.out.printf("Pushing element %d at %d\n", item, top);
            arr[top] = item;
        }
        return top;
    }
}
