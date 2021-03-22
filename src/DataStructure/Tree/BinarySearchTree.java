package DataStructure.Tree;

public class BinarySearchTree {
    Node root; // variable define will initailised when object is created with default constructor


    BinarySearchTree() {

        root = null;

    }

    /*
          8
         /\
         4 12
         /\ /\
         1 7 9 14

         */

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();


        tree.insertNode(8);
        tree.insertNode(4);
        tree.insertNode(1);
        tree.insertNode(12);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(14);
        //  System.out.println("Data you are looking for ::"+tree.search(tree.root,1));

        tree.deleteKey(12);
    }

    private void deleteKey(int key) {

        root = deleteNode(root, key);

    }

    private Node deleteNode(Node root, int key) {

        if (root == null) return root;

        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        }
       else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        }else {

           if(root.left==null && root.right==null){
               return null;
           }else if( root.left ==null){

               return root.right;
           }else if( root.right ==null){

               return root.left;
           } else {

        int minVal= minValue(root.right);
        root.key=minVal;
        root.right=deleteNode(root.right,minVal);


           }
        }

    }

    private void insertNode(int key) {
        root = insertHelper(root, key);
    }

    Node insertHelper(Node root, int key) {


        if (root == null) {

            root = new Node(key);

            return root;
        }
        if (key < root.key) {
            root.left = insertHelper(root.left, key);
        } else if (key > root.key) {

            root.right = insertHelper(root.right, key);
        }


        return root;


    }
}