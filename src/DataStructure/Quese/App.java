package DataStructure.Quese;

public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);


        myQueue.insert(100);
        myQueue.insert(77);

        myQueue.insert(45);
        myQueue.insert(66);
        myQueue.insert(68);
        myQueue.insert(34);
        myQueue.insert(89);
        myQueue.view();


    }
}
