package Neetcode150;

import java.util.HashSet;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {


        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        ContainsDuplicate217 cd = new ContainsDuplicate217();
        boolean result = cd.containsDuplicate(nums);
        if (result) {
            System.out.println("Duplicate Found");
        } else {
            System.out.println("No Duplicate Found");
        }
    }
}
