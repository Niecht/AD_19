package d1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Node<T> {
    private T value;
    private Node<T> next;
    private static Logger LOG = LogManager.getLogger(Node.class);

    Node (T value, Node next){
        this.value = value;
        this.next = next;
    }

    Node (T value){
        this.value = value;
        this.next = null;
    }

    public final Node getNext(){
        return this.next;
    }

    public final void setNext(Node next) throws NullPointerException{
        if (next != this) {
            this.next = next;
        }else{
            LOG.debug("You can not point to yourself");
            throw new NullPointerException(toString());
        }
    }

    public T getValue() {
        return this.value;
    }

    @Override
    public String toString(){
        return (this.next + this.value.toString());
    }
}
