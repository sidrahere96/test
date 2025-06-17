public class Q2 {
    public static void mystery(int n) {
        if(n<=0) return;
        mystery(n-1);
        System.out.print(n+" ");
        mystery(n-2);
    }
    
    public static void main(String[] args) {
        mystery(3);
    }
}
