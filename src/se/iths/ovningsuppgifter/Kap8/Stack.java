package se.iths.ovningsuppgifter.Kap8;

public class Stack<T> {
    private Node node;
    private Node next;
    private Node last;

    public Stack() {

    }


    public void push(T value) {
        Node newNode = new Node(value, this.node);
        newNode.value = value;


        if (next == null) {
            next = newNode;

        }
        else {
            Node n = next;
            while (n.nextObject != null) {
                n = n.nextObject;


            }
            n.nextObject = newNode;
            n.previous = next;

        }
    }

    public void showChronological() {

        Node n = next;

        while(n.nextObject!=null) {
            System.out.println(n.value);
            n=n.nextObject;

        }
        System.out.println(n.value);
    }

    public void showbackwards() {

        Node n = this.node;

        while(n.previous!=null) {
            System.out.println(n.value);
            if(n.previous != null) {
                n = n.previous;
            }
        }
        System.out.println(n.value);
    }

    public Object pop() {
        var returnValue = (T) this.node.getValue();

        this.node.setValue(null);

        return returnValue;
    }

    public Node getNode() {
        return node;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "node=" + node +
                '}';
    }
}
