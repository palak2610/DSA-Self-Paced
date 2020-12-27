import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
  public static void main(String args[])throws IOException
  {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while(t-- > 0)
    {
	  String str[] = read.readLine().trim().split("\\s+");
	  
      int sizeOfArray = Integer.parseInt(read.readLine());
      int arr[] = new int[sizeOfArray];
      
      String str[] = read.readLine().trim().split("\\s+");
      for(int i=0;i<sizeOfArray;i++)
        arr[i] = Integer.parseInt(st[i]);
       SearchElement obj = new SearchElement ();
       System.out.println(obj.searchInSorted(arr, n, k));
     }
   }
}
class SearchElement{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int low=0, high=N-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==K)
            {
                return 1;
            }
            else if(arr[mid]>K)
            {
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
        
    }
}
