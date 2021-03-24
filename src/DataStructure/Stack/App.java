package DataStructure.Stack;

public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack(10); // a is size of stack or array implementation of stack

        theStack.push(20);
        theStack.push(50);
        theStack.push(40);
        theStack.push(10); // this is most recent item and will be removed first

        // for pop


        while (!theStack.isEmpty()) {

            int a = theStack.pop();

            System.out.print(a);
        }
    }


}
