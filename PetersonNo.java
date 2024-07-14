public class Main
{
    static boolean test(int num)
    {
        int temp =num;
        int sum =0;
        while(temp>0)
        {
           int rem =temp%10;
           temp=temp/10;
           sum+=factorial(rem);
        }
        if(sum==num)
        {
            return true;
        }
        return false;
    }
    static int factorial(int num)
    {
        
        
        if(num==1)
        {
            return 1;
        }
        else
        {
            return num*(factorial(num-1));
        }
        
    }
    public static void main(String[] args) {
        int num=145;
        System.out.println(test(num));
     
    }
}
