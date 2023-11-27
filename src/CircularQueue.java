public class CircularQueue {
    int arr[];
    int front, rear;
    int cap;

    CircularQueue(int cap)
    {
        arr = new int[cap];
        this.cap = cap;
        this.front = -1;
        this.rear = -1;
    }

    void Enqueue (int data)
    {
        if(front == (rear+1)%cap){
            System.out.println("The queue is Full");
            return;
        }
        else if(front == -1)
        {
            front = 0;
            rear = 0;
        }
        else
            rear = ((rear+1)%cap);

        arr[rear] = data;
    }

    int Dequeue()
    {
        if(front == -1){
            System.out.println("The queue is an Empty");
            return -1;
        }
        int remove = arr[front];
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        front = ((front+1)%cap);
        return remove;
    }
    void Display()
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.Enqueue(80);
        cq.Enqueue(40);
        cq.Enqueue(90);
        cq.Enqueue(30);
        cq.Enqueue(20);
        cq.Enqueue(10);

        cq.Display();
        System.out.println();

        cq.Dequeue();
        cq.Dequeue();
        cq.Dequeue();
        cq.Dequeue();
        cq.Dequeue();
        cq.Enqueue(1);
        cq.Enqueue(2);
        cq.Enqueue(3);
        cq.Enqueue(4);
        cq.Enqueue(5);
        cq.Enqueue(6);

        cq.Display();
    }
}
