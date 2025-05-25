public class palindrone {
    public boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 12321;
        palindrone p1 = new palindrone();
        boolean result = p1.isPalindrome(num);
        System.out.println(result);
    }
}