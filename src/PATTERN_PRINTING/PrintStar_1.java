package PATTERN_PRINTING;

public class PrintStar_1 {
    public PrintStar_1(int n){
        for(int i=0 ; i<n; i++){
            for(int j=0 ; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        new PrintStar_1(4);
    }
}
