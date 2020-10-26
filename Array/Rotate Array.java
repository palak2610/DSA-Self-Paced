class Solution
{
    static void rotateArr(int arr[], int D, int N)
    {
        // add your code here
        int[] temp = new int[N];
        for(int i = 0;i < D;i++)
        {
            temp[i] = arr[i];
        }
        for (int j = D;j < N;j++) 
        {
            arr[j - D] = arr[j];
        }
        for (int i = 0;i < D;i++) 
        {
            arr[N-D +i] = temp[i];
        }
    }
}
