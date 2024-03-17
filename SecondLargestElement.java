import java.util.*;

class SecondLargestElement
{
    int print2largest(int[] arr,int n)
    { 
    
    if(n<=1)
    {
        return -1;
    }

    Arrays.sort(arr,0,n);

    int largest = arr[n-1]; 
    
    for(int i=n-2; i>=0;i--)
    {
        if(arr[i]<=largest)
        {
            return arr[i];
        }
    }

    return -1;

    }   

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        SecondLargestElement sle = new SecondLargestElement();
        int result = sle.print2largest(arr, n);
        System.out.println(result);
    }
}