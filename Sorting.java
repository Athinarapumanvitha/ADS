import java.util.* ;
public class Sorting{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in) ;
        int n ,i,pairs=0;
        n = sc.nextInt() ;
        int A[] = new int[n] ;
        for(i=0;i<n;i++)
            A[i] = sc.nextInt() ;
        Arrays.sort(A) ;
        for(i=0;i<n;i++)
            System.out.print(A[i] + " ") ;
        System.out.print("\n") ;
       for(i=0;i<n;i++)
       {
          int p=A[i];
          int q=A[i+1];
          if(p==q)
          {
              pairs++;
           }
       }
System.out.println(pairs);
    }
}
