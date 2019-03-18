package d1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList {
    public Node head;
    private int size;
    private final Logger LOG = LogManager.getLogger(LinkedList.class);

    public final void add(Node node){
        if (this.size() == 0){
            this.head = node;
            size++;
        }else{
            node.setNext(head);
            this.head = node;
            size++;
        }
    }

    public final void removeHead(){
        if(head.getNext() == null){
            head = null;
            size--;
        }else if(head == null){
            LOG.debug("List is already empty");
        }else{
            Node temp = head.getNext();
            head = temp;
            size--;
        }
    }

    public final int size(){
        return this.size;
    }

    public final boolean contains(Allocation allocation){
        if (this.find(allocation) == null){
            return false;
        }
        return true;
    }

    private final Node find(Allocation allocation){
        Node temp = head;
        int i = 1;

        while (i < this.size && temp.getValue() != allocation ){
            temp = temp.getNext();
            i++;
        }

        if (temp.getValue() == allocation){
            return temp;
        }
        return null;
    }

    public final Allocation pop(){
        Allocation temp = (Allocation) head.getValue();
        head = head.getNext();
        return temp;
    }

    public final void removeElement(Allocation allocation){
        Node target = this.find(allocation);
        if ( target == null){
            LOG.debug("Element is not in list");
        }else{
            Node temp = head;
            while (temp.getNext() != target){
                temp = temp.getNext();
            }
            temp.setNext(target.getNext());
        }
    }


}
