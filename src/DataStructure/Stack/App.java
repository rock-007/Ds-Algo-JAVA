package DataStructure.Stack;

public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack(10); // a is size of stack or array implementation of stack

        theStack.push('h');
        theStack.push('e');
        theStack.push('l');
        theStack.push('l'); // this is most recent item and will be removed first
        theStack.push('o');
        // for pop


        while (!theStack.isEmpty()) {

            char a = theStack.pop();

            System.out.print(a);
        }
    }

    public static String reveresString(String str) {

        int strLength = str.length();
        Stack theNewStack = new Stack(strLength);


        for (int i = 0; i < strLength; i++) {
            theNewStack.push(str.charAt(i));

        }

        String result = "";
        while (!theNewStack.isEmpty()) {
            char eachElement = theNewStack.pop();
            result += eachElement;
        }
        return result;

    }

}
