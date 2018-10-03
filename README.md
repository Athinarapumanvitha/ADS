# ADS
class Quick 
{
     int[] id; 
    
  	Quick(int n) 
{
      id = new int[n];
      for (int i = 0; i<id.length; i++)
      id[i] = i;
System.out.print(i);
 }
 }
boolean find(int p, int q)
{
    System.out.println(id[p] == id[q]);
        return id[p] == id[q];
}
public void union(int p, int q) 
{
        int p= id[p];   
        int q = id[q];  
	for(int i = 0;i<id.length; i++)
{
		if(id[i]== p)
{
		id[i]=q;
 }
}
		public class Test
		{
    		public static void main(String[] args) 
		{
        	Quick  q= new Quick(10);
       	q.union(9,0);
		q.union(3,4);
		q.union(5,8);
		q.union(7,2);
		q.union(2,1);
		q.union(5,7);
		q.union(0,3);
		q.union(4,2);
		q.find(3,6);
		q.find(4,5);

}
}
