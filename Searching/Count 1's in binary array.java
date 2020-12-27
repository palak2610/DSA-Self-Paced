import java.io.*;
import java.util.*;
import java.lang.*;

class Arrays {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Ones obj = new Ones();
            System.out.println(obj.countOnes(arr,n));
        }
    }
}
class Ones{
    
    public static int countOnes(int arr[], int n){
        
        int low = 0, high = n-1;
        int mid = (low+high)/2;
        while(low <= high){
            mid = (low + high)/2;
            if(arr[mid] == 1 && mid+1 < n && arr[mid+1] == 1){
                low = mid+1;
            }
            else if(arr[mid] == 0){
                high = mid-1;
            }
            else if(arr[mid] == 1 && ((mid+1 < n && arr[mid+1] == 0) || (mid == n-1))){
                return mid+1;
            }
        }
        return 0;
    }
}
