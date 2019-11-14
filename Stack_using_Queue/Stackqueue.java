import java.util.*;
class Stackqueue{
	 static Queue<Integer> q1 = new LinkedList<Integer>(); 
        static Queue<Integer> q2 = new LinkedList<Integer>(); 
		void push(int data)
		{
			if(q1.isEmpty())
			{
			q1.add(data);
			}
			else
			{  
		       while(!q1.isEmpty())
			   {
				q2.add(q1.peek());
				q1.remove();
			   }
			   q1.add(data);
			   while(!q2.isEmpty())
			   {
				q1.add(q2.peek());
				q2.remove();
			   }
			}
		}
		void print()
		{
			while(!q1.isEmpty())
			{
				int d=q1.remove();
				System.out.println(d);
			}
		}
	public static void main(String args[])
	{
		Stackqueue s= new Stackqueue();
		 s.push(45); 
        s.push(17); 
        s.push(23); 
        s.push(45); 
		s.print();
	}
}