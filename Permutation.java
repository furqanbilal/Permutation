
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {

	public static void main(String[] args) 
		 {
			 RandomizedQueue <String> q1 = new RandomizedQueue<String>();
			 int k = Integer.parseInt(args[0]);
			   	while (!StdIn.isEmpty())
			   	{
			   	    q1.enqueue(StdIn.readString());
			   	}
			   	for (int i = 0; i < k; i++)
	             {
	                 StdOut.print(q1.dequeue() + "\n");
	             }
		 }
			 
		 

}
