//Random no Generate ?
import java.util.*;
public class Main 
{
    public static void main (String[] args) {
        int a= (int)(Math.random()*(100-50+1))+50;
        System.out.print(a);
    }
}


// Random no Generate with random class ?

import java.util.*;
public class Main 
{
    public static void main (String[] args) {
       Random a = new Random();
       int x = a.nextDouble(50);
       System.out.print(x);
    }
}
	
