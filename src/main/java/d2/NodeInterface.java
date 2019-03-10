package d2;

import java.util.LinkedList;

public interface NodeInterface<T,E>{
    LinkedList<E> children();
    E getChild(T t);
}
