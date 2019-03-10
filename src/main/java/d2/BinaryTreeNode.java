package d2;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeNode implements NodeInterface<Integer, BinaryTreeNode>{
    private int value;
    private BinaryTreeNode leftC;
    private BinaryTreeNode rightC;

    BinaryTreeNode(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getLeftC() {
        return leftC;
    }

    public void setLeftC(BinaryTreeNode leftC) {
        this.leftC = leftC;
    }

    public BinaryTreeNode getRightC() {
        return rightC;
    }

    public void setRightC(BinaryTreeNode rightC) {
        this.rightC = rightC;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "value=" + value +
                ", leftC=" + leftC +
                ", rightC=" + rightC +
                '}';
    }

    @Override
    public LinkedList<BinaryTreeNode> children() {
        LinkedList<BinaryTreeNode> list = new LinkedList<>();
        if(leftC != null){
            list.add(leftC);
        }
        if(rightC != null){
            list.add(rightC);
        }
        return list;
    }

    @Override
    public BinaryTreeNode getChild(Integer s) {
        if(leftC.getValue() == s){
            return leftC;
        }else if(rightC.getValue() == s){
            return rightC;
        }
        return null;
    }
}
