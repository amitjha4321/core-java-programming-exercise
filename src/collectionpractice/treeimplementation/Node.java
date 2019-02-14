package collectionpractice.treeimplementation;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }


    public void insert(int value){
        if (value<=data){
            if(left==null){
                left =new Node(value);
                //left.data=value;

            }else {
                left.insert(value);
            }
        }else {
            if (right==null){
                right=new Node(value);
                //right.data=value;
            }else {
                right.insert(value);
            }
        }

    }
    public boolean contains(int value){
        if(data==value){
            return true;
        }else if(value<data){
            if(left==null){
                return false;
            }else {
                return left.contains(value);
            }
        }else {
            if (right==null){
                return false;
            }else {
                return right.contains(value);
            }
        }
    }
    public void printInOrder(){
        if (left!=null){
            left.printInOrder();
        }
        System.out.println(data);
        if (right!=null){
            right.printInOrder();
        }
    }

    public static void main(String[] args) {
        Node node=new Node(10);
        //node.insert(10);
        node.insert(15);
        node.insert(5);
        node.insert(50);
        node.insert(25);
        node.insert(34);
        node.insert(12);
        node.insert(9);
        node.printInOrder();
    }
}
