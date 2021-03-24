package DataStructure.Stack.HackerRank;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaxElement {
    public static List<Integer> getMax(List<String> operations) {
        // Write your code here

        Scanner sn = new Scanner(System.in);

        List<Integer> result = new LinkedList<>();


        for (int i = 0; i < operations.size(); i++) {
            //input and separate based on the white space
            String[] input = sn.nextLine().split(" ");
            int[] inputInteger = new int[2];
            for (int j = 0; j < input.length; j++) {
                inputInteger[j] = Integer.parseInt(input[j]);
            }

            if (i == 0) {
                Stack<Integer> fullStack = new Stack<>();

                Stack<Integer> maxStack = new Stack<>();
            } else {


                switch (operations.get(i)) {


                    case 1:

                        fullStack.push(input);


                        break;
                    case 2: {

                        if (fullStack.peek == maxStack.peek) {

                            maxStack.pop();
                        }
                        fullStack.pop();
                    }
                    break;

                    case 3: {
                        result.add(maxStack.pop());
                    }
                    break;

                }

            }

            return result;


        }


    }
}