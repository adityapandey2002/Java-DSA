package PATTERN_PRINTING;

public class PrintNumber_1 {
    public PrintNumber_1(int n ) {
        for(int i=0; i<n; i++){
            for (int j= 0 ;j <n; j++){
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        new PrintNumber_1(4);
    }


}
