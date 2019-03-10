package d2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BinarySearchTree implements TreeInterface<BinaryTreeNode>{
    private BinaryTreeNode root;
    private int height;
    private int size;
    private static Logger LOG = LogManager.getLogger(BinaryTreeNode.class);

    /**BinarySearchTree(){
        this.setRoot(new BinaryTreeNode(5));
        root.setLeftC(new BinaryTreeNode(3));
        root.setRightC(new BinaryTreeNode(15));
        root.getLeftC().setLeftC(new BinaryTreeNode(2));
        root.getLeftC().getLeftC().setLeftC(new BinaryTreeNode(1));
        root.getLeftC().setRightC(new BinaryTreeNode(4));
        root.getRightC().setLeftC(new BinaryTreeNode(13));
        root.getRightC().getLeftC().setLeftC(new BinaryTreeNode(11));
        root.getRightC().setRightC(new BinaryTreeNode(20));
        root.getRightC().getRightC().setRightC(new BinaryTreeNode(30));
    }*/

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        //bt.setRoot(new BinaryTreeNode(5));
        //System.out.println(bt.find(13));
        //bt.insert(new BinaryTreeNode(14));
        //System.out.println(bt.find(13));
        bt.traversInorder(bt.getRoot());
        bt.traversPreorder(bt.getRoot());
        bt.traversPostorder(bt.getRoot());
    }
    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BinaryTreeNode find(int target){
        if(root.getValue() == target){
            return root;
        }else if(root.getValue() > target && root.getLeftC() != null){
            return find(target, root.getLeftC());
        }else{
            return find(target, root.getRightC());
        }
    }

    public void insert(BinaryTreeNode insert){
        if(this.root == null){
            root = insert;
        }
        BinaryTreeNode next = this.root;
        BinaryTreeNode insertRoot = null;
        while(next != null){
            insertRoot = next;
            if(next.getValue() > insert.getValue()){
                next = next.getLeftC();
            }else if(next.getValue() < insert.getValue()){
                next = next.getRightC();
            }else {
                break;
            }
        }

        if(insertRoot.getValue() < insert.getValue()){
            insertRoot.setRightC(insert);
        }else if(insertRoot.getValue() > insert.getValue()){
            insertRoot.setLeftC(insert);
        }

    }

    public void remove(BinaryTreeNode remove){
        if(find(remove.getValue()) != null && remove != root){  //check if value is in tree and if its not root
            BinaryTreeNode parent = this.findParent(remove);
            if(remove.getRightC() == null && remove.getLeftC() == null){
                if(parent.getLeftC() == remove){
                    parent.setLeftC(null);
                }else{
                    parent.setRightC(null);
                }
            }
        }
    }

    private BinaryTreeNode find(int target, BinaryTreeNode node){
        if(node.getValue() == target){
            return node;
        }else if(node.getValue() > target && node.getLeftC() != null){
            return find(target, node.getLeftC());
        }else{
            return find(target, node.getRightC());
        }
    }

    //finds the parent to a node
    private BinaryTreeNode findParent(BinaryTreeNode child){
        BinaryTreeNode parent = root;
        while (parent.getLeftC() != child || parent.getRightC() != child){
            if(parent.getValue() > child.getValue()){
                parent = parent.getLeftC();
            }else{
                parent = parent.getRightC();
            }
        }
        return parent;
    }

    public void traversInorder(BinaryTreeNode n){

        if(root == null){
            LOG.debug("Tree is empty");
            return;
        }

        if(n.getLeftC() != null){
            traversInorder(n.getLeftC());
        }
        System.out.println(n.getValue());
        if(n.getRightC() != null){
            traversInorder(n.getRightC());
        }
    }

    public void traversPreorder(BinaryTreeNode n){

        if(root == null){
            LOG.debug("Tree is empty");
            return;
        }

        System.out.println(n.getValue());
        if(n.getLeftC() != null){
            traversPreorder(n.getLeftC());
        }
        if (n.getRightC() != null){
            traversPreorder(n.getRightC());
        }
    }

    public void traversPostorder(BinaryTreeNode n){

        if(root == null){
            LOG.debug("Tree is empty");
            return;
        }

        if(n.getLeftC() != null){
            traversPostorder(n.getLeftC());
        }
        if (n.getRightC() != null){
            traversPostorder(n.getRightC());
        }
        System.out.println(n.getValue());
    }

    @Override
    public void add(BinaryTreeNode value) {
        LOG.info("Not supported operation");
    }

    @Override
    public void delete(BinaryTreeNode value) {
        LOG.info("Not supported operation");
    }
}
