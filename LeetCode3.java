class LeetCode3
 {
    public static void main(String[] args)
	{
        int[] x = {0, 1, 1, 2, 2, 3, 3, 3, 4, 4};
        int length = duplicate(x);

        System.out.println(""+ length);
		
        System.out.print("elements are => ");
		
        for (int i = 0; i < length; i++) 
		{
            System.out.print(x[i] + " ");
        }
    }

    public static int duplicate(int[] nums) 
	{
        if (nums.length == 0) return 0;

        int j = 0;

        for (int i = 1; i < nums.length; i++) 
		{
            if (nums[j] != nums[i]) 
			{
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
