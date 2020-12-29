import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
	public static void main(String args[])throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in))
		int t = Integer.parseInt(read.readLine());
		
		while(t-- > 0)
		{
			int sizeOfArray = Integer.parseInt(read.readLine());
			String st[] = read.readLine().trim().split("\\s+");
			
			int arr[] = new int[sizeOfArray];
			for(int i=0;i<sizeOfArray;i++)
				arr[i] = Integer.parseInt(st[i]);
				
			int elementToSearch = Integer.parseInt(read.readLine());
			
			System.out.println(new LeftIndex().leftIndex(sizeOfArray, arr, elementToSearch));
		}
	}
}
class LeftIndex{ 

    static int leftIndex(int N, int arr[], int X)
    {
        for(int i=0;i<N;i++)
        {
            if(arr[i] == X)
            {
                return i;
            }
        }
        return -1;
    }
}
