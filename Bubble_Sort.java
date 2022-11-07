public class Bubble_Sort {
    public static void main(String[] args) {
        int []ar={9,4,7,2,3,1,8,5};
        int temp=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=1;j<ar.length;j++)
            {
                if(ar[j]<ar[j-1])
                {
                    temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
            }
        }
     for(int i=0;i<ar.length;i++)
     {
        System.out.println(ar[i]);
     }
    }

    }



