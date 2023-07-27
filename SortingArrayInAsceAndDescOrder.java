public class SortingArrayInAsceAndDescOrder {
    public static void main(String args[])
    {
        int inputArray[ ] = {34,2,12,87,22,11};
        sortingArrayInAscendingOrder(inputArray);
        System.out.println(" ");
        sortingArrayInDescendingOrder(inputArray);

    }
    static void sortingArrayInAscendingOrder(int[] array)
    {
        for(int i=0;i<=array.length-1;i++)
        {
            for(int j=i+1;j<=array.length-1;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+"  ");
        }

       //return result;
    }


    static void sortingArrayInDescendingOrder(int[] array)
    {
        for(int i=0;i<=array.length-1;i++)
        {
            for(int j=i+1;j<=array.length-1;j++)
            {
                if(array[i]<array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(+array[i]+"  ");
        }
    }
}
