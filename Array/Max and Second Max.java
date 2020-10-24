class ArrayMax{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0;i<sizeOfArray; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max){
                max2 = arr[i];
            }
        }
        if(max2 == Integer.MIN_VALUE){
            max2 = -1;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(max);
        res.add(max2);
        return res;
    }
}
