package d1;

import org.assertj.core.error.NoElementsShouldMatch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void getNextNull() {
        final Node node = new Node(new Allocation(5,6));
        assertEquals(node.getNext(), null);
    }

    @Test
    void getNextNode(){
        final Node node1 = new Node(new Allocation(1,1));
        final Node node2 = new Node(new Allocation(2,2));
        node1.setNext(node2);
        assertEquals(node1.getNext(), node2);
    }

    @Test
    void getSetNextNodeSelf(){
        final Node node = new Node(new Allocation(-4, -4));
        assertThrows(NullPointerException.class, () -> {
            node.setNext(node);
        });
    }

    @Test
    void getValue(){
        Allocation allocation = new  Allocation(-10, -5);
        final Node node = new Node(allocation);
        assertEquals(node.getValue(), allocation);
    }
}