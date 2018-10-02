public class Solution 
{
    public int threeSumClosest(ArrayList<Integer> A, int B) 
    {
        int returnValue =0;
        int temp=Integer.MAX_VALUE;
        Collections.sort(A);
        for(int i=0;i<A.size()-2;i++)
        {
            int j=i+1;
            int k=A.size()-1;
            while(j < k)
            {
                int sum =A.get(i)+A.get(j)+A.get(k);
                if(Math.abs(sum-B)<temp)
                {
                     returnValue =sum;
                     temp =Math.abs(sum-B);
                }
                if(sum > B)
                    k--;
                else
                    j++;
                    
            }
        }
        return returnValue;
    }
}
