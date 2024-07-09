public class Main 
{
    static void reverseNo(int a)
    {
        if(a<10)
        {
            System.out.print(a); 

        }
        else{
            System.out.print(a%10);
            reverseNo(a/10);
        }
        
    }
    public static void main(String[] args) {
        int a = 323432;
        Main.reverseNo(a);
    }
}
