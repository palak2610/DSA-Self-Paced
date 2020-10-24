class StrongestNeighbour{
    
    // Function to find maximum of all adjacents
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
         StringBuffer sb = new StringBuffer();
         for(int i=0;i<sizeOfArray-1;i++)
         {
             sb.append(Math.max(arr[i], arr[i+1]) + " ");
         }
        System.out.print(sb.toString());
        
    }
}
