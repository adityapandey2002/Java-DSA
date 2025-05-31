

class Pattern132 {
    public static boolean find132pattern(int[] nums) {
        for(int i = 0; i <= nums.length - 3; i++) {  // Ensuring valid indexing
            if(nums[i] < nums[i+1] && nums[i+1] > nums[i+2] && nums[i] < nums[i+2]) {
                return true;
            }
        }
        return false;  // Return false only after the loop completes
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2};
        boolean ans = find132pattern(nums);
        System.out.println(ans);
    }
}
