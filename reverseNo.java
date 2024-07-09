public class Main 
{
    static void reverseNo(int a)
    {
        int reverse =0;
        while(a>0)
        {
            int rem = a%10;
            reverse=reverse*10+rem;
            a=a/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        int a = 323432;
        Main.reverseNo(a);
    }
}
