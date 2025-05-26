package PATTERN_PRINTING;

public class PrintNumber_3 {
    public PrintNumber_3 (int n ){
        for(int i =0; i<n; i++){
            for(int j=0 ; j<i; j++){
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        new PrintNumber_3(5);
    }
}
