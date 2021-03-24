package DataStructure.Quese;

import java.util.LinkedList;

public class Queue {
    int maxSize;
    int front;
    int rear;
    int nthItems;
    Integer[] data;


    Queue(int size) {
        maxSize = size;
        this.data = new Integer[maxSize];
    }

    public void insert(int element) {

        if (isFull()) {
            rear = -1;


        }
        rear++;
        data[rear] = element;
        nthItems++;
    }


    public void view() {

        for (int i = 0; i < data.length; i++) {

            System.out.print(data[i]);


        }

    }

    public int remove() {
        int temp = data[front];
        front++;
        nthItems--;
        if (front == maxSize - 1) {

            front = 0;
        }
        return temp;
    }

    public int peekFront() {

        return data[front];
    }

    public boolean isEmpty() {

        return nthItems == 0;
    }

    public boolean isFull() {

        return nthItems == maxSize;
    }
}
