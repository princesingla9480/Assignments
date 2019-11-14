import java.util.*; 
class queueusingstack  
{  
    static Stack<Integer> s1 = new Stack<Integer>();  
    static Stack<Integer> s2 = new Stack<Integer>();  
    static void enQueue(int x)  
    {  
       while(!s1.isEmpty())
	   {
		   s2.push(s1.pop());
	   }
	   s1.push(x);
	   while(!s2.isEmpty())
	   {
		   s1.push(s2.pop());
	   }
    }  
    static void deQueue()  
    {  
         while(!s1.isEmpty())
		 {
			 int d=s1.pop();
			 System.out.println(d);
		 }
    }  
public static void main(String[] args)  
{  
    queueusingstack q = new queueusingstack();  
    q.enQueue(45);  
    q.enQueue(17);  
    q.enQueue(23);  
	q.enQueue(74);
    q.deQueue();
}  
}  