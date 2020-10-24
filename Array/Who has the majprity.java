class Majority
{
    //Complete this function, Geeks
    public int majorityWins(int a[],int n,int x,int y)
    {
            int count_x=0;//counter to count frequency of x
            int count_y=0;//counter to count frequency of y

        /******************************************
            Your code goes here, Geeks
          *******************************************/
        for(int i=0;i<n;i++)
        {
            if(a[i] == x)
            {
                count_x++;
            }
            else if (a[i] == y)
            {
                count_y++;
            }
        }
        if (count_x > count_y)
            /*Code here*/
            return x;
        else if (count_y > count_x)
            /*Code here*/
            return y;
        else if(count_x==count_y)
        {
            if(x<y)
                return x;
        }
        
        return y;    /*Code here*/
    }
}
