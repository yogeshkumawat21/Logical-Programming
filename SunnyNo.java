public class Main
{
    static boolean test(int num)
    {
        num+=1;
        int temp =0;
        while(temp*temp<num)
        {
            temp++;
        }
         return (temp*temp==num);
        
       
    }
   
    
    public static void main(String[] args) {
        int num=8;
        System.out.println(test(num));
     
    }
}
