
class romanToInt {
    public int romanToInteger(String s){

        int result = 0;
        int prevValue= 0;
        for( int i = s.length()-1 ; i>=0; i--){
            char c = s.charAt(i);
            int currentValue = getValue(c);

            if(currentValue < prevValue){
                result -= currentValue;

            }else {
                result += currentValue;
            }

            prevValue = currentValue;
        }
        return result;
    }

    private int getValue(char c ){
        if(c=='I') return 1;
        if(c=='V') return 5;
        if(c=='X') return 10;
        if(c=='L') return 50;
        if(c=='C') return 100;
        if(c=='D') return 500;
        if(c=='M') return 1000;
        return 0;
    }


    public static void main(String[] args){
        romanToInt r1 = new romanToInt() ;
        int result = r1.romanToInteger("XIX");
        System.out.println(result);
    }
}