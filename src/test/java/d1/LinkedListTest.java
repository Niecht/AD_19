package d1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void add() {
        LinkedList list = new LinkedList();
        list.add(new Node(new Allocation(1,1)));
        assertEquals(1, list.size());
    }

    @Test
    void addNode() {
        LinkedList list = new LinkedList();
        Node node = new Node(new Allocation(1,1));
        list.add(node);
        assertEquals(list.head, node);
    }

    @Test
    void removeHead() {
        LinkedList list = new LinkedList();
        Node node = new Node(new Allocation(1,1));
        list.add(node);
        list.removeHead();
        assertEquals(list.size(), 0);
    }

    @Test
    void size(){
        LinkedList list = new LinkedList();
        list.add(new Node(new Allocation(1,1)));
        list.add(new Node(new Allocation(2,2)));
        list.add(new Node(new Allocation(3,3)));
        assertEquals(list.size(), 3);
    }

    @Test
    void contains(){
        LinkedList list = new LinkedList();
        Allocation allocation = new Allocation(3,3);
        list.add(new Node(new Allocation(1,1)));
        list.add(new Node(new Allocation(2,2)));
        list.add(new Node(allocation));
        assertEquals(list.contains(allocation), true);
    }

    @Test
    void containsFalse(){
        LinkedList list = new LinkedList();
        Allocation allocation = new Allocation(3,3);
        list.add(new Node(new Allocation(1,1)));
        list.add(new Node(new Allocation(2,2)));
        list.add(new Node(new Allocation(4,4)));
        assertEquals(list.contains(allocation), false);
    }
}