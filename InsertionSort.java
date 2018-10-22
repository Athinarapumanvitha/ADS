class InsertionSort 
{ 
    void sort(int a[]) 
    { 
        int N = a.length; 
        for (int i=1; i<N; i++) 
        { 
            int index= a[i]; 
            int j = i; 
            while (j>0 && a[j-1] > index) 
            { 
                a[j] = a[j-1]; 
                j--; 
            } 
            a[j] = index; 
        } 
    } 
   static void printArray(int a[]) 
    { 
        int N = a.length; 
        for (int i=0; i<N; ++i) 
            System.out.print(a[i] + " "); 
  
        System.out.println(); 
    } 

    
    public static void main(String args[]) 
    {         
        int a[] = {3,6,4,2,1,0}; 
  
        InsertionSort ob = new InsertionSort();         
        ob.sort(a); 
          
        printArray(a); 
    } 
} 