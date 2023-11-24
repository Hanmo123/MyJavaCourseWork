public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue() {
        this.size = 8;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = data;
        }
    }

    public int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            data = queue[front];
            queue[front] = 0;
            front++;
            if (front > rear) {
                front = rear = -1;
            }
        }
        return data;
    }

    public int getSize() {
        return rear + 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }
}
