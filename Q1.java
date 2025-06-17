class Q1{
    public static int specialAdd(int a){
        if(a!=0)
            return (a+2)+specialAdd(a-1);
        else 
            return 3;
    }

    public static int extraordinaryAdd(int b) {
        if(b!=0)
            return specialAdd(b)+extraordinaryAdd(b-1);
        else    return 0;
    }

    public static void main(String[] args){
        System.out.print(extraordinaryAdd(5));
    }
}