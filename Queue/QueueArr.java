package Queue;

public class QueueArr {
    private int[] queue;
    private int top,rear,capacity;

    public QueueArr(int size){
        queue=new int[size];
        top=-1;
        rear=-1;
        capacity=size;
    }

    public void push(int num){
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + num);
        } else {
            queue[++rear]=num;
            System.out.println(num + " pushed to queue.");
        }
    }

    public int pop(){
        if( isEmpty()){
            System.out.println("Queue UnderFlow! Cannot pop");
        }else{
            return queue[rear--];
        }
    }

    public int peek(){
        if (!isEmpty()) {
            return queue[rear];
        } else {
            System.out.println("Queue is empty.");
            return -1;
        }
    }


}
