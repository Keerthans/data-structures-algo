package LinkedList.implementation;

public class SinglyLinkedNode {

    private int data;
    private SinglyLinkedNode nextNode;

    public SinglyLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SinglyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }
}
