public class Q6 {
    static int mystery(int n) {
        if(n==0) return 1;
        return n*mystery(n-1)+mystery(n-1);
    }
    public static void main(String[] args) {
        System.out.println(mystery(3));
    }
}
