public class QuickSort_Assign {
    public static void main(String[] args) {
        int[] ar = {5,7,8,3,2,1};
        int n = ar.length-1;
        int start=0;
;        int temp = 0;

        int pivot = ar[start];
        int i = start+1;
        for (int j = start+1; j <= n; j++) {
            if (ar[j] <= pivot) {

                temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++;
            }
        }
       //Swapping a[i] and a[0] to get pivot in the middle
        i=i-1;
        int temp1=ar[i];
        ar[i]=ar[0];
        ar[0]=temp1;
//System.out.println(pivot);

     //sorting array elements before pivot
    int p=0;
    for(int j=1;j<pivot;j++) {
        if(ar[p]>ar[j])
        {
            temp=ar[p];
            ar[p]=ar[j];
            ar[j]=temp;
        }
        p++;


    }
         //Sorting array elements after pivot
           //System.out.println(i);
        p=i+1;
        for(int j=p+1;j<ar.length;j++) {
            if(ar[p]>ar[j])
            {
                temp=ar[p];
                ar[p]=ar[j];
                ar[j]=temp;
            }
            p++;


        }





        for(int k=0;k<ar.length;k++)
        {
            System.out.println(ar[k]);
        }

    }
}
