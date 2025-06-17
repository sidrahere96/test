public class Q9 {
    static int oddEvenRec(int n) {
        if(n==0) return 0;
        if(n%2 == 0) 
            return oddEvenRec(n-1)-1;
        else 
            return oddEvenRec(n-1)+1;
    }
    public static void main(String[] args) {
        System.out.print(oddEvenRec(5));
    }
}
