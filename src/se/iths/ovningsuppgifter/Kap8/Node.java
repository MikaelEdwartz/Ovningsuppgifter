package se.iths.ovningsuppgifter.Kap8;


public class Node <T, N>{
    public T value;
    public Node nextObject;
    public Node previous;


    public Node(T value, Node previous) {
        this.value = value;
        this.nextObject = null;
        this.previous = previous;
    }

    public void setNextObject(Node nextObject) {
        this.nextObject = nextObject;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", nextObject=" + nextObject +
                ", previous=" + previous +
                '}';
    }
}
