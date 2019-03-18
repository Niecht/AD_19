package d1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StackDemo implements StackInterface{
    private String[] stack;
    private static final Logger LOG = LogManager.getLogger(StackDemo.class);

    public StackDemo(int size){
        stack = new String[size];
    }
    @Override
    public boolean empty() {
        for(String item : stack){
            if(item != null){
                return false;
            }
        }
        return true;
    }

    @Override
    public String peek() {
        if (!this.empty()){
            return stack[stack.length-1];
        }
        LOG.debug("Stack is empty");
        return null;
    }

    @Override
    public String pop() {
        if(!this.empty()){
            String remove = stack[stack.length-1];
            stack = delete(remove);
            return stack[stack.length-1];
        }
        return null;
    }

    @Override
    public void push(String add) {
        stack[stack.length] = add;
    }

    @Override
    public int search(String find) {
        int indedx = 0;
        for(String item :stack){
            if(item == find){
                return indedx;
            }
            indedx++;
        }
        return -1;
    }

    private String[] delete(String remove){
        String[] temp = new String[stack.length-2];
        int iterator = 0;
        for(String item : stack){
            if(item != remove){
                temp[iterator] = item;
                iterator++;
            }
        }
        return temp;
    }
}
