import java.util.Scanner;

import java.util.Scanner;
public class Dup_Arr {
    public static void main(String[] args) {
       int []ar={5,8,2,9,5,8,1,7,2,1};
        int []a=new int[10];

        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j] || i==j)
                {
                    System.out.println("Duplicate value found"+ar[i]);




                }

            }

        }
//       for(int i=0;i<a.length;i++)
//        {
//            System.out.println("The duplicate values are "+a[i]);
//        }
    }
}
