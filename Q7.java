public class Q7 {
    static void recurse(int n) {
        if(n==0) return;
        System.out.print(n+" ");
        if(n%2==0) recurse(n-2);
        else  recurse(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        recurse(4);
    }
}
