public class InsertionSort {


    public static int[] InsertionSort(int[] ar){

        if (ar.length<=1) return ar;

        //i = sorted part;
        for (int i = 1; i < ar.length; i++)
        {

            int y=i;
            while (y>0 && ar[y-1] > ar[y])
            {
                //swap
                int temp = ar[y-1];
                ar[y-1] = ar[y];
                ar[y] = temp;
                y--;
            }

        }
        return  ar;
    }

    public static void main(String[] args) {
        int[] ar = {43,5,3,7,5,6,8,9,3,2,1};

        int[] sortedAr = InsertionSort(ar);

        for (int i = 0; i< sortedAr.length; i++)
        {
            System.out.print(sortedAr[i] + " ");
        }
    }



}
