public class PRINT_FIBO_SERIES_RECURSION {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 10;
        System.out.print(a + " " + b + " ");
        fibo(a,b,n-2);
    }
    public static void fibo(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println((a+b)+" ");
        fibo(b,(a+b),--n);
    }
}
