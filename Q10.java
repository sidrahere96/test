public class Q10 {
    static void trickyPrint(int n) {
        if(n==0) return;
        trickyPrint(n-1);
        System.out.print(n+" ");
        trickyPrint(n-1);
    }
    public static void main(String[] args) {
        trickyPrint(3);
    }
}
