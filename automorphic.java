public class Main
{
    static boolean test(int num)
    {
        
        int square = num*num;
       while(num>0)
       {
        int tempa = num%10;
        int tempb = square%10;
        if(tempa!=tempb)
        {
            return false;
        }
        num=num/10;
        square=square/10;
       }
        return true;
    }
    public static void main(String[] args) {
        int num=76;
     System.out.println(   test(num));
    }
}
