package DataStructure.AbstractDataType;

public class Counter {

    private String str = null;
    private int totalCoutner = 0;

    public Counter(String str) {
        this.str = str;

    }

    public void increment() {
        totalCoutner++;


    }

    public int getCurrentValue() {

        return totalCoutner;

    }

    public String toString() {

        return str + ":" + totalCoutner;

    }

}
