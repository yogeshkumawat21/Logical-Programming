public class Main
{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[]= new int[a.length];
         b=a;
         b[0]=20;
         for(int i =0;i<a.length;i++)
         {
            System.out.println(a[i]+""+b[i]);
         }
        
    }
}
