package LinkedList.implementation;

public class SinglyLinkedList {

    private static int length = 0;
    SinglyLinkedNode head;

    public int getLength() {
        return length;
    }

    public SinglyLinkedNode getHead() {
        return head;
    }

    // Insert node
    public void inserAtBegining(SinglyLinkedNode newNode) {
        newNode.setNextNode(head);
        head = newNode;
        length++;
    }

    // Insert node
    public void insertAtLast(SinglyLinkedNode newNode) {
        if (head == null) head = newNode;
        while (head.getNextNode() != null) {
            head = head.getNextNode();
        }
        head.setNextNode(newNode);
        length++;
    }

    // Insert value to list
    public void insertAtPosition(int data, int pos) {
        if (pos < 0) pos = 0;
        if (pos > length) pos = length;
        if (head == null) {
            head = new SinglyLinkedNode(data);
        } else {
            SinglyLinkedNode temp = new SinglyLinkedNode(data);
            SinglyLinkedNode currentNode = head;
            for (int i = 0; i < pos - 1; i++) {
                currentNode = currentNode.getNextNode();
            }
            temp.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(temp);
        }
        length++;
    }

    // Delete node
    public void deleteFromFront() {
        if (head == null) return;
        head = head.getNextNode();
        length--;
    }

    // Delete node
    public void deleteFromLast() {
        if (head == null) return;
        if (head.getNextNode() == null) {
            head = null;
            return;
        }
        SinglyLinkedNode currentNode = head;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(null);
        length--;
    }

    // Delete value from list
    public void deleteFromPosition(int pos) {
        if (head == null) return;
        if (pos < 0) return;
        if (pos > length) return;

        if (head.getNextNode() == null) {
            head = null;
            return;
        }
        SinglyLinkedNode currentNode = head;
        for (int i = 0; i < pos - 1; i++) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        currentNode.getNextNode().setNextNode(null);
        length--;
    }

    public void deleteMatched(SinglyLinkedNode node) {
        if (head == null) return;

        SinglyLinkedNode currentNode = head;
        if (currentNode != null && currentNode.equals(node) != true) {
            currentNode = currentNode.getNextNode();
        }
        length--;
    }

    public void clearList(){
        head = null;
        length =0;
    }

}
