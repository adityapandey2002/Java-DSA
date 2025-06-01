package Neetcode150;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public int[] twoSum(int[] nums , int target){
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(hashMap.containsKey(complement)){
                return new int[]{ hashMap.get(complement) , i};
            }
            hashMap.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum1 ts = new TwoSum1();
        int[] res = ts.twoSum(nums, target);
        for(int re : res){
            System.out.println(re);
        }
    }
}
