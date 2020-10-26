class Reverse{
    
    // Function to reverse array in group of k 
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        // add your code here
        int l,r;
        for(int i=0;i<n;i=i+k)
        {
            l = i;
            if(n-1<i+k-1)
            {
                r = n-1;
            }
            else
            {
                r = i+k-1;
            }
            while(l<r)
            {
                Collections.swap(mv,l,r);
                l++;
                r--;
            }
        }
        return mv;
    }
    
}
