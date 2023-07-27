public class MaxDiffBtwAnyAdjacentIndexInAnArray {
    public static void main(String args[])
    {
      int[] input = {93,60,120,988,999};
      int[] diffArray = new int[input.length-1];
      int output = diffBtwAnyAdjacentIndexInAnArray(input);
      System.out.println(output);
    }
    public static int diffBtwAnyAdjacentIndexInAnArray(int[] input)
    {
        int result=0;
        for(int i=0;i<input.length;i++)
        {
            for(int j=i+1;j<input.length;j++)
            {
                result = input[j]-input[i];
                break;
            }
        }
//        for(int i=0;i<=input.length-1;i++)
//        {
//          int diffArray[i] = result;
//        }
        return result;
    }
}
