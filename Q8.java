public class Q8 {
    static int weird(int a,int b) {
        if(b==0) return 0;
        return (b%2==0)?weird(a+a, b/2):weird(a+a, b/2)+a;
    }

    public static void main(String[] args) {
        System.out.print(weird(3, 5));
    }
}
