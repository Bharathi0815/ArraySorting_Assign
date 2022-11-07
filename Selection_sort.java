public class Selection_sort {

    public static void main(String[] args) {

        int []ar={8,6,9,5,4,7};
        int temp=0;
        int min_indx;
             for(int i=0;i<=ar.length-1;i++) {
                 min_indx = i;
                 for (int j = i + 1; j < ar.length; j++) {
                     if (ar[min_indx] > ar[j])
                         min_indx = j;



                 }
                 //System.out.println(min_indx);
                 temp = ar[min_indx];
                 ar[min_indx] = ar[i];
                 ar[i] = temp;
             }

       for(int k=0;k<=ar.length-1;k++)
       System.out.println(ar[k]);
    }
}
