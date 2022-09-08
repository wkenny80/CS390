public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Hashtable hm = new Hashtable();
        for (int i = 0; i < nums.Count(); i++)
        {
            if (!hm.ContainsKey(nums[i]))
                hm.Add(nums[i], i);
            
            int compliment = target - nums[i];
            if (hm.ContainsKey(compliment) && (int)hm[compliment] != i)
                return new int[] { (int)hm[compliment], i };
        }
        
        throw new ArgumentException("No two sum found");
    }
}