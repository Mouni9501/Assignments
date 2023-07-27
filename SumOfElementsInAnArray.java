public class SumOfElementsInAnArray {
    public static void main(String args[])
    {
        int[] inputArray = {3,9,12,67};
        sumOfElements(inputArray);
    }
    static void sumOfElements(int[] inputArray)
    {
        int sum=0;
        for(int i=0;i<inputArray.length;i++)
        {
            sum = sum+inputArray[i];
//            int result = sum+inputArray[i];
//            sum = result;
        }
        System.out.println(sum);
    }
}
