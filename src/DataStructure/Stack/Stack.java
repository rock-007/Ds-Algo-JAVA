package DataStructure.Stack;

public class Stack {

    // max size
    private int totalSize;
    // top value

    private int currentTop;

    // data+DS

    public Integer[] data;


    //Constructor

    public Stack(int a) {
        this.totalSize = a;
        this.data = new Integer[totalSize];
        this.currentTop = -1;
    }

    //push

    public void push(int a) {

        if (isFull()) {

            System.out.println(" the stack is already full");


            // resize the DS and update the totalsize to new value
            //   Integer[] tempData = data;
            //    totalSize = totalSize * 2;
            //    data = new Integer[totalSize];

            // copy the data structure
        } else {

            currentTop++;
            data[currentTop] = a;
        }


    }

    //pop
    public int pop() {

        if (isEmpty()) {


            System.out.println(" there is nothing to pop");
        } else {
            int tempTop = currentTop;
            currentTop--;
            return data[tempTop];

        }


    }

    //peak

    public int peak(int a) {


        return data[currentTop];

    }

    public boolean isEmpty() {


        return (currentTop == -1);

    }

    public boolean isFull() {


        return (currentTop == totalSize - 1);

    }

}
