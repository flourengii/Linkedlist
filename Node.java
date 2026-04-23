package ADT;

public class Node {
    private int value;
    private Node next;

    public Node(){
        this.value = 0;
        this.next = null;
    }

    public Node(int nv){
        this.value = nv;
        this.next = null;
    }

    public int getValue(){
        return this.value;
    }

    public Node getNext(){
        return this.next;
    }

    public void setValue(int nv){
        this.value = nv;
    }

    public void setNext(Node nNext){
        this.next = nNext;
    }

    @Override
    public String toString(){
        return (" " + this.value);
    }
}
