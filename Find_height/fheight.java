class Node  
{ 
    int data; 
    Node left, right; 
       
    Node(int item)  
    { 
        data = item; 
        left = right; 
    } 
} 
public class fheight 
{ 
    Node root; 
    void height(Node node)  
    { 
        int h = findheight(node);
       System.out.println("height"+h);		 
    } 
    int findheight(Node node)  
    { 
        if (node == null) 
            return 0; 
        else
        { 
            int lheight = findheight(node.left); 
            int rheight = findheight(node.right);     
            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    } 
    public static void main(String args[])  
    { 
        fheight tree = new fheight(); 
        tree.root = new Node(10); 
        tree.root.left = new Node(5); 
        tree.root.right = new Node(12); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(7);
        tree.root.right.left = new Node(11);
        tree.root.right.right = new Node(15);
        tree.height(tree.root); 
    } 
}