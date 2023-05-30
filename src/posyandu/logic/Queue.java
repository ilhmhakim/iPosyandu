package posyandu.logic;

public class Queue {
    private static int front, rear, capacity;
    private static int queue[];

    public Queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    // insert an element into the queue
    public static void queueEnqueue(int item)  {
        // check if the queue is full
        if (capacity == rear) {
            System.out.printf("\nAntrian Penuh\n");
            return;
        }

        // insert element at the rear
        else {
            queue[rear] = item;
            rear++;
        }
        return;
    }

    //remove an element from the queue
    public static void queueDequeue()  {
        // check if queue is empty
        if (front == rear) {
            System.out.printf("\nTidak Ada Antrian\n");
            return;
        }

        // shift elements to the right by one place uptil rear
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }


            // set queue[rear] to 0
            if (rear < capacity)
                queue[rear] = 0;

            // decrement rear
            rear--;
        }
        return;
    }

    // print queue elements
    public static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("Tidak Ada Antrian\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d , ", queue[i]);
        }
        return;
    }

    // print front of queue
    public static void queueFront()
    {
        if (front == rear) {
            System.out.printf("Tidak Ada Antrian\n");
            return;
        }
        System.out.printf("\nNomor Antrian Saat Ini : %d\n", queue[front]);
        return;
    }
}
