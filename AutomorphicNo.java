public class Main 
{
    static void program( int n)
    {
        int temp = n;
        n=n*n;
        String input = Integer.toString(n);
        String output = Integer.toString(temp);
        if(input.endsWith(output))
        {
            System.out.println("it is automorphic no");
        }
        else
        {
            System.out.println("No it is not automorphic no");
        }
    }
    public static void main(String[] args) {
        int n=76;

        Main.program(n);
    }
}
