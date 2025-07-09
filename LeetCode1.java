class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int i,j;
        for(i=0;i<nums.length;i++)
        {
          for(j=i+1;j<nums.length;j++)
          {
            if(nums[i]+nums[j]==target)
            {
             return new int[] {i,j};
            }

          }
        }
       return new int[] {}; 
    }
}

class LeetCode1
{
public static void main(String ar[])
{
	Solution s1=new Solution();

int target=8;
int x[]={2,4,6,7,89};

        int[] result = s1.twoSum(x, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found with the given target.");
        }
}
}