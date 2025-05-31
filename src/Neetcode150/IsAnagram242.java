package Neetcode150;

public class IsAnagram242  {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }


        int [] arr = new int[26];

        for(int i=0; i<s.length() ; i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int i: arr){
            if(i != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "anaggam";
        String t = "nagaram";
        IsAnagram242 ia = new IsAnagram242();
        boolean result = ia.isAnagram(s, t);
        if(result){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
