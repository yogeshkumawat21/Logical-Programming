1 .binary to decimal------                   ????


import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int bin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in binary");
        bin=sc.nextInt();
        int temp = bin;
        int digits=0;
        while (temp!=0){
            temp = temp/10;
            digits++;
        }
        int decimal=0;
        for(int i =0;i<digits;i++){

            decimal= (int) (decimal+bin%10*Math.pow(2,i));
            bin=bin/10;
        }

        System.out.println("In decimal system :"+decimal);

    }}


**************************************************************************************************************



1       1
12     21 
123   321
1234 4321
123454321

soln :------ 

public class Pattern1 {
    public static void main(String[] args) {

        int n=5;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                if(j==5){
                    continue;
                }
                System.out.print(j);
            }

            System.out.println();
        }


    }
}

***********************************************************************************************



3.
 array element shifting arr{1,2,3,4,5,6,7,8,9,10} to arr{5,6,7,8,9,10,1,2,3,4}            ??



import java.util.Scanner;

public class ShiftingArray {

    public static void main(String[] args) {

        int []arr = {1,2,3,4,5,6,7,8,9,10};
        int n;
        System.out.println("Enter a number to shift array elements :");
         n = new Scanner(System.in).nextInt();
        for(int i=0; i<n;i++){
            int temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}



*******************************************************************************************************



4. Series printing --------------               ??




import java.util.Scanner;

public class SeriesPrint {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number ");
        n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.print(" "+(int)(i*i*i+1));
        }
    }
}


********************************************************************************************************


  



5. 
 1 2 3 4 5 4 3 2 1
   1 2 3 4 3 2 1 
     1 2 3 2 1 
       1 2 1 
         1





public class Pettern2 {

    public static void main(String[] args) {


        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }


    }

}


*************************************************************************************************


6.armstrong number without using any predefine function
                                                                                  ??

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter a number");
        n=new Scanner(System.in).nextInt();

        int digits=0;
        int temp=n;
        while (temp!=0){
            temp=temp/10;
           digits++;
        }

        int arm=0;
        temp=n;
        while (temp!=0){

            arm=arm+pow(temp%10,digits);
            temp=temp/10;
        }

        if(arm==n){
            System.out.println("number is armstrong ");
        }
        else {
            System.out.println("number is not armstrong");
        }

    }

    static int pow(int rem,int digits){
        int res=1;
        for(int i=1;i<=digits;i++){
            res=res*rem;
        }

        return res;
    }
}



*****************************************************************************************************************

7. Transpose of a diagonal  matrix                                      ???


                   
public class MatrixTranspose {

    public static void main(String[] args) {   
        int  [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matrix before Transpose :");        ////////////for diagonal matrix
        for(int i=0; i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("After transpose ");

        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                int temp=arr[i][j];
                if(i!=j&& i<j){
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }

        for(int i=0; i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

}

********************************************************************************************************************

Remove duplicates from sorted array without using another array

public class RemoveDuplicate {

        public static void main (String[] args) { ///////////for sorted array
            int array[] = {1,2,2,3,4,4,4,5};
            int length = array.length;

            int j = 0;//for next element
            for (int i=0; i < length-1; i++){
                if (array[i] != array[i+1]){
                    array[j] = array[i];
                    j++;
                }
            }
            array[j++] = array[length-1];

            length = j;
           //printing array elements
            for(int i=0; i<length; i++)
                System.out.print(array[i]+" ");

        }
}


**********************************************************************************************************************




List methods                                                                        ??

import java.util.ArrayList;
import java.util.Iterator;

public class Colllection1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();///////////Creating a list
        list.add("Rahul");
        list.add("Gourav");
        list.add("Rajesh");
        list.add("Ajay");

       /* Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/


        /*for (var v :list){
            System.out.println(v);
        }*/

        //list.remove(3);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Ajay");
        list1.add("Gourav");

        list.removeAll(list1);

        list.set(1,"Vijay");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
