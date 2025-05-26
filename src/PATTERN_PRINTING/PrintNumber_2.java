package PATTERN_PRINTING;

public class PrintNumber_2 {
    public PrintNumber_2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print((i+1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        new PrintNumber_2(5);
    }


}
