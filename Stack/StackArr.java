package Stack;

public class StackArr {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackArr(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push method to add elements
    public void push(int num) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + num);
        } else {
            stack[++top] = num;
            System.out.println(num + " pushed to stack.");
        }
    }

    // Pop method to remove elements
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Peek method to check the top element
    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Size method to get the current number of elements in the stack
    public int size() {
        return top + 1;
    }

    // Display method to print stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
