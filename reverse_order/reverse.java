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
public class reverse  
{ 
    Node root; 
    void reverseLevelOrder(Node node)  
    { 
        int h = findheight(node);
       System.out.println("height"+h);		
        int i; 
        for (i = h; i >= 1; i--)  
        
        { 
            printGivenLevel(node, i); 
        } 
    } 
    void printGivenLevel(Node node, int level)  
    { 
        if (node == null) 
            return; 
        if (level == 1) 
            System.out.print(node.data + " "); 
        else if (level > 1)  
        { 
            printGivenLevel(node.left, level - 1); 
            printGivenLevel(node.right, level - 1); 
        } 
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
        reverse tree = new reverse(); 
        tree.root = new Node(10); 
        tree.root.left = new Node(5); 
        tree.root.right = new Node(12); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(7);
        tree.root.right.left = new Node(11);
        tree.root.right.right = new Node(15);
        tree.reverseLevelOrder(tree.root); 
    } 
}