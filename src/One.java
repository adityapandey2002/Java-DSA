public class One{

    public static int sum(int a, int b) {
        return (a + b);
    }


    public static void main(String[] args) {
        One one1 = new One() ;
        int res;
        res = sum(2, 4);
        System.out.println(res);
    }

}