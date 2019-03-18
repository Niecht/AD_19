package d1;

/** Interface to implement a StackInterface.*/
public interface StackInterface {
    /** Returns true if list is empty, false if not.*/
    public boolean empty();
    /** Returns the element at the top of the list. */
    public String peek();
    /** Returns the element at the top of the stack and removes it.*/
    public String pop();
    /** Adds an element to the top of the stack. */
    public void push(String add);
    /** Searches through the stack for a specific element. Returns the index of the element, -1 if it is not in the Stack.*/
    public int search(String find);
}
